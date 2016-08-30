import javax.swing.JOptionPane;

public class ArmanExam2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int age2 = Integer.parseInt(age);
		int yearBorn = 2016 - age2;
		JOptionPane.showMessageDialog(null, "You were born in " + yearBorn);
		if (age2 >= 30) {
			JOptionPane.showMessageDialog(null, "You are too old to be playing this game");

		}

	}
}