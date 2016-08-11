package org.teachingextensions.logo.shapes;

import javax.swing.JOptionPane;

public class Fibinachi {
	public static void main(String[] args) {
		int last1 = 1, last2 = 0;
		int next;
		String result = "Result: " + last2 + ", " + last1;
		for (int i = 0; i < 20; i++) {
			next = last1 + last2;
			result += ", " + next;
			last2 = last1;
			last1 = next;
		}
		JOptionPane.showMessageDialog(null,  result);
	}

}
