package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTextField;
	private JTextArea chatTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ChatJFrame frame = new ChatJFrame();
		frame.setVisible(true);
		frame.chatTextField.setColumns(17);

	}

	/**
	 * Create the frame.
	 */
	public ChatJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChatJFrame.class.getResource("/image/pngwing.com (2).png")));
		setTitle("채팅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(0, 191, 255));
		contentPane.add(southPanel, BorderLayout.SOUTH);

		chatTextField = new JTextField();
		chatTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * TextField enter key press
				 * 포커스가 있는 상태에서 enter key 누를 때 이벤트 발생
				 */
				String sendMessage = chatTextField.getText();
				if (sendMessage.trim().equals("")) {
					chatTextField.setText("");
					chatTextField.requestFocus();

					return;
				}
				chatTextField.setText("");
				chatTextArea.append("김경호 :" + sendMessage + "\n");

			}
		});
		southPanel.add(chatTextField);
		chatTextField.setColumns(17);

		JButton chatSendButton = new JButton("전송");
		chatSendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 전송버튼클릭
				 */
				String sendMessage = chatTextField.getText();
				chatTextField.setText("");
				chatTextArea.append("김경호 :" + sendMessage + "\n");
				chatTextField.requestFocus();
			}
		});
		southPanel.add(chatSendButton);

		JLabel chatLabel = new JLabel("오픈채팅");
		chatLabel.setIcon(new ImageIcon(ChatJFrame.class.getResource("/image/pngwing.com (1).png")));
		chatLabel.setFont(new Font("돋움", Font.BOLD, 14));
		chatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(chatLabel, BorderLayout.NORTH);

		chatTextArea = new JTextArea();
		chatTextArea.setEditable(false);
		chatTextArea.setText("이효리 : 이따 만나\r\n김경호 : 나 바빠\n");
		contentPane.add(chatTextArea, BorderLayout.CENTER);

	}

}
