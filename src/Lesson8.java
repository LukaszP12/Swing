import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Lesson8 extends JFrame{
	JMenuBar menubar; 
	JMenu file;
	JMenuItem exit;
	
	public Lesson8() {
		setLayout(new FlowLayout());
			
		menubar = new JMenuBar(); 
		setJMenuBar(menubar); 
		
		file = new JMenu("File");
		menubar.add(file);
		
		exit = new JMenuItem("Exit");
		file.add(exit); 
		
		event e = new event();
		exit.addActionListener(e);
		}
		
		class event implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}	
		 }
		
		public static void main(String[] args) {
			Lesson8 gui = new Lesson8(); 
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(200,200);
			gui.setVisible(true);
			gui.setTitle("THis is a menubar");
		
		}	
	
	
	

	
   
}
