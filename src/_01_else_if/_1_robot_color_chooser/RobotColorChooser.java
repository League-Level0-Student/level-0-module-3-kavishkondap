
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot bob = new Robot ();
		bob.setSpeed(25);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bob.penDown();
	for (int i = 0; i < 1000000000; i++) {
		
	
		for (int j = 0; j < 4; j++) {
			bob.move(300);
			bob.turn(90);
		}
		//3. Set the pen width to 10
		bob.setPenWidth(10);
		
		//4. Ask the user what color pen they would like the robot to draw with
	String answer = JOptionPane.showInputDialog(null,"What color would you like? The options are red blue green and random");
		//5. Use an if/else statement to set the pen color that the user requested
		if (answer.equals("red")) {
			bob.setPenColor(255, 0, 0);
		}else if(answer.equals("blue")) {
			bob.setPenColor(0, 0, 255);
		}else if(answer.equals("green")) {
			bob.setPenColor(0, 255, 0);
		}else {
			bob.setRandomPenColor();
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

	}



	}
}
