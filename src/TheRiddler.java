import javax.swing.JOptionPane;

public class TheRiddler {


    public static void main(String[] args) {


        // 1. Make a variable to hold the score
    	int score = 0;

        // 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
    	JOptionPane.showMessageDialog(null,  "Who makes it, has no need of it.\n" +
                "Who buys it, has no use for it.\n" +  
                "Who uses it can neither see nor feel it.\n" +
                "What is it?");     

        // 4. If they got the answer right, pop up "correct!" and increase the score by one
    	String answer = JOptionPane.showInputDialog("What is your guess?");
    	if (answer.equals("coffin"))
    	{
    		JOptionPane.showMessageDialog(null,  "Correct!");
    		score++;
    	}

        // 5. Otherwise, say "wrong" and tell them the answer
    	else
    	{
    		JOptionPane.showMessageDialog(null,  "Wrong! The answer is COFFIN");
    	}

        // 6. Add some more riddles


        // 2. Make a pop up to show the score.
    	JOptionPane.showMessageDialog(null, "Your score is " + score);
    }
}

