package event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

/*
1. 이벤트 소스 결정 :하나의 윈도우에는 여러 개의 컴포넌트가 존재할 수 있으므로
					 실제로 이벤트가 발생되면 처리할 컴포넌트를 결정한다. 
2. 이벤트 핸들러(리스너) 클래스작성 : 
			이벤트를 실제적으로 처리할 수 있도록 
            해당 이벤트를 처리할 이벤트 리스너 인터페이스를 
            이용해서(구현) 이벤트 핸들러(리스너) 클래스를 작성한다. 

3. 이벤트 소스객체와 이벤트 핸들러(리스너)객체 연결 :
 				이벤트 리스너(핸들러)가 작성이되면 리스너(핸들러)와 이벤트 소스와 연결을 하여 
 				이벤트 소스에서 실제적으로 이벤트가 발생이 되면 처리할수 있도록 
				addXXListener()함수를 통해 연결을 시켜준다.  
				XX부분은 해당 컴포넌트에 붙일 수 있는 리스너 이름을 의미한다.
	 
	  ex>버튼에서발생하는 ActionEvent를 처리할 Handler(ActionListener구현)객체생성
	  
	  예를 들어 버튼에 ActionEvent을 처리하기 위하여 
	  버튼에다가 addActionListener를 붙이는 경우이다.
	  ex> 버튼객체.addActionListener(ActionListener구현한핸들러객체);
*/
public class ActionEventJFrame extends JFrame {

	JPanel contentPane;
	JButton northButton;
	JButton southButton;
	private JButton westButton;
	private JButton eastButton;

	/**
	 * Create the frame.
	 */
	public ActionEventJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		northButton = new JButton("이벤트쏘스[NORTH]");
		contentPane.add(northButton, BorderLayout.NORTH);

		southButton = new JButton("이벤트쏘스[SOUTH]");
		contentPane.add(southButton, BorderLayout.SOUTH);

		westButton = new JButton("이벤트쏘스[WEST]");
		contentPane.add(westButton, BorderLayout.WEST);

		eastButton = new JButton("이벤트소스[EAST]");
		
		eastButton.addActionListener(new ActionListener() {
			int buttonClickCount = 0;

			public void actionPerformed(ActionEvent e) {
				eastButton.setText("이벤트소스[EAST]" + buttonClickCount);
				/******** ActionEventJFrame 의 멤버접근 **********/
				setTitle("east button click count:" + buttonClickCount);

				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				contentPane.setBackground(new Color(r, g, b));

			}
		});
		//익명 클래스 바로 대입
		contentPane.add(eastButton, BorderLayout.EAST);

		/******** 이벤트쏘스에 이벤트 핸들러객체등록 **********/
		/*** 1.외부클래스 *****/
		NorthButtonActionEventHandler handler1 = new NorthButtonActionEventHandler(this);
		northButton.addActionListener(handler1);
		// 핸들러 객체를 매개변수로 대입
		// 리스너의 인터페이스를 구현한 후 객체가 들어가야 하기 때문에
		/*** 2.멤버내부클래스 *****/
		SouthButtonActionEventHandler handler2 = new SouthButtonActionEventHandler();
		southButton.addActionListener(handler2);
		/*** 3.익명지역내부클래스 *****/
		ActionListener handler3 = new ActionListener() {
			int buttonClickCount = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 객체에는 이벤트 발생 소스의 참조가 들어있음
				westButton.setText("이벤트쏘스[WEST] " + ++buttonClickCount);
				/******************** ActionEventJFrame의 멤버접근 *******************/
				setTitle("west button click count:" + buttonClickCount);
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				contentPane.setBackground(new Color(r, g, b));
			}

		};
		westButton.addActionListener(handler3);

	}

	/***************** member inner class **********************/
	public class SouthButtonActionEventHandler implements ActionListener {
		int buttonClickCount = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("south button click!!!");
			System.out.println("실행쓰레드이름:" + Thread.currentThread().getName());
			/**************************** 이벤트쏘스얻기 **************************/
			Object source = e.getSource();
			JButton eventSourceButton = (JButton) source;
			eventSourceButton.setText("이벤트쏘스[SOUTH] " + ++buttonClickCount);
			/******************** ActionEventJFrame의 멤버접근 *******************/
			setTitle("south button click count:" + buttonClickCount);

			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			contentPane.setBackground(new Color(r, g, b));
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		ActionEventJFrame frame = new ActionEventJFrame();
		frame.setVisible(true);

	}
}