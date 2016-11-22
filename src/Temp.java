//package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Temp {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(10);
		rob.setPenWidth(10);
		
		rob.setPenColor(Color.BLUE);
		rob.move(100);
		rob.turn(90);
		rob.setPenColor(Color.green);
		rob.move(100);
		rob.turn(90);
		rob.setPenColor(Color.red);
		rob.move(100);
		rob.turn(90);
		rob.setPenColor(Color.yellow);
		rob.move(100);
		rob.turn(90);
		
		rob.setX(300);
		rob.setY(300);
		for (int i = 0; i < 3; i++) {
			rob.setRandomPenColor();
			rob.move(200);
			rob.turn(360/3);
		}
	}
}