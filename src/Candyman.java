import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	int times = 0;
	Candyman() {
		JFrame frame1 = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Candyman");
		button.addActionListener(this);
		frame1.setVisible(true);
		frame1.add(panel);
		panel.add(button);
		frame1.pack();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Candyman candy = new Candyman();
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		times++;
		if (times == 5) {
			showPictureFromTheInternet("https://www.jbprince.com/images/K864_zoom.jpg");
		}
		
	}
	
}
