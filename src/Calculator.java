import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Calculator");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JButton addition = new JButton("+");
		JButton subtraction = new JButton("-");
		JButton division = new JButton("/");
		JButton multiplacation = new JButton("*");
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JLabel answer = new JLabel();
		frame.setVisible(true);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.SOUTH);
		panel1.add(num1, BorderLayout.WEST);
		panel1.add(num2, BorderLayout.EAST);
		panel2.add(addition);
		panel2.add(subtraction);
		panel2.add(division);
		panel2.add(multiplacation);
		panel3.add(answer);
		frame.pack();
	}
}
