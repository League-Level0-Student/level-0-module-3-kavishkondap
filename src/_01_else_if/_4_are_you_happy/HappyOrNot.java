package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class HappyOrNot {
public static void main(String[] args) {
	String answer1 = JOptionPane.showInputDialog(null,"Are you happy?");
			if(answer1.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Then keep doing whatever you're doing!");
			}else if (answer1.equals("no")) {
		String	answer2 = 	JOptionPane.showInputDialog("Do you want to be happy?");
		if(answer2.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Then Change Something!");
			
		}else if(answer2.equals("no")) {
			JOptionPane.showMessageDialog(null, "Then keep doing your thing");
		}
		
			}
	
	
	
	
	
	
	
}
}
