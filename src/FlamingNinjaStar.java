import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {
		int baseSize = 300;
		int flameSize = 200;

		Robot myRobot = new Robot();
		myRobot.penDown();
		myRobot.setSpeed(10);

		// *14. Use the methods setX and setY to move the ninja star into the
		// center of the screen
		myRobot.setX(600);
		myRobot.setY(350);

		// *15. Make some adjustments to see what other kinds of shapes you can
		// make.

		for (int i = 0; i < 25; i++) {
			myRobot.setPenColor(PenColors.getRandomColor());
			myRobot.turn(360 / 8);
			myRobot.move(64);
			myRobot.turn(-40);
			myRobot.move(flameSize);
			myRobot.setPenColor(PenColors.getRandomColor());
			myRobot.turn(170);
			myRobot.move(flameSize);
			myRobot.setPenColor(PenColors.getRandomColor());
			myRobot.turn(64);
			myRobot.move(300);
		}
	}
}
