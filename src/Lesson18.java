import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson18 extends JFrame {

	JCheckBox show1, show2; 
	JLabel label1, label2; 
	
	public Lesson18() {
		setLayout(new GridLayout(2,2)); 
		
		label1 = new JLabel("Show first label"); 
		add(label1); 
		
		label2 = new JLabel("Show second label"); 
		add(label2); 
		
		show1 = new JCheckBox();
		add(show1); 
		
		show2 = new JCheckBox();
		add(show2); 
		
		event e = new event();
		show1.addItemListener(e);
		show2.addItemListener(e);
	}
	
	
	public class event implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(show1.isSelected()) {
				label1.setText("You've pushed first cb");
			} else { 
				label1.setText("");
			
				if(show2.isSelected()) {
					label1.setText("You've pushed second cb");
				} else { 
					label1.setText("");
				}
			}	
		}	
	}

public static void main(String[] args) {
	Lesson18 gui = new Lesson18(); 
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setSize(300,100);
	gui.setVisible(true);
	gui.setTitle("CheckBoxes ");
}


}
