// Copyright League of Amazing Programmers 2014
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {

		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
		String Answer = JOptionPane
				.showInputDialog(null, "which spiral you would like (square, triangle, or pentagon)");
		// 5. Set the number of sides depending on what the user entered
		// (multiple lines of code)

		if (Answer.equals("square")) {
			sides = 4;
		} else if (Answer.equals("triangle")) {
			sides = 3;
		} else if (Answer.equals("pentagon")) {
			sides = 5;
		}
		// 6. If the user enters something else, say
		// "Sorry, I don't know how to draw a ..."
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + Answer);
		}

		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn

		Tortoise.show();
		Tortoise.setSpeed(10);
		drawShape(sides);

		// 2. Change your code to turn the square spiral into a triangle spiral

	}

	private static void drawShape(int sides) {
		for (int i = 0; i < 75; i++) {
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.move(5 * i);
			Tortoise.turn(360 / sides);
			Tortoise.setPenWidth(i);
		}
	}

}

