import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;


public class ArmanExam1 {

    public static void main(String[] args) {
    	
    	Robot momo = new Robot();
    	
    	String color = JOptionPane.showInputDialog("Do you want the robot to draw yellow or blue?");

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if (color.equals("blue")) {
    		momo.setPenColor(0, 0, 255);
			
		}
    	else if (color.equals("yellow")) {
    		momo.setPenColor(255,  0,  0);
			
		}


    	momo.setPenWidth(10);
    	
    	momo.setSpeed(10);
    	momo.penDown();
    	for (int i = 0; i < 4; i++) {
    		momo.move(100);
    		momo.turn(90);
			
		}
   	 
    }

}