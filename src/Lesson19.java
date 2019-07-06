import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lesson19 extends JFrame {

	JTable table; 
	
	public Lesson19() {
		setLayout(new FlowLayout());
		
		String[] columnNames = {"Name", "Eye-Color", "Gender"};
		
		Object[][] data = {
				{"Bill","Hazel","Male"},
				{"Mary","Black","Female"}, 
				{"Rick","Red","Male"}, 
				{"Janice","Yellow","Female"}
		};
		
		table = new JTable(data,columnNames); 
		table.setPreferredScrollableViewportSize(new Dimension(500,50));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table); 
		add(scrollPane); 
		
	}
	
	public static void main(String[] args) {
		Lesson19 gui = new Lesson19();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600,200);
		gui.setTitle("This is a JTable");
		gui.pack();
		
	}
	
	
}
