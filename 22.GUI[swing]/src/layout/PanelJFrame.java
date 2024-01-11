package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class PanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelJFrame frame = new PanelJFrame();
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
	public PanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 255));
		contentPane.add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton_4 = new JButton("검색");
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("회원가입");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("로그인");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원리스트");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원삭제");
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("회원리스트");
		panel_2.add(lblNewLabel, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setBackground(new Color(220, 220, 220));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "이소라", "이효리", "신명숙", "김은희", "김봉화", "최경녀"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_2.add(list, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(184, 134, 11));
		contentPane.add(panel_4, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 182, 193));
		contentPane.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(81, 80, 57, 15);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("패스워드");
		lblNewLabel_2.setBounds(81, 139, 57, 15);
		panel_3.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 77, 116, 21);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 136, 116, 21);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.setBounds(60, 222, 97, 23);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("회원가입");
		btnNewButton_6.setBounds(226, 222, 97, 23);
		panel_3.add(btnNewButton_6);
	}

}
