
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old will you be by the end of 2016?");
		int ageInt = Integer.parseInt(age);
		int born = (2016 - ageInt);
		JOptionPane.showMessageDialog(null, "You were born in " + born + "!");
		if(born < 1987){
			JOptionPane.showMessageDialog(null, "You are getting a tad bit old to play this game...");
		}
	}
}
