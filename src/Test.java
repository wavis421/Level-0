import javax.swing.JOptionPane;


import org.teachingextensions.logo.Tortoise;

// Dizzy tortoise
public class Test {


    public static void main(String[] args) {

        /*

         * 1. Use the dance method to make the Tortoise spin.

         * 

         * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin

         * that number of times.

         */


        String howMany = JOptionPane.showInputDialog("How dizzy do you want to make the Tortoise, from 1 to 10?");

        int howManyInt = Integer.parseInt(howMany);

        dance(howManyInt);

    }


    static void dance(int numberOfSpins) {

        for (int i = 0; i < numberOfSpins; i++) {

            Tortoise.turn(360);

        }

    }

}
