package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class ChatJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatJFrame frame = new ChatJFrame();
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
	public ChatJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ChatJFrame.class.getResource("/image/pngwing.com (2).png")));
		setTitle("채팅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(0, 191, 255));
		contentPane.add(southPanel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		southPanel.add(textField);
		textField.setColumns(16);
		
		JButton chatSendButton = new JButton("전송");
		southPanel.add(chatSendButton);
		
		JLabel chatLabel = new JLabel("오픈채팅");
		chatLabel.setIcon(new ImageIcon(ChatJFrame.class.getResource("/image/pngwing.com (1).png")));
		chatLabel.setFont(new Font("돋움", Font.BOLD, 14));
		chatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(chatLabel, BorderLayout.NORTH);
		
		JTextArea chatTextArea = new JTextArea();
		chatTextArea.setEditable(false);
		chatTextArea.setText("이효리 : 이따 만나\r\n김경호 : 나 바빠");
		contentPane.add(chatTextArea, BorderLayout.CENTER);
	}

}
