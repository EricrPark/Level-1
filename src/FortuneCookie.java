import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie tilly = new FortuneCookie();
		tilly.showButton();
	}
	void showButton() {
		
		JButton button = new JButton();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(button);
		//button.setText("hello world");
		button.addActionListener(this);
		frame.setSize(1080,2000);
		System.out.println("hello world");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "your a bro world");
		int rand = new Random().nextInt(5);
		System.out.println(rand);
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will fail your drivers test and not get a license until you are 26.");
		}
		else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will fall out of a tree and break you fibula.");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will win the lottery... IN YOUR DREAM.");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will become a famous speed eater.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You will have 13 credit cards and you will default on all of them.");
		}
	}
}

