import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import "C:\\Users\\LukaszP\\Desktop\\CocaCola.png"


// Image Tutorial 


public class Lesson3 extends JFrame	{
	private ImageIcon image; 
	private JLabel label1; 
	private ImageIcon image2; 
	private JLabel label2; 
	
	
	Lesson3(){
		setLayout(new FlowLayout());
		
		image1 = new ImageIcon(getClass().getResource(CocaCola.png));
		
		label1 = new JLabel(image); 
		add(label1); 
		
	}
	
	public static void main(String[] args) {
		Lesson3 gui = new Lesson3(); 
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setSize(200,125); 
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("It's a label with an image" );
		
	}

}
