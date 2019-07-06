import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Lesson5 extends JFrame{
	private JLabel label1; 
	private JLabel label2; 
	private JButton button1; 
	private JButton button2; 
	int x,y = 0; 
	
	
	public Lesson5() {
		setLayout(new FlowLayout()); 
		
		button1 = new JButton("Click here"); 
		add(button1); 
		
		label1 = new JLabel(""); 
		add(label1); 
		
		button2 = new JButton("Click for more text"); 
		add(button2); 

		label2 = new JLabel(""); 
		add(label2); 
		
		event e = new event(); 
		button1.addActionListener(e);
		
		event2 ev = new event2(); 
		button2.addActionListener(ev);
	}
	
	public class event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(x == 0) {
				label1.setText("THis is the new text");
				x = 1; 
			} else if( x == 1) {
				label1.setText("");
				x = 0; 
			}		
		}
	}
	
	public class event2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(y == 0) {
				label2.setText("This is the other text");
				y = 1;
			} else if(y == 1) {
				label2.setText("");
				y = 0; 
			}
		} 
	}
	
	
	
	
	
	public static void main(String[] args) {
		Lesson5 gui = new Lesson5(); 
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		gui.setTitle("This are event handlers");
		gui.setSize(200,125);
		gui.setVisible(true);
		gui.pack();
		
	}



}
