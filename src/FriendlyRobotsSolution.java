import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/**
 * FriendlyRobots: This recipe creates 2 robots in opposite corners of the canvas, and moves
 * 					them a random distance towards each other until they overlap.
 * 
 *
 */
public class FriendlyRobotsSolution {
	// Starting positions
	int xPosLeft = 30;
	int yPosTop = 30;
	int xPosRight = 1200;
	int yPosBottom = 700;

	int maxNumGames = 30;
	int maxMoves = 200;

	public FriendlyRobotsSolution() {
		int bestScore = maxMoves;

		// Create and initialize 2 robots.
		// NOTE: The xPos, yPos does not need to be done here except for testing
		// this step
		Robot robbie = new Robot();
		Robot sally = new Robot();
		setupRobot(robbie, Color.blue, xPosLeft, yPosTop);
		setupRobot(sally, Color.magenta, xPosRight, yPosBottom);

		for (int game = 0; game < maxNumGames; game++) {
			// Move robots to top-right and bottom-left corners
			robbie.setX(xPosLeft);
			robbie.setY(yPosTop);
			sally.setX(xPosRight);
			sally.setY(yPosBottom);

			for (int i = 0; i < 200; i++) {
				// Move first robot towards second robot
				moveX(robbie, sally);
				moveY(robbie, sally);

				// Move second robot towards first robot
				moveX(sally, robbie);
				moveY(sally, robbie);

				// Check if robot friends have found each other
				if (foundFriend(robbie, sally) == true) {
					if (bestScore > i)
						bestScore = i;
					JOptionPane.showMessageDialog(null, "Robots friends found each other in " + i
							+ " moves! Your best score is " + bestScore + ".");
					break;
				}
			}

			if (JOptionPane.showConfirmDialog(null, "Do you want to play again?") != 0) {
				JOptionPane.showMessageDialog(null, "Your best score was " + bestScore + ". Good-bye!");
				break;
			}
		}
	}

	private void setupRobot(Robot robot, Color robotColor, int xPos, int yPos) {
		robot.setX(xPos);
		robot.setY(yPos);
		robot.setSpeed(7);
		robot.setPenColor(robotColor);
		robot.penDown();
	}

	private void moveX(Robot robot, Robot otherRobot) {
		// Move robot a random X distance towards otherRobot
		if (robot.getX() < otherRobot.getX()) {
			robot.setAngle(90);
			robot.move(new Random().nextInt(100));
		} else if (robot.getX() > otherRobot.getX()) {
			robot.setAngle(-90);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getX() > xPosRight)
			robot.setX(xPosRight);
		else if (robot.getX() < xPosLeft)
			robot.setX(xPosLeft);
	}

	private void moveY(Robot robot, Robot otherRobot) {
		// Move robot a random Y distance towards otherRobot
		if (robot.getY() < otherRobot.getY()) {
			robot.setAngle(180);
			robot.move(new Random().nextInt(100));
		} else if (robot.getY() > otherRobot.getY()) {
			robot.setAngle(0);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getY() > yPosBottom)
			robot.setY(yPosBottom);
		else if (robot.getY() < yPosTop)
			robot.setY(yPosTop);
	}

	private Boolean foundFriend(Robot robot1, Robot robot2) {
		// Check whether robots are within 10 pixels of each other
		if (Math.abs(robot1.getX() - robot2.getX()) < 10 && Math.abs(robot1.getY() - robot2.getY()) < 10)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		new FriendlyRobotsSolution();
	}
}
