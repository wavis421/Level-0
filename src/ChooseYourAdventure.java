import javax.swing.JOptionPane;

public class ChooseYourAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "The prince is trying to find his beautiful princess.\n"
				+ "All he knows is that she is somewhere in his kingdom.\n" + "He needs your help!");

		for (int i = 0; i < 30; i++) {
			int selection = JOptionPane.showOptionDialog(null, "Where should the prince look for his princess???",
					"The Lost Princess", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "In the forest", "In the swamp", "In the castle", "I give up!" }, null);
			if (selection == 0) {
				selection = JOptionPane.showOptionDialog(null,
						"The forest is very large. How should the prince search the entire forest?",
						"Searching the Forest", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Climb a tree to get a better look", "Get his hunting dog to help him" }, null);
				if (selection == 0) {
					JOptionPane.showMessageDialog(null,
							"Climbing the tree was a good plan, but the princess cannot be found");
				} else {
					JOptionPane.showMessageDialog(null, "His dog is old, and has trouble running. So not a good plan.");
				}
			} else if (selection == 1) {
				selection = JOptionPane.showOptionDialog(null,
						"Really??? The SWAMP?!?\nWhat should the prince do next?",
						"The Swamp", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {
								"Kiss the frog sitting on the lilypad", "Jump in to see if the princess drowned" },
						null);
				if (selection == 0) {
					JOptionPane.showMessageDialog(null,
							"You actually fell for the kiss-the-frog trick! No luck turning the frog into a princess this time :-).");

				} else {
					JOptionPane.showMessageDialog(null, "Sorry, the prince got yucky for nothing.");
				}
			} else if (selection == 2) {
				selection = JOptionPane.showOptionDialog(null,
						"Searching the castle isn't very creative. Where to search next?", "In the Castle", 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Search the kitchen", "Search the bedroom" }, null);
				if (selection == 0) {
					JOptionPane.showMessageDialog(null,
							"Yeah, you found the princess! \nThe princess wanted a SNACK of chocolate and bananas!!!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Nope, princess is not taking a nap.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "OK, too bad for the prince");
				break;
			}
		}
	}
}
