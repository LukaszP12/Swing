import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson9 extends JFrame {
	JButton button; 
	JLabel label; 
	int counter = 0, x = 0; 
	String s; 
	
	Lesson9(){ 
		setLayout(new FlowLayout());
		
		button = new JButton("Click for sound"); 
		add(button); 
		
		label = new JLabel(""); 
		add(label); 
		
		event e = new event(); 
		button.addActionListener(e); 
		
	}
	
	public class event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Toolkit.getDefaultToolkit().beep();
			counter++; 
			if( x == 0 ) {
				s = "time"; 
			} else if(x == 1) {
				s = "times"; 
			}
			label.setText("You have clicked " + counter + " " + s );
			x = 1;
		}  
	}
	
	public static void main(String[] args) {
		Lesson9 beeper = new Lesson9(); 
		beeper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		beeper.setSize(150,50);
		beeper.setVisible(true);
		beeper.setTitle("Beeper");
		
	}
	
	
}
