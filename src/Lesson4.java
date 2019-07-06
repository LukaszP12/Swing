import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

// Event handling 


public class Lesson4() extends JFrame {
	private JLabel label; 
	private JButton button; 
	
	public Lesson4(){
		setLayout(new FlowLayout());
		
		button = new JButton("Click for text"); 
		add(button); 
		
		label = new JLabel(""); 
		add(label); 
		
		event e = new event(); 
		button.addActionListener(e);		
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			label.setText("Now you can see words here ! ");
		}
	}
		
		public static void main(String[] args) {
			Lesson4 gui = new Lesson4(); 
			gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
			gui.setSize(200,125);
			gui.setVisible(true);
			gui.pack();
			
		}

