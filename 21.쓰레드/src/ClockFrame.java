import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ClockFrame extends JFrame {

	private JPanel contentPane;
	private JLabel timeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockFrame frame = new ClockFrame();
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
	public ClockFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		timeDisplayLabel = new JLabel("12:00");
		timeDisplayLabel.setIcon(null);
		timeDisplayLabel.setForeground(Color.BLUE);
		timeDisplayLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		timeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(timeDisplayLabel, BorderLayout.CENTER);
		
		ClockThread clockThread=new ClockThread();
		clockThread.start();
	}

	/*
	 * member thread  nested class
	 */
	public class ClockThread extends Thread{
		@Override
		public void run() {
			while(true) {
				try {
					Date now=new Date();
					String timeString = now.toLocaleString();
					timeDisplayLabel.setText(timeString);
					//System.out.println(timeString);
					Thread.sleep(1000);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
		
	
}