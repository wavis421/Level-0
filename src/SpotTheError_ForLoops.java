import javax.swing.JOptionPane;

public class SpotTheError_ForLoops {
	public static void main(String[] args) {
		String repeat = JOptionPane.showInputDialog("how many Beullers?");
		int numRepeats = Integer.parseInt(repeat);
		for (int i = 0; i < numRepeats; i++) {
			System.out.println("Beuller");
		}

		String answer = JOptionPane.showInputDialog("How many bottles?");
		int bottles = Integer.parseInt(answer);
		for (int i = bottles; i > 0; i--) {
			JOptionPane.showMessageDialog(null, i + " green bottles hanging on the wall  \nCrash!!!!");
		}
		JOptionPane.showMessageDialog(null, "There's a lot of broken glass out here");

	}
}
