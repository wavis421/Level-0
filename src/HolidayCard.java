//package tortoise;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree grows with each layer

	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	void drawTreeBody() {
		Tortoise.setSpeed(5);
		// 8. Change the color of the line the tortoise draws to forest green
		Tortoise.setPenColor(Color.green.darker());
		// 1. Make a variable for turnAmount and set it to 175
		int turnAmount = 175;
		// 2. Start the Tortoise facing to the right
		Tortoise.turn(90);
		// 5. Repeat steps 3 to x 11 times
		for (int i = 0; i < 11; i++) {
			// 3. Move the tortoise the width of the tree
			Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
			Tortoise.turn(turnAmount);
			// 6. Set the widthOfTree to the current widthOfTree times the scale
			treeWidth = treeWidth * scale;
			// 7. Move the tortoise the width of a tree again
			Tortoise.move(treeWidth);
			// 8. Turn the tortoise the current turn amount to the LEFT
			Tortoise.turn(-turnAmount);
			// 9. Set the widthOfTree to the current widthOfTree times the scale again
			treeWidth = treeWidth * scale;
			// 10. Decrease turnAmount by 1
			turnAmount--;
		}

	}

	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(treeWidth / 2);
		// 2. Change the tortoise so that it is pointing straight down
		Tortoise.turn(90);
		// 4. Set the pen width to the tree width divided by 10
		Tortoise.setPenWidth(treeWidth / 10);
		// 5. Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(Color.yellow.darker());
		// 3. Move the tortoise a quarter the current length
		Tortoise.move(treeWidth / 4);
	}

	void drawStar() {
		// Optional: get the Tortoise to draw a red star on top of the tree. Hint:
		Tortoise.setPenColor(Color.red.brighter());
		for (int i = 0; i < 5; i++) {
			Tortoise.move(treeWidth * 2);
			Tortoise.turn(144);
		}
	}

	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse clicked!");

		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
		Tortoise.setX(mouseX);
		Tortoise.setY(mouseY);

		/* 4. [ADVANCED] Change tree size with distance from center. */
		// Make a variable that holds the width of the tortoiseWindow
		int width = tortoiseWindow.getWidth();
		// Make variable that holds the distance of the mouse from the center of the window.
		int distanceFromCenter = mouseX - width / 2;
		// Make sure that distance is always a positive number
		if (distanceFromCenter < 0)
			distanceFromCenter = -distanceFromCenter;
		// Set tree width to the distance divided by 10
		treeWidth = distanceFromCenter/10;
		// Set the pen width to treeWidth divided by 5
		Tortoise.setPenWidth(treeWidth/5);
		
		drawTree();
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it
		System.out.println("singing - NOT!");
		// Use the writeGreeting() method to add a Christmas message
		writeGreeting("Happy Holidays from your friend the Tortoise!");
	}

	private void writeGreeting(String greeting) {
		//tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String soundFile) {
		//AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		//sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth/5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		//drawGreetingAndSing();
	}
}




