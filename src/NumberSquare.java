import javax.swing.JOptionPane;

public class NumberSquare {
	public static void main(String[] args) {
		String size;
		int sizeInt;

		for (int cnt = 0; cnt < 10; cnt++) {
			size = JOptionPane.showInputDialog("Enter size of square");
			sizeInt = Integer.parseInt(size);
			for (int i = 1; i <= sizeInt * sizeInt; i += sizeInt) // rows
				drawRow(sizeInt, i);

			System.out.println();   // Extra line between examples
		}
	}

	private static void drawRow(int sizeInt, int i) {
		for (int j = 0; j < sizeInt; j++) // columns
			System.out.print(String.format("%3d ", j + i));
		
		System.out.println();
	}
}
