import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class DelaraExam1 {

    public static void main(String[] args) {
    	Robot a = new Robot();
    	a.setSpeed(10);
    	String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
    	if (color.equals("red")){
    		a.setPenColor(Color.red);
    	} else if (color.equals("orange")){
    		a.setPenColor(Color.orange);
    	} else if (color.equals("yellow")){
    		a.setPenColor(Color.yellow);
    	} else if (color.equals("green")){
    		a.setPenColor(Color.green);
    	} else if (color.equals("blue")){
    		a.setPenColor(Color.blue);
    	}
    	a.setPenWidth(10);
    	a.penDown();
    	for (int i = 0; i < 4; i++) {
			a.move(100);
			a.turn(90);
		}
    }
}