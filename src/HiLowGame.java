import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HiLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;
		// 2. Print out the random variable above
		System.out.println(random);
		int guessAsInt = 0;

		// 11. do the following 10 times

		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String guess = JOptionPane.showInputDialog("Guess my number from 1 - 100");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			guessAsInt = Integer.parseInt(guess);

			// 5. if the guess is correct
			if (random == guessAsInt)
			{
				JOptionPane.showMessageDialog(null, "You guessed it in " + (i+1) + " turns!");
				break;
			}
			
			// 6. win
			// 7. if the guess is high
			else if (guessAsInt > random)
				JOptionPane.showMessageDialog(null, "You guessed too HI");
			// 8. tell them it's too high
			else
				JOptionPane.showMessageDialog(null, "You guessed too LOW");
			// 9. if the guess is low
			// 10. tell them it's too low
		}

		// 12. tell them they lose
		if (random != guessAsInt)
		{
			JOptionPane.showMessageDialog(null, "Your turns are up, you LOST!!");
		}
	}

}
