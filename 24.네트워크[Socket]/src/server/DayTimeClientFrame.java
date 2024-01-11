package server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JLabel timeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton requestServerTimeButton = new JButton("서버 시간 요청");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					/*
					 * 1.socket 생성
					 */
					Socket socket = new Socket("192.168.15.19", 8000);
					System.out.println("client socket" + socket);
					/*
					 * 2.socket으로부터 InputStream 얻기
					 */
					InputStream in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in);
					BufferedReader br = new BufferedReader(isr);
					
					String serverTime = br.readLine();
					// 라인종결자가 있어야함 readLine으로 종결어미를 만들어줌
					timeDisplayLabel.setText(serverTime);
					br.close();
					socket.close();

				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}

			}
		});
		contentPane.add(requestServerTimeButton, BorderLayout.SOUTH);

		timeDisplayLabel = new JLabel("12:00");
		timeDisplayLabel.setForeground(Color.RED);
		timeDisplayLabel.setFont(new Font("굴림", Font.BOLD, 25));
		timeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(timeDisplayLabel, BorderLayout.CENTER);
	}

}
