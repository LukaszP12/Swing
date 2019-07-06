import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lesson21 extends JFrame  {
	
	JSlider redSlider, greenSlider, blueSlider;
	JLabel redLabel, greenLabel, blueLabel; 
	JPanel colorPanel, sliders, labels;
	
	public Lesson21() {
		redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0); 
		greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0); 
		blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0); 
		
		redLabel = new JLabel("Red = 0");
		greenLabel = new JLabel("Green = 0");
		blueLabel = new JLabel("Blue = 0");
		
		event e = new event(); 
		redSlider.addChangeListener(e);
		greenSlider.addChangeListener(e);
		blueSlider.addChangeListener(e);
		
		colorPanel = new JPanel(); 
		colorPanel.setBackground(Color.BLACK);
	
		Container pane = this.getContentPane(); 
		pane.setLayout(new GridLayout(1,3,3,3));
		
		sliders = new JPanel(); 
		labels = new JPanel(); 
		
		pane.add(sliders); 
		pane.add(labels); 
		pane.add(colorPanel); 
		
		sliders.setLayout(new GridLayout(3,1,2,2));
		sliders.add(redSlider); 
		sliders.add(greenSlider);
		sliders.add(blueSlider);
		
		labels.setLayout(new GridLayout(3,1,2,2));
		labels.add(redLabel); 
		labels.add(greenLabel);
		labels.add(blueLabel); 
		
	}
	
	public class event implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			int r = redSlider.getValue(); 
			int g = greenSlider.getValue(); 
			int b = blueSlider.getValue(); 
			
			redLabel.setText("Red =	" + r);
			greenLabel.setText("Green = " + g);
			blueLabel.setText("Blue = " + b);
			
			colorPanel.setBackground(new Color(r,g,b));
		}
	}
	public static void main(String[] args) {
		Lesson21 gui = new Lesson21(); 
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,100);
		gui.setVisible(true);
		gui.setTitle("These sliders change colors");
		gui.pack(); 
		
	}
	
}
