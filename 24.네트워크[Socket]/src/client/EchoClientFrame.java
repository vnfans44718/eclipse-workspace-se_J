package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EchoClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField echoTextField;
	private JScrollPane scrollPane;
	private JTextArea displayTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EchoClientFrame frame = new EchoClientFrame();
					frame.setVisible(true);
					frame.echoTextField.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EchoClientFrame() {
		setTitle("EchoClientFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		echoTextField = new JTextField();
		echoTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			//이벤트가 발생하는 순간 연결이 됨
			//버튼 클릭 후 socket 열고 쓰기를 전송
			
			{

				try {

					String echoString = echoTextField.getText();
					//내가 쓴 텍스트를 String으로 저장
					if (echoString.trim().equals("")) {
						echoTextField.requestFocus();
						return;
					}

					echoTextField.setText("");
					echoTextField.requestFocus();
					/*
					 * 1. Socket 생성
					 */

					Socket socket = new Socket("192.168.15.19", 9999);
					//강사님 Socket에 연결한 내 Socket
					/*
					 * 2. 강사님 서버로 문자데이터 쓰기
					 * - OutputStream 얻기
					 * - OutputStream(byte)--> 
					 * -->Writer 로 변경(OutputStreamWriter)
					 * --> PrintWriter로 변경(PrintWriter)
					 */

					OutputStream out = socket.getOutputStream();
					//데이터를 전송하기 위해서 출력 stream을 생성
					
					//내 socket의 outputStrem을 대입
					OutputStreamWriter osw = new OutputStreamWriter(out);
					PrintWriter pw = new PrintWriter(osw);
					//bufferedwriter로 해도 상관없음 종결어미 \n 붙여줘야함
					pw.println(echoString);
					pw.flush();
					// 하지 않으면 무한 대기하면서 뻗음
					/*
					  3. 서버에서 전송되는 데이터 읽기
					  - InputStream 얻기
					  - InputStream(byte) --> InputStreamReader --> BufferedReader
					 */
					
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()) );
					//BufferedReader 가 string으로 반환
					//자바는 데이터를 무조건 stream으로 읽고 씀
					//socket이 데이터의 소스
					String serverEchoString = br.readLine();
					displayTextArea.append(serverEchoString+"\n");
					pw.close();
					br.close();
					socket.close();
					

				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}

			}
		});
		contentPane.add(echoTextField, BorderLayout.SOUTH);
		echoTextField.setColumns(10);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTextArea = new JTextArea();
		displayTextArea.setEditable(false);
		scrollPane.setViewportView(displayTextArea);
	}

}
