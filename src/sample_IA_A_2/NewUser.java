package sample_IA_A_2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

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
	
	//Step 1: Create the object
	private JLabel nameLabel = new JLabel("Full Name");
	private JTextField nameField = new JTextField("",20);
	private JLabel pwLabel = new JLabel("Password");
	private JPasswordField pwField = new JPasswordField("",20);
	private JLabel pwcLabel = new JLabel("Password Confirm");
	private JPasswordField pwcField = new JPasswordField("",20);
	
	private JButton submit = new JButton("Submit");
	
	private Controller control;
	
	/*
	 * An action listener is an interface.  An inteface only
	 * has abstract classes.  This means you have to write your
	 * own implementation
	 */
	private ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//CODING BAT PROBLEM: GIVEN TWO STRINGS DOES str1 == str2
			System.out.println("BUTTON PRESSED");
			
			//I want to build a new user
			String name = nameField.getText();
			//Error checking to ensure name is valid: If user name is
			//<first initial><Last name>, this means there must two words
			//separated by a space. 
		
			String password1 = pwField.getText();
			String password2 = pwcField.getText();
			//Password error checking
			
			//Convert password1 to array of char
			char[] pw = {'a','b','c'};
			
			User nw = new User(name, 100, "Mr. Miskew", pw);
			//HOW DO NewUser Class get access to the controller
			
			System.out.println(name);
			System.out.println(password1);
			
			System.out.println(control);
			frame.dispose();
			
		}
		
		
	};
	
	/*
	 * Never specify return type
	 * Same name as class
	 */
	public NewUser(Controller c) {
		
		control = c;
		System.out.println("CONSTRUCTOR: "+c);
		/*
		 * 
		 *    Frame --> XXXXXXXXXXXX
		 *              X          X
		 * 				X  PANEL   X
		 * 				X          X
		 * 				XXXXXXXXXXXX
		 */
		System.out.println("Creating new user");
		//setLayout is an instance method - An instance method is a method
		//that can only be invoked with a constructed object. 
		//setLayout takes a GridBagLayout object.
		panel.setBorder(new EmptyBorder(20,20,20,20));
		panel.setLayout(new GridBagLayout());
		
		//I use a gridbag constraint object to give information about
		//how to add elements to a panel. 
		GridBagConstraints gcb = new GridBagConstraints();
		
		gcb.gridwidth = GridBagConstraints.REMAINDER;
		gcb.fill = GridBagConstraints.HORIZONTAL;
		
		//Step2: Add the widget/object to the panel
		panel.add(nameLabel,gcb);
		panel.add(nameField,gcb);
		panel.add(pwLabel,gcb);
		panel.add(pwField,gcb);
		panel.add(pwcLabel,gcb);
		panel.add(pwcField,gcb);
		
		panel.add(submit,gcb);
		submit.addActionListener(action);
		
		frame.add(panel);
		
		frame.pack();
		/*
		 * 
		 * setDefaultCloseOperation is an instance method since it invoked with an instance
		 * setDefaultCloseOperation takes a single parameter - ??
		 * Look in the documentation for JFrame
		 * EXIT_ON_CLOSE is an int value
		 * It is static field since it is being access by the name of the class
		 * It is a constant value since it is all caps. 
		 * 
		 * We had this line for tests, but want to remove it for our actual program
		 * because when I close this window I don't want everything to close
		 */
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		//Testing to make it sure it looks right.
		//NewUser window = new NewUser();
		
	}
}
