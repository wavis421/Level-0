import javax.swing.JOptionPane;

public class SimpleCalculator_answer {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			// 1. Get 2 numbers from the user and convert them to integer.
			String num1String = JOptionPane.showInputDialog("Enter first number");
			int num1 = Integer.parseInt(num1String);
			
			String num2String = JOptionPane.showInputDialog("Enter 2nd number");
			int num2 = Integer.parseInt(num2String);

			// Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
					null);

			if (operation == 0) {
				add(num1, num2);
			} else if (operation == 1) {
				subtract(num1, num2);
			} else if (operation == 2) {
				multiply(num1, num2);
			} else if (operation == 3) {
				divide(num1, num2);
			}
			else
				break;
		}
	}
	
	static void add(int num1, int num2) {
		int result = num1 + num2;
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + result);
	}
	
	static void subtract(int num1, int num2) {
		int result = num1 - num2;
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + result);
	}
	
	static void multiply(int num1, int num2) {
		int result = num1 * num2;
		JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + result);
	}
	
	static void divide(int num1, int num2) {
		int result = num1 / num2;
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + result);
	}
}
