package org.teachingextensions.logo.shapes;

import javax.swing.JOptionPane;

public class PrimeChecker {

	public static void main(String[] args) {
		String divisors;

		for (int j = 0; j < 30; j++) {
			divisors = "";
			String numStr = JOptionPane.showInputDialog("Enter number: ");
			if (numStr.equals(""))
			{
				JOptionPane.showMessageDialog(null,  "Thanks for playing!");
				break;
			}
			int numInt = Integer.parseInt(numStr);

			for (int i = 2; i < numInt; i++) {
				if (numInt % i == 0) {
					divisors += i + " ";
				}
			}

			if (divisors == "") {
				JOptionPane.showMessageDialog(null, numStr + " is Prime");
			} else {
				JOptionPane.showMessageDialog(null, numStr + " is NOT Prime.\nDivisors are " + divisors);
			}
		}
	}

}
