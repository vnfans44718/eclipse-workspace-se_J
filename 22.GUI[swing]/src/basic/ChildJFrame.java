package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChildJFrame extends JFrame {

	/*
	 * 컴포넌트를 멤버필드로 선언
	 */

	private JPanel contentPane;
	private JButton loginButton;
	private JButton joinButton;

	public ChildJFrame() {

		contentPane = new JPanel();

		contentPane.setBackground(Color.black);
		this.setContentPane(contentPane);
		/*
		 * 컴포넌트생성(컨테이너(JFrame)의 멤버필드)
		 */

		loginButton = new JButton("로그인");
		joinButton = new JButton("회원가입");
		
		/*
		 * contentPane 배치관리자 제거
		 */
		contentPane.setLayout(null);
		/*
		 * 컨테이너의 컴포넌트를 붙인다
		 */
		loginButton.setBounds(70,160,90,40);
		joinButton.setBounds(230,160,90,40);
		contentPane.add(loginButton);
		contentPane.add(joinButton);
		

		/*
		 *3. 컨테이너(JFrame)객체의 크기 설정
		 */

		this.setSize(400, 300);
		this.setTitle("나의첫번째프레임");

	}

	public static void main(String[] args) {
		/*** 2. 컨테이너클래스(JFrame) 객체 생성 ***/
		ChildJFrame childJFrame = new ChildJFrame();

		/*
		 *6. 컨테이너(JFrame)객체 보여주기
		 */
		childJFrame.setVisible(true);

	}

}
