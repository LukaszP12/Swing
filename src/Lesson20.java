import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// This is the JSlider


public class Lesson20 extends JFrame{
	
	JSlider slider; 
	JLabel label; 
	
	public Lesson20() {
		setLayout(new FlowLayout()); 
		
		slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0); 
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		add(slider); 
		
		label = new JLabel("Current value: 0"); 
		add(label); 
		
		event e = new event();
		slider.addChangeListener(e);
	}
	
	public class event implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent arg0) {
			int value = slider.getValue(); 
			
			label.setText("Current value: " + value);
			
		} 
	}
	
		public static void main(String[] args) {
			Lesson20 gui = new Lesson20(); 
			gui.setTitle("Slider program");
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(300,100);
			gui.setVisible(true);
			gui.pack();
		
		}
	

}
