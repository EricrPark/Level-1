import org.jointheleague.graphical.robot.Robot;

public class Vangough {
	public void drawPalette(ColorPalette palette) {
		Robot robot = new Robot();
		robot.hide();
		robot.setPenColor(palette.Get(1));
		robot.penDown();
		robot.setSpeed(10);
		robot.move(450);
		robot.penUp();
		robot.turn(90);
		robot.move(75);
		robot.turn(90);
		robot.penDown();
		robot.setPenColor(palette.Get(2));
		robot.move(450);
		robot.penUp();
		robot.turn(-90);
		robot.move(75);
		robot.turn(-90);
		robot.penDown();
		robot.setPenColor(palette.Get(3));
		robot.move(450);

	}
}
