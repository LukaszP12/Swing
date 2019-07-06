import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// This is a calculator


public class Lesson13 extends JFrame {
	
	JButton add,substract, multiply, divide, sqrt;
	JTextField num1, num2; 
	JLabel result, enter1, enter2; 
	
	public Lesson13() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		enter1 = new JLabel("1st: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0; 
		c.gridy = 0; 
		add(enter1,c); 
		
		num1 = new JTextField(10); 
		c.fill = GridBagConstraints.HORIZONTAL; 
		c.gridx = 1;
		c.gridy = 0; 
		c.gridwidth = 3; 
		add(num1, c); 
		
		enter2 = new JLabel("2st: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		add(enter2,c);
		
		num2 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1; 
		c.gridwidth = 3; 
		add(num2,c);
		
		add = new JButton("+"); 
		c.fill = GridBagConstraints.HORIZONTAL; 
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		add(add, c); 
		
		substract = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		add(substract,c);
		
		multiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		add(multiply,c);
		
		divide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL; 
		c.gridx = 3; 
		c.gridy = 2;
		add(divide, c);
		
		sqrt = new JButton("sqrt");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 3;
		add(sqrt, c);
		
		
		result = new JLabel("");
		c.fill = GridBagConstraints.HORIZONTAL; 
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 4; 
		add(result,c);
		
		event a = new event();
		add.addActionListener(a);
		substract.addActionListener(a);
		multiply.addActionListener(a);
		divide.addActionListener(a);		
	}
	
	public class event implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent a) {
				double number1, number2; 
				
				try {
					number1 = Double.parseDouble(num1.getText()); 
				} catch(NumberFormatException e) {
					result.setText("Ilegal number in the text field");
					result.setForeground(Color.RED);
					return; 
				}
				
				try {
					number2 = Double.parseDouble(num2.getText());
				} catch(NumberFormatException e) {
					result.setText("Ilegal number in the text field");
					result.setForeground(Color.RED);
					return; 
				}
		String op = a.getActionCommand(); 
		
		if(op.equals("+")) {
			double sum = number1 + number2;
			result.setText(number1 + "+" + number2 + "=" +  sum);
			result.setForeground(Color.RED);
		} else if(op.equals("-")) {
			double diff = number1 - number2; 
			result.setText(number1 + "-" + number2 + "=" + diff);
			result.setForeground(Color.RED);
		} else if(op.equals("*")) {
			double factor = number1 * number2; 
			result.setText(number1 + "*" + number2 + "=" + factor);
			result.setForeground(Color.RED);
		} else if(op.equals("/")) {
			if(number2 == 0) {
				result.setText("Cannot divide by zero "); 
				result.setForeground(Color.RED);
			}else {
				double quotient = number1 / number2; 
				result.setText(number1 + "/" + number2 + "=" + quotient);
				result.setForeground(Color.RED);
			}
		} else if(op.equals("sqrt")) {
			double sqrt = Math.sqrt(number1);
			System.out.println(sqrt);
			result.setText(Double.toString(sqrt) );	
			System.out.println(result);
		}
		repaint();
	}	
}
	
	public static void main(String[] args) {
		Lesson13 calculator = new Lesson13(); 
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setSize(200,175);
		calculator.setVisible(true);
		calculator.setTitle("My first calculator");
	}
}
