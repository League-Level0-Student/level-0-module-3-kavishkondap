package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	String answer1 = JOptionPane.showInputDialog(null,"Do you want to be a ninja or a wizard?");
	if (answer1.equals("ninja")) {
		JOptionPane.showMessageDialog(null,"Your powers are sneaking around and throwing shurikens");
	}else if(answer1.equals("wizard")) {
		JOptionPane.showMessageDialog(null,"Your powers are casting spells and going temporarily invisible");
	}
	String place = JOptionPane.showInputDialog(null,"Do you want to adventure into the caves in the mountains or the deep sea? (enter in caves, or sea)");
	if(place.equals("caves")) {
		 String dragon = JOptionPane.showInputDialog(null,"You stumble upon a dragon in the mountains! Should you hide or attack?");
		 if(dragon.equals("hide"))	{
			 JOptionPane.showMessageDialog(null, "You sneak around the dragon, and steal its treasure!! You live a very wealthy life, but the citzens of the mountain are still terrorized by the dragon!");
		 }else if(dragon.equals("attack")) {
			 JOptionPane.showMessageDialog(null, "You are able to slay the beast, but not without suffering from fatal blows. You die soon after, but the citzens of the mountains are wealthy from all the dragon's treasure, and a  monument is constructed in your honor!");                                                         
		 }
	}else if (place.equals("sea")) {
		String serpent = JOptionPane.showInputDialog(null,"You cross a sea serpent while exploring underwater, should you attack it or hide?");
		if(serpent.equals("hide"))	{
			 JOptionPane.showMessageDialog(null, "You sneak around the serpent, and steal its treasure!! You live a very wealthy life, but the citzens of the sea are still terrorized by the serpent!");
		 }else if(serpent.equals("attack")) {
			 JOptionPane.showMessageDialog(null, "You are able to slay the beast, but not without suffering from fatal blows. You die soon after, but the citzens of the sea are wealthy from all the serpent's treasure, and a  monument is constructed in your honor!");                                                         
		 }
	}
}
}
