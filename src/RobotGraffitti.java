import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitti {
	public static void main(String[] args) {
		Robot wendy = new Robot();
		wendy.setSpeed(10);
		wendy.setPenColor(Color.magenta);
		wendy.moveTo(300, 300);
		wendy.penDown();
		
		wendy.turn(160);
		wendy.move(300);
		
		wendy.turn(210);
		wendy.move(200);
		
		wendy.turn(160);
		wendy.move(200);
		
		wendy.turn(210);
		wendy.move(300);

		wendy.penUp();
		wendy.moveTo(10, 10);
	}
}
