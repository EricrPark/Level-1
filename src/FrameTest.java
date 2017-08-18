import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest extends JFrame {
	FrameTest() {
		setVisible(true);
		JPanel panel = new JPanel();
		add(panel);
		JButton button = new JButton();
		panel.add(button);
		pack();
	}
	public static void main(String[] args) {
		new FrameTest();
		
	}
}

