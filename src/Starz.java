
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/

/*
 * 
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * 
 * increment). Do not give the students the answer to the challenge.
 * 
 */

public class Starz {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left.
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setSpeed(10);

		for (int i = 0; i < 700; i += 50) {

			Tortoise.setX(i);

			drawStar ();

			// 3. Set the size of the star to 30.
		}

		/** THE CHALLENGE: **/

		/*
		 * 
		 * Make the Tortoise draw a line of stars like this:
		 * 
		 * http://bit.ly/walk-of-fame
		 * 
		 * 
		 * 
		 * Hint: The distance between stars is 50.
		 * 
		 */

	}
	
	static void drawStar () {
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int j = 0; j < 5; j++) {
			Tortoise.move(30);
			Tortoise.turn(144);

		}
	}

}
