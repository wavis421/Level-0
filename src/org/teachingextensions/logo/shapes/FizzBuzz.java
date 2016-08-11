package org.teachingextensions.logo.shapes;

import javax.swing.JOptionPane;

public class FizzBuzz {
	public static void main(String[] args) {
		int num1 = 3, num2 = 5;
		String results = "";
		
		for (int i = 1; i <= 30; i++)
		{
			if (i % num1 == 0 && i % num2 == 0)
				results += "FizzBuzz";
			else if (i % num1 == 0)
				results += "Fizz";
			else if (i% num2 == 0)
				results += "Buzz";
			else
				results += i;
			if (i != 30)
				results += ", ";
		}
		JOptionPane.showMessageDialog(null, results);
	}
}
