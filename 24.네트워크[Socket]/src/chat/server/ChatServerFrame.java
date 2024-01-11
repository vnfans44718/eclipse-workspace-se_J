package chat.server;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChatServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField noticeTF;
	private JTextArea displayTA;

	/****** 접속된클라이어트객체(Socket)를 보관할서비스객체 ****/
	private ServerClientService clientService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChatServerFrame frame = new ChatServerFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChatServerFrame() {
		setAlwaysOnTop(true);
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 연결된모든클라이언트에게 공지사항전송
				 */
				String noticeString = noticeTF.getText();
				noticeTF.setText("");

				if (noticeString.trim().equals("")) {
					noticeTF.setText("");
					noticeTF.requestFocus();
					return;
				}
				clientService.sendBroadCasting("[서버공지]" + noticeString);

			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(45);

		JButton noticeB = new JButton("공지");
		noticeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 연결된모든클라이언트에게 공지사항전송
				 */
				String noticeString = noticeTF.getText();
				noticeTF.setText("");

				if (noticeString.trim().equals("")) {
					noticeTF.setText("");
					noticeTF.requestFocus();
					return;
				}
				clientService.sendBroadCasting("[서버공지]" + noticeString);
//클라이언트서비스 객체로 공지 출력
			}
		});
		panel.add(noticeB);

		/***** 접속된클라이어트객체를 보관할 ServerClientService객체생성 *****************/

		clientService = new ServerClientService();

		/***** 클라이언트의 소켓연결요청을 처리 ChatServerThread 객체생성 쓰레드start **/
		ChatServerThread chatServerThread = new ChatServerThread();
		chatServerThread.start();

	}// 생성자

	private void setLog(String log) {
		displayTA.append(log + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/***********************************************
	 * 특정포트를 열고 클라이언트의 소켓연결요청을 처리해서 소켓을생성하는클래스
	 ***********************************************/
	/*
	 setLog("0.ChatServerThread:8888번포트에 ServerSocket생성");
	 setLog("1.ChatServerThread:클라이어트소켓연결요청대기");
	 setLog("2.ChatServerThread:접속클라이언트:"+socket);
	 setLog("3.ChatServerThread:ClientService 객체에 ServerClientThread객체추가 쓰레드start");
	 */

	public class ChatServerThread extends Thread
	// 소켓 연결 삭제 관련 스레드
	{
		@Override
		public void run() {
			try {

				setLog("0.ChatServerThread:8888번포트에 ServerSocket생성");
				ServerSocket serverSocket = new ServerSocket(8888);
				while (true) {
					setLog("1.ChatServerThread:클라이어트소켓연결요청대기");
					Socket socket = serverSocket.accept();
					setLog("2.ChatServerThread:접속클라이언트:" + socket);
					setLog("3.ChatServerThread:ClientService 객체에 ServerClientThread객체추가 쓰레드start");
					ServerClient client = new ServerClient(socket);
					client.start();
					// 클라이언트클라이언트가 나가면 소켓을 포함한 객체를 삭제해야험
					clientService.addClient(client);
					setLog("");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}

	/********************************************
	 * 서버쪽소켓을 사용하여 클라이언트와 통신을 담당하는 클래스(VO) - 한명의 클라이언트와통신을 담당하는 클래스 - 클라이언트와연결된 서버쪽
	 * 소켓1개를 가지고있는클래스 - 클라이언트의 정보(아이디)를 가지고있는 클래스 - 클라이언트당 1개의객체가생성
	 ********************************************/

	public class ServerClient extends Thread
	// 입출력 스트림은 클라이언트가 가지고 있음
	{
		private String userID;
		private Socket socket;// 서버쪽 소켓
		private PrintWriter out;
		private BufferedReader in;

		public ServerClient(Socket socket) throws Exception {
			this.socket = socket;
			this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.userID = socket.getInetAddress().getHostAddress() + "[" + socket.getPort() + "]";
		}

		/*
		 * 클라이언트에서 보내는 데이터를 읽기 
		 */
		@Override
		public void run() {
			while (true) {
				try {
					setLog("가. ServerClient :" + this.userID + "로 부터 읽기 위한 스레드 대기");
					String chatString = in.readLine();
					setLog("나. ServerClient :" + this.userID + "로 부터 읽은 데이터 :" + chatString);
					setLog("다. ServerClient : 연결된 모든 클라이언트에게 읽은 데이터 전송");
					clientService.sendBroadCasting(chatString);
                    // 무한대기
					
				} catch (Exception e) {
					clientService.removeClient(this);
				}
			}
		}

		/*
		 * 서버에서 클라이언트로 데이터 전송
		 */
		public void send(String message) {
			out.println(message);
			out.flush();
		}

		public String getUserID() {
			return userID;
		}

		public void setUserID(String userID) {
			this.userID = userID;
		}

		public Socket getSocket() {
			return socket;
		}

		public void setSocket(Socket socket) {
			this.socket = socket;
		}

	}

	/************************************
	 * 서버에연결된 클라이언트객체들을관리(Service)할클래스 - 클라이언트객체 추가 - 클라이언트객체 찾기 - 클라이언트객체 삭제 - 모든
	 * 클라이언트객체에 데이타전송
	 ************************************/

	public class ServerClientService
	// 서버클라이언트를 관리하기 위한 서비스 클래스
	{
		private List<ServerClient> clientList;

		public ServerClientService() {
			clientList = new ArrayList<ServerClient>();

		}

		public void addClient(ServerClient client) {

			clientList.add(client);
			sendBroadCasting(client.getUserID() + "님 입장");
			setLog("A.ServerClientService" + client.userID + "님 입장");
			setLog("B.ServerClientService" + clientList.size() + "명");

		}

		public void removeClient(ServerClient client) {
			clientList.remove(client);
			sendBroadCasting(client.getUserID() + "님 퇴장");
			setLog("A.ServerClientService" + client.userID + "님 퇴장");
			setLog("B.ServerClientService" + clientList.size() + "명");

		}

		/*
		 * 모든 client의 메시지 전송
		 */

		public void sendBroadCasting(String message) {
			for (ServerClient client : clientList) {
				client.send(message);
			}
		}

	}

}