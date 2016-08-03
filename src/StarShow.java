// Copyright Wintriss Technical Schools 2013

import org.teachingextensions.logo.Colors;

import org.teachingextensions.logo.Tortoise;


/*** Teacher's note ***/

/* Before beginning recipe: 

* 1. ask students to find and explain the method in this recipe. 

* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */


public class StarShow {


    public static void main(String[] args) {

        // 13. Set the speed to 8

        Tortoise.setSpeed(8);

        // 5. Make a variable to hold the X position of the Tortoise and set it to 10

        int xPos = 10;

        // 6. Make a variable to hold the Y position of the Tortoise and set it to 440

        int yPos = 440;

        // 7. Make a variable to hold the star size and set it to 15

        int starSize = 15;

        // 11. Repeat steps 8 through 17, 30 times

        for (int i = 0; i < 30; i++) {

            // 9. Set the X position of the Tortoise to your variable

            Tortoise.setX(xPos);

            // 10. Set the Y position of the Tortoise to your variable

            Tortoise.setY(yPos);

            // 8. Call the drawStar() method with your star size variable

            drawStar(starSize);

            // 12. Increase the X position by star size. See Figure 2.

            xPos += starSize;

            // 14. decrease the Y position by star size. See Figure 3.

            yPos -= starSize;

            // 15. Increase the star size by 8

            starSize += 8;

            // 16. Turn the Tortoise 10 degrees

            Tortoise.turn(10);

            // 17. Make each star a different random color like in Figure 4. Hint: Use the Colors object.

            Tortoise.setPenColor(Colors.getRandomColor());

        }


    }


    private static void drawStar(int starSize) {

        // 3. Repeat both commands 5 times. See Figure 1.

        for (int i = 0; i < 5; i++) {

            // 1. Move the Tortoise the distance of the starSize parameter

            Tortoise.move(starSize);

            // 2. Turn the Tortoise 144 degrees

            Tortoise.turn(144);

        }


    }

}

