package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NorthButtonActionEventHandler implements ActionListener {
	private int buttonClickCount=0;
	private ActionEventJFrame actionEventJFrame;
	
	
	public NorthButtonActionEventHandler(ActionEventJFrame actionEventJFrame) {
		this.actionEventJFrame = actionEventJFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("north button click!!!");
		System.out.println("실행쓰레드이름:"+Thread.currentThread().getName());
		/****************************이벤트쏘스얻기**************************/
		Object source = e.getSource();
		JButton eventSourceButton=(JButton)source;
		eventSourceButton.setText("이벤트쏘스[NORTH] "+ ++buttonClickCount);
		/********************ActionEventJFrame의 멤버접근*******************/
		actionEventJFrame.setTitle("north button click count:"+buttonClickCount);
		
		int r= (int)(Math.random()*256); 
		int g= (int)(Math.random()*256); 
		int b= (int)(Math.random()*256); 
 		actionEventJFrame.contentPane.setBackground(new Color(r,g,b));
		
		return;
	}

}