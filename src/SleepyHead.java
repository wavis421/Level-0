
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int weekday = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		if (weekday == JOptionPane.YES_OPTION)
			isWeekday = true;
		else
			isWeekday = false;

		int vacation = JOptionPane.showConfirmDialog(null, "are you on vacation?", "", JOptionPane.YES_NO_OPTION);
		if (vacation == JOptionPane.YES_OPTION)
			isVacation = true;
		else
			isVacation = false;

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
		if (!isWeekday || isVacation)
			System.out.println("sleep in");
		else
			System.out.println("Get up lazybones!");
	}
}
