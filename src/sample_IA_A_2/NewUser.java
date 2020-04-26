package sample_IA_A_2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Class that represents a window that pops up when the the new user button
 * is pressed.
 * 
 * Stage 1: Build this window
 * Stage 2: Add it into the project. 
 */
public class NewUser {

	
	private JFrame frame = new JFrame("New User");
	private JPanel panel = new JPanel();
	
	/*
	 * Never specify return type
	 * Same name as class
	 */
	public NewUser() {
		System.out.println("Creating new user");
		//setLayout is an instance method - An instance method is a method
		//that can only be invoked with a constructed object. 
		//setLayout takes a GridBagLayout object. 
		panel.setLayout(new GridBagLayout());
		
		//I use a gridbag constraint object to give information about
		//how to add elements to a panel. 
		GridBagConstraints gcb = new GridBagConstraints();
		
		System.out.println(GridBagConstraints.EAST);
		gcb.anchor = GridBagConstraints.EAST;
		
		//return Arrays.toString(nums).substring(0,Math.min(8,Arrays.toString(nums).length())).contains("9");

		
		
		
	}
	
	public static void main(String[] args) {
		
		//Testing to make it sure it looks right.
		NewUser window = new NewUser();
		
	}
}
