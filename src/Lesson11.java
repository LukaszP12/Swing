import java.awt.AWTException;
import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Mouse mover

public class Lesson11 extends JFrame {

	JLabel label1, label2, label3, label4, errorLabel;
	JTextField tf1, tf2, tf3, tf4; 
	JButton button; 
	
	public Lesson11() {
		setLayout(new GridLayout(5,2, 5, 5)); 
		label1 = new JLabel("Enter number of movements "); 
		add(label1);
		
		tf1 = new JTextField(); 
		add(tf1); 
		
		label2 = new JLabel("Enter delay between movements "); 
		add(label2); 
		
		tf2 = new JTextField(); 
		add(tf2); 
		
		label3 = new JLabel("Enter screen width in pixels "); 
		add(label3); 
		
		tf3 = new JTextField(); 
		add(tf3); 
		
		label4 = new JLabel("Enter screen height in pixels "); 
		add(label4); 
		
		tf4 = new JTextField();
		add(tf4);
		
		errorLabel = new JLabel("");
		add(errorLabel);
		
		button = new JButton("Zapisz "); 
		add(button);
		
		event e = new event(); 
		button.addActionListener(e);
		
	}
	
	
	public class event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int num = (int)(Double.parseDouble(tf1.getText())); 	
				int delay = (int)(Double.parseDouble(tf2.getText()));
				int width = (int)(Double.parseDouble(tf3.getText())); 
				int height = (int)(Double.parseDouble(tf4.getText())); 
				
				if (num <= 0 || delay <= 0 || width <= 0 || height <=0) {
					errorLabel.setText("Please enter positive values");
				} else { 
					errorLabel.setText("");
			
				
				try { 
					Robot rob = new Robot(); 
					for(int x=0; x<num; x++) {
						rob.mouseMove((int)(Math.random()*width), (int)(Math.random()*height));
						rob.delay(delay);
					}
				}catch (AWTException ex){
						System.exit(0);
					}	
				}
			} catch (Exception exx) {
				errorLabel.setText("Numbers only");
			}
		}	
	}
	
	public static void main(String[] args) {
		Lesson11 mousemover = new Lesson11(); 
		mousemover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mousemover.setSize(200,125);
		mousemover.setVisible(true);
		mousemover.setTitle("MouseMover ");
		mousemover.pack();
	}
	

}
