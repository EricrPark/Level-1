import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		for (int i=0; i<50; i++) {
	    // 4. Instantiate a Turtle
	           Turtle fred = new Turtle();
	    // 5. Add the turtle to the panel
	           panel.addTurtle(fred);
	           int randX = new Random().nextInt(500);
	           int randY = new Random().nextInt(500);
	           fred.setX(400+randX);
	           fred.setY(300+randY);
		}
		// 6. Put 50 Turtles on the beach\

	}
}
