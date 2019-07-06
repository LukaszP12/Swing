import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Adding objects to the window

public class Lesson2 extends JFrame {
	
		JLabel label;  
		JButton button;
		JTextField text; 
		
		public Lesson2() {
			setLayout(new FlowLayout());
			
			label = new JLabel("I am a label"); 
			add(label);
			
			text = new JTextField(15); 
			add(text); 
			
			button = new JButton("Click me"); 
			add(button); 
			
		}
	
	public static void main(String[] args) {
			Lesson2 gui = new Lesson2(); 
			gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
			gui.setSize(200,125);
			gui.setVisible(true);
			gui.setTitle("THis is GUI");
	}
	
}
