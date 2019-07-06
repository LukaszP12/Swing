import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// Opening a new window


public class Lesson23 extends JFrame {
	
	JMenuBar menubar; 
	JMenu help; 
	JMenuItem about; 
	
	public Lesson23() {
		setLayout(new FlowLayout());
		
		menubar = new JMenuBar(); 
		add(menubar);
		
		help = new JMenu("Help"); 
		menubar.add(help);
		
		about = new JMenuItem("About"); 
		help.add(about); 
		
		setJMenuBar(menubar);
		
		event e = new event();
		about.addActionListener(e);
	 }

	public class event implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			HelpWindow gui =  new HelpWindow(Lesson23.this); 
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			gui.setSize(300,100);
			gui.setLocation(300,300);
			gui.setVisible(true);
				
		}
		
	}
	
	public static void main(String[] args) {
		Lesson23 gui = new Lesson23();
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(300,100);
			gui.setLocation(300,300);
			gui.setVisible(true);
	}
	
	
}
