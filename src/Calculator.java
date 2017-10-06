import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	JButton addition = new JButton("+");
	JButton subtraction = new JButton("-");
	JButton division = new JButton("/");
	JButton modulo = new JButton("%");
	JButton multiplacation = new JButton("*");
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JLabel answer = new JLabel();
	Calculator() {
		frame.setTitle("Calculator");
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
		panel2.add(modulo);
		frame.pack();
		subtraction.addActionListener(this);
		addition.addActionListener(this);
		multiplacation.addActionListener(this);
		division.addActionListener(this);
		modulo.addActionListener(this);
		panel1.setBackground(Color.black);
		panel2.setBackground(Color.black);
		panel3.setBackground(Color.black);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double n1 = Integer.parseInt(num1.getText());
		double n2 = Integer.parseInt(num2.getText());
		double ans = 0;
		if(e.getSource()==subtraction) {
			ans = n1-n2;
		}
		else if(e.getSource()==addition) {
				ans = n1+n2;
		}
		else if(e.getSource()==division) {
					ans = n1/n2;
		}
		else if(e.getSource()==multiplacation) {
			ans = n1*n2;
		}
		else if(e.getSource()==modulo) {
			ans = n1%n2;
		}
		answer.setText(String.valueOf(ans));
		frame.pack();
	}
}
