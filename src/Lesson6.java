import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// The Random number game 

public class Lesson6 extends JFrame{
	int randomNum, guess; 
	private JButton button; 
	private JTextField text; 
	private JLabel promptlabel; 
	private JLabel resultlabel; 
	private JLabel randomlabel; 
	
	public Lesson6() {
		setLayout(new FlowLayout());
		
		promptlabel = new JLabel("Enter a random number 1-10 "); 
		add(promptlabel); 
		
		text = new JTextField(10); 
		add(text); 
		
		button = new JButton("Guess!"); 
		add(button); 
		
		resultlabel = new JLabel(""); 
		add(resultlabel); 
		
		randomlabel = new JLabel(""); 
		add(randomlabel); 
		
		event e = new event(); 
		button.addActionListener(e);
	}
	
	public class event implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			randomNum = (int)(Math.random() * 10 + 1); 
			try { 
				guess = (int)(Double.parseDouble(text.getText())); 
				
				if (guess == randomNum ) {
					resultlabel.setText("You've won the game !");
				}else if (guess != randomNum){
					resultlabel.setText("You've lost the game !");
				}
				randomlabel.setText("The random number generated was:" + randomNum);	
					
				}catch(Exception ex) {
					randomlabel.setText("Please enter numbers only !" );
				}
			}	
		}
	
	public static void main(String[] args) {
		Lesson6 gui = new Lesson6(); 
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400,400);
		gui.setTitle("Random number guessing game");
		gui.setVisible(true);
		gui.pack();
		
	}
	
	}		
