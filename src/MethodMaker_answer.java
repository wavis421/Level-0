import javax.swing.JOptionPane;

public class MethodMaker_answer {
	void go() {
		// 2. Call the method created in step 1
		whatIsYourName();
		
		// 4. Call the method you created in step 3 with an int parameter that tells 
		//    how old you will be by the end of this year
		whatYearWereYouBorn(59);
		
		// 6. Call the method created in step 5 with a String and an int parameter
		repeat("echo", 10);
		
		// 8. Call the method created in step 7 with 2 integers, multiply these numbers and display the result.
		multiply(5, 8);
	}

	// 1. Create a method that asks the user's name and says they ROCK!
	//    Hint: void methodName() {   }
	void whatIsYourName() {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, name + ", you ROCK!!");
	}
	
	// 3. Create a method that has an int parameter for how old you will be at the end of this year, 
	//    and creates a pop-up that tells you what year you were born.
	//    Hint: void methodName(int age) {    }
	void whatYearWereYouBorn(int age) {
		JOptionPane.showMessageDialog(null, "You will be " + age + " by the end of this year and were born in " + (2017-age));
	}
	
	// 5. Create a method with a String parameter and an int parameter "numTimes" which
	//    prints the String parameter "numTimes".
	//    No more hints for creating method! Copy what you did in steps 1 & 3, but with different parameter types.
	void repeat(String s, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}
	
	// 7. Create a method that multiplies 2 numbers that are passed in as parameters
	//    and displays the results in a pop-up.
	void multiply (int x, int y) {
		JOptionPane.showMessageDialog(null, x + " X " + y + " = " + (x*y));
	}

	public static void main(String[] args) {
		new MethodMaker_answer().go();
	}
}
