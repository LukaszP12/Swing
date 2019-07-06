import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Random color panel 

public class Lesson17 extends JFrame {
	
	JPanel panel = new JPanel(); 
	
	public Lesson17() {
		panel = new JPanel(); 
		panel.setBackground(randomColor());
		add(panel);
		
		event e = new event(); 
		panel.addMouseListener(e);
		
	}
	
	public Color randomColor() {
		int r = (int)(Math.random() * 256); 
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256); 
		return(new Color(r,g,b)); 
		
	}
	
	public class event implements  MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			panel.setBackground(randomColor());
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		Lesson17 gui = new Lesson17(); 
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(200,175);
		gui.setVisible(true);
		gui.setTitle("Random color panel ");
		gui.pack();
		
	}
	
	
}
