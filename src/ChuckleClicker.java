import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton but;
	JButton button;
	public static void main(String[] args) {
		ChuckleClicker Boris = new ChuckleClicker();
		Boris.makeButtons();
	}
	void makeButtons(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 60);
		JPanel panel = new JPanel();
		frame.add(panel);
		but = new JButton();
		panel.add(but);
		but.addActionListener(this);
		but.setText("Joke");
		button = new JButton();
		panel.add(button);
		button.setText("Punchline");
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == but){
			JOptionPane.showMessageDialog(null, " I’m employed at a computer security company and have a colleague whose name is M. Alware.");
		}
		else {
			JOptionPane.showMessageDialog(null, "His e-mail address is malware@company.com.");
		}
	}
}
