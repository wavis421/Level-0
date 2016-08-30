
/* Level 0 Exam: Coding  Exercise #1 */
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class CodingExercise1 {
	public static void main(String[] args) {
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane
				.showInputDialog("What color would you like the tortoise to draw? Please use lower case letters only.");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (color.equals("red")) {
			Tortoise.setPenColor(PenColors.Reds.Red);
		}
		else if (color.equals("orange")) {
			Tortoise.setPenColor(PenColors.Oranges.Orange);
		}
		else if (color.equals("yellow")) {
			Tortoise.setPenColor(PenColors.Yellows.Yellow);
		}
		else if (color.equals("green")) {
			Tortoise.setPenColor(PenColors.Greens.Green);
		
		}
		else if (color.equals("blue")) {
			Tortoise.setPenColor(PenColors.Blues.Blue);
		}
		else if (color.equals("purple")) {
			Tortoise.setPenColor(PenColors.Purples.Purple);
		}
		else{
			JOptionPane.showMessageDialog(null, "Common colors, please. Try again! HINT: WRITE red OR orange OR yellow OR green OR blue OR purple" + ". This time I will forgive you." + ""
					+ " Here's a black figure:");
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 4; i++) {
			Tortoise.penDown();
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(-10);
		}
	}
}
