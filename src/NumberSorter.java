import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String numStr;
		while (true) {
			numStr = JOptionPane.showInputDialog("Sorting 3 numbers. Enter 1st number: ");
			if (numStr == null || numStr.equals("")) break;
			int num1 = Integer.parseInt(numStr);
			
			numStr = JOptionPane.showInputDialog("Enter 2nd number: ");
			if (numStr == null || numStr.equals("")) break;
			int num2 = Integer.parseInt(numStr);
			
			numStr = JOptionPane.showInputDialog("Enter 3rd number: ");
			if (numStr == null || numStr.equals("")) break;
			int num3 = Integer.parseInt(numStr);

			System.out.println(orderThreeNumbers(num1, num2, num3));
		}
	}

	private static String orderThreeNumbers(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			return (num1 + " " + orderTwoNumbers(num2, num3));
		} else if (num2 < num3) {
			return (num2 + " " + orderTwoNumbers(num1, num3));
		} else {
			return (num3 + " " + orderTwoNumbers(num1, num2));
		}
	}

	private static String orderTwoNumbers(int num1, int num2) {
		if (num1 < num2)
			return (num1 + " " + num2);
		else
			return (num2 + " " + num1);
	}
}
