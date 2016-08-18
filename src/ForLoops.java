
public class ForLoops {
	
	public static void main(String[] args) {
		String output;
		for (int i = 1; i < 10; i++)
		{
			output = "";
			for (int j = 0; j < i; j++)
			{
				output += "*";
			}
			System.out.println(output);
		}
	}

}
