package org.teachingextensions.logo.shapes;


// Copyright The League of Amazing Programmers 2014

import javax.swing.JOptionPane;

/*

 * I have a pocket full of change. I hate doing math. Make me a program that

 * will calculate how much money I have without me having to use my brain. Then

 * make me a sandwich.

 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String nickles = JOptionPane.showInputDialog("How many nickels do you have?");
		int numNickels = Integer.parseInt(nickles);

		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int numDimes = Integer.parseInt(dimes);

		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int numQuarters = Integer.parseInt(quarters);

		double money = (numNickels * 0.05) + (numDimes * 0.10) + (numQuarters * 0.25);

		JOptionPane.showMessageDialog(null, "You have $" + String.format("%.2f", money) + " in cash!");
	}

}
