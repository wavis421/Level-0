import javax.swing.JOptionPane;

public class HappyPetSolution {
	public static void main(String[] args) {
		String petType = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		int happinessLevel = 0;

		for (int i = 0; i < 20; i++) {
			int task = JOptionPane.showOptionDialog(null, "What would you like to do?", "Love your pet", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle your " + petType, "Feed your " + petType,
							"Give your " + petType + " some water", "Take your " + petType + " for a walk",
							"Groom your " + petType, "Clean up your " + petType + "'s poop" },
					null);

			if (task == 0) { // Cuddle
				JOptionPane.showMessageDialog(null, "Purrrr");
				happinessLevel++;
			} else if (task == 1) { // Feed
				JOptionPane.showMessageDialog(null, "Munch-munch");
				happinessLevel++;
			} else if (task == 2) { // Water
				JOptionPane.showMessageDialog(null, "Slurp-slurp");
				happinessLevel++;
			} else if (task == 3) { // Walk
				JOptionPane.showMessageDialog(null, "pitter-patter");
				happinessLevel++;
			} else if (task == 4) { // Groom
				JOptionPane.showMessageDialog(null, "I feel so clean!!");
				happinessLevel++;
			} else if (task == 5) { // Poop
				JOptionPane.showMessageDialog(null, "stinky!!!!");
				happinessLevel++;
			}
			
			if (happinessLevel >= 6)
				break;
		}
		JOptionPane.showMessageDialog(null, "I can tell you love your " + petType);
	}
}
