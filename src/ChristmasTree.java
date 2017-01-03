import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ChristmasTree {
	double treeWidth = 15;
	double scale = 1.1;	//This is how much the width of the tree grows with each layer
	
	public static void main(String[] args) {
		ChristmasTree ohChristmasTree = new ChristmasTree();
		Tortoise.setSpeed(8);
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
		
	}



	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green	
		Tortoise.setPenColor(Color.green.darker());
		// 1. Make a variable for turnAmount and set it to 175
		int turnAmount = 175;
		// 2. Start the Tortoise facing to the right
		Tortoise.turn(90);
		//5. Repeat steps 3 to x 11 times
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
		Tortoise.setPenColor(Color.orange.darker());
		// 3. Move the tortoise a quarter the current length
		Tortoise.move(treeWidth / 4);
	}
	
	void drawStar() {
		// Optional: get the Tortoise to draw a red star on top of the tree. Hint: 
		Tortoise.setPenColor(Color.red.brighter());
		for (int i = 0; i < 5; i++) {
			Tortoise.move(treeWidth*2);
			Tortoise.turn(144);
		}
	}

}

