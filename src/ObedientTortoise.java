import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		drawSquare();
		drawCircle();
		drawTriangle();
	}

	private static void drawSquare() {
		Tortoise.penDown();
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
		Tortoise.penUp();
	}
	
	private static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(360/3);
		}
	}
	
	private static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
}
