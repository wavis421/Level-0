
import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {

	public static void main(String[] args) {
		String color;
		
		// 2. Set the pen width to 10
		Tortoise.setPenWidth(10);
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		int numLoops = new Random().nextInt(10);

		System.out.println(numLoops);
		
		for (int i = 0; i < numLoops + 1; i++) {
			
			// 3. ask the user what color they would like the tortoise to draw
			color = JOptionPane.showInputDialog("Select your color:");

			changeColor(color);

			// 6. put a loop around your code so that you keep asking the user
			// for more colors & drawing them

			// 1. make the tortoise draw a shape (this will take more than one
			// line of code)
			for (int j = 0; j < 5; j++) {
				Tortoise.turn(144);
				Tortoise.move(200);
			}
		}
	}

	private static void changeColor(String color) {
		// 4. use an if/else statement to set the pen color that the user
		// requested
		// 5. if the user doesn’t enter anything, choose a random color
		if (color.equals("red"))
			Tortoise.setPenColor (PenColors.Reds.IndianRed);
		else if (color.equals("blue"))
			Tortoise.setPenColor (PenColors.Blues.Blue);
		else if (color.equals("yellow"))
			Tortoise.setPenColor (PenColors.Yellows.Gold);
		else if (color.equals("green"))
			Tortoise.setPenColor (PenColors.Greens.DarkGreen);
		else if (color.equals(""))
			Tortoise.setPenColor (PenColors.getRandomColor());
		else
			Tortoise.setPenColor (PenColors.Grays.Black);
	}
}
