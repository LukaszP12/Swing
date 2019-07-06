import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Lesson29 extends JFrame {
	
	JLabel promptLabel, timerLabel;
	int counter; 
	JTextField tf; 
	JButton button; 
	Timer timer; 
	
	public Lesson29() {
		setLayout(new GridLayout(2,2,5,5));
		
		promptLabel = new JLabel("Enter seconds:", SwingConstants.CENTER); 
		add(promptLabel); 
		
		tf = new JTextField(5); 
		add(tf); 
		
		button = new JButton("Start timing"); 
		add(button); 
		
		timerLabel = new JLabel("Waiting...", SwingConstants.CENTER);
		add(timerLabel); 
		
		event e = new event(); 
		button.addActionListener(e);
		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int count = (int)(Double.parseDouble(tf.getText())); 
			timerLabel.setText("Time left: " + count );
			
			TimeClass tc = new TimeClass(count); 
			timer = new Timer(1000,tc); 
			timer.start(); 
		}
	}
	
public class TimeClass implements ActionListener {
	int counter; 
	
	public TimeClass(int counter) { 
		this.counter = counter; 
	}
	
	public void actionPerformed(ActionEvent tc) {
		counter--; 
		
		if(counter >= 1) {
			timerLabel.setText("Time left: " + counter);
		} else { 
			timer.stop(); 
			timerLabel.setText("Done!");
		    Toolkit.getDefaultToolkit().beep();
		    
			
		}
	}
}

public static void main(String[] args) {
	Lesson29 gui = new Lesson29(); 
	gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
	gui.setSize(250,100);
	gui.pack(); 
	gui.setTitle("Timer program");
	gui.setVisible(true);
	
}
	
}