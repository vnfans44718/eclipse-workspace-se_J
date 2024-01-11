package basic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class ChildJFrameWB extends JFrame {

	private JPanel contentPane;
	private JButton joinButton;
	private JButton loginButton;
	private JTextField idTextField;
	private JTextField passTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ChildJFrameWB frame = new ChildJFrameWB();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public ChildJFrameWB() {
		setTitle("나의첫번째윈도우빌더프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		loginButton = new JButton("로그인");
		loginButton.setBounds(105, 256, 97, 23);
		contentPane.add(loginButton);
		
		joinButton = new JButton("회원가입");
		joinButton.setBounds(323, 256, 97, 23);
		contentPane.add(joinButton);
		
		idTextField = new JTextField();
		idTextField.setBounds(288, 112, 132, 21);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		passTextField = new JTextField();
		passTextField.setBounds(288, 176, 132, 21);
		contentPane.add(passTextField);
		passTextField.setColumns(10);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		idLabel.setForeground(new Color(0, 0, 0));
		idLabel.setBounds(105, 115, 57, 15);
		contentPane.add(idLabel);
		
		JLabel passLabel = new JLabel("패스워드");
		passLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passLabel.setForeground(new Color(0, 0, 0));
		passLabel.setBounds(105, 179, 97, 42);
		contentPane.add(passLabel);
	}
}
