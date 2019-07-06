import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Lesson28 extends JFrame {
	JTextArea textarea; 
	JButton button; 
	JLabel label; 
	
	public Lesson28() {
		setLayout(new FlowLayout());
		
		textarea  =  new JTextArea(5, 30); 
		add(textarea); 
		
		button = new JButton("Click here to put the text into label"); 
		add(button); 
		
		label = new JLabel(""); 
		add(label); 
		
		event e = new event(); 
		button.addActionListener(e);
		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String text = textarea.getText(); 
			if (text == null ? "" == null : text.equals("")) {
				label.setText("Please enter some text");
			} else { 
			
			label.setText(text);
			}
		}
	}
	
	public static void main(String[] args) {
		Lesson28 gui = new Lesson28(); 
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setSize(400,200);
		gui.setVisible(true);
	}
	
}
