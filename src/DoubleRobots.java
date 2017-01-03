import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DoubleRobots {
	public static void main(String[] args) {
		int bestScore = -1;
		Robot robbie = new Robot();
		Robot sally = new Robot();
		robbie.penDown();
		sally.penDown();
		robbie.setSpeed(7);
		sally.setSpeed(7);
		robbie.setPenColor(Color.blue);
		sally.setPenColor(Color.magenta);

		for (int loop = 0; loop < 30; loop++) {
			robbie.setX(30);
			robbie.setY(30);
			sally.setX(1200);
			sally.setY(700);

			for (int i = 0; i < 200; i++) {
				moveX(robbie, sally);
				moveY(robbie, sally);

				moveX(sally, robbie);
				moveY(sally, robbie);

				if ((Math.abs(robbie.getX() - sally.getX()) < 10 && Math.abs(robbie.getY() - sally.getY()) < 10)) {
					if (bestScore == -1 || bestScore > i)
						bestScore = i;
					JOptionPane.showMessageDialog(null,
							"Robots found each other in " + i + " moves! Your best score is " + bestScore + ".");
					break;
				}
			}

			if (JOptionPane.showConfirmDialog(null, "Do you want to play again?") != 0) {
				JOptionPane.showMessageDialog(null, "Your best score was " + bestScore + ". Good-bye!");
				break;
			}
		}
	}

	private static void moveX(Robot robot, Robot otherRobot) {
		if (robot.getX() < otherRobot.getX()) {
			robot.setAngle(90);
			robot.move(new Random().nextInt(100));
		} else if (robot.getX() > otherRobot.getX()) {
			robot.setAngle(-90);
			robot.move(new Random().nextInt(100));
		}
		if (robot.getX() > 1200)
			robot.setX(1200);
		else if (robot.getX() < 0)
			robot.setX(0);
	}

	private static void moveY(Robot robot, Robot otherRobot) {
		if (robot.getY() < otherRobot.getY()) {
			robot.setAngle(180);
			robot.move(new Random().nextInt(100));
		} else if (robot.getY() > otherRobot.getY()) {
			robot.setAngle(0);
			robot.move(new Random().nextInt(100));
		}
		if (robot.getY() > 700)
			robot.setY(700);
		else if (robot.getY() < 0)
			robot.setY(0);
	}
}
