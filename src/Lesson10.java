import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson10 extends JFrame{
	JButton button1, button2, button3; 
	JLabel label1, label2, label3; 
	
	public Lesson10() {
		setLayout(new GridLayout(2,3));
		
		button1 = new JButton("Button 1"); 
		add(button1); 
		
		label1 = new JLabel("Label 1"); 
		add(label1); 
		
		button2 = new JButton("Button 2"); 
		add(button2); 
		
		label2 = new JLabel("Label 2"); 
		add(label2); 
		
		button3 = new JButton("Button 3"); 
		add(button3); 
		
		label3 = new JLabel("Label 3"); 
		add(label3); 	
	}
	
	public static void main(String[] args) {
		Lesson10 layout = new Lesson10(); 
		layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout.setSize(200,150); 
		layout.setVisible(true);
		layout.setTitle("The layout"); 
		layout.pack();
		
	}
		
}
