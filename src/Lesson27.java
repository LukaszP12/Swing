import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Lesson27 extends JFrame implements ActionListener {
	
	JTextArea jta; 
	JScrollPane jsp;
	JButton jbn; 
	public Lesson27() {
		jta =  new JTextArea(10,20); 
		jbn = new JButton(); 
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setLayout(new FlowLayout()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		jbn.addActionListener(this);
		
		add(jsp);
		add(jbn); 
		
		setSize(340,200); 
		setLocationRelativeTo(null);
		setVisible(true);
		
	} 
	
	public static void main(String[] args) {
		Lesson27 frame = new Lesson27(); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = jta.getText(); 
		JOptionPane.showMessageDialog(this, "You've typed " + str); 
	}
	
	
	
}
