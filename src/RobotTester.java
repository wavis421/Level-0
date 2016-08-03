import org.jointheleague.graphical.robot.Robot;

public class RobotTester {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(20);
		rob.moveTo(300, 300);
		rob.penDown();
		
		// Draw "W"
		rob.turn(165);
		rob.move(200);
		rob.turn(210);
		rob.move(150);
		rob.turn(150);
		rob.move(150);
		rob.turn(210);
		rob.move(200);
		rob.penUp();
		rob.moveTo(600, 200);
		
		// Draw a star
		rob.penDown();		
		for (int i = 0; i < 5; i++) {
			rob.turn(144);
			rob.move(200);
		}
		
		rob.penUp();
		rob.moveTo(100, 100);
	}
}
