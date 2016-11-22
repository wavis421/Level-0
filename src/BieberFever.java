
public class BieberFever {
	public static void main(String[] args) {
		sayBaby("oh");
		sayBaby("no");
		sayBaby("oh");
		System.out.println("I thought you'd always be mine");
	}

	private static void sayBaby(String extra) {
		for (int i = 0; i < 3; i++) {
			System.out.print("baby ");
		}
		System.out.println(extra);
	}
}
