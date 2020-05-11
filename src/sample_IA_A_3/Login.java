package sample_IA_A_3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//SAMPLE IA_A
public class Login {

	/*
	 * When building a basic GUI we have to do three things
	 * 	1. Construct the object to put on the screen
	 * 	2. Configure it - Set attributes, attach listeners
	 * 	3. Place it on the screen. 
	 * 
	 * 	I am doing this manually but there are lots of software packages out there
	 *  that will actually allow to draw your interface and generate your code. 
	 *  
	 * 
	 */
	private JFrame frame = new JFrame("Login");
	private JPanel panel = new JPanel();
	
	private JLabel loginL = new JLabel("Login");
	private JLabel pwordL = new JLabel("Password");
	
	private JLabel resultL = new JLabel("");
	
	private JTextField loginENT = new JTextField();
	private JPasswordField pwordENT = new JPasswordField();
	
	private JButton loginBTN = new JButton("Login");
	private JButton newUserBTN = new JButton ("New User");
	
	
	
	private Controller control;
	
	/*
	 * This is how we create listeners
	 * ActionListeners are teh same ideas as KeyListeners or MouseListeners
	 * They are examples of INTERFACES. 
	 * IB does not require you to know about interfaces. 
	 * Interfaces are a great opportunity to show your knowledge in part C of IA. 
	 * 
	 * Listener is a function that is executed when something happens. 
	 * 
	 * If you want to learn more about interfaces please set up a meeting and we 
	 * can go over it.  You need to first explore ABSTRACT CLASSES. Please see
	 * interface_work project. 
	 * 
	 * All you need to know
	 * 	- We are created event driven programs.  This means that a function is run when an "EVENT" happens
	 *  - There are two steps
	 *  		- Create the function, or sometimes called the "listener"
	 *  		- Bind the function to an element. 
	 * 
	 */
	private ActionListener loginLSN = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			//TELL ME FOUR THINGS ABOUT THE LISTENER CODE:
			/*
			 * 	1. actionPerformed returns void
			 *  2. actionPerfored takes an ActionEvent object as a parameter
			 *  		ActionEvent objects are how to check which button was clicked. 
			 *  		You can use the object e to get all sorts of information about
			 *  		who called the listener.  
			 * 
			 * 
			 * 
			 */
			
			// TODO Auto-generated method stub
			String u = loginENT.getText();
			char[] pwd = pwordENT.getPassword();
			
			int result = control.checkpasswordNONALPHA(u,pwd);
			System.out.println(result);
			if (result == 0) {
				resultL.setText("Login Valid");
			}
			else if (result == 1) {
				resultL.setText("Invalid Password");	
			}
			else {
				resultL.setText("Invalid User");
			}
		}
		
		
	};
	
	public ActionListener newUserLSN = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			NewUser newUserWindow = new NewUser();
		}
		
		
	};
	
	/*
	 * Four Facts About Constructor Code:
	 * 
	 * 	- it addes elements to panel using the INSTANCE method add
	 *  - the constructor takes a controll reference, sets control to the passed controller reference. 
	 *  - binds loginLSN to loginBTN using the addActionListener INSTANCE METHOD
	 *  - JFrame.EXIT_ON_CLOSE is accessing a STATIC CONSTANT from the JFrame 
	 * 
	 * 
	 */
	
	public Login(Controller c) {
		
		
		//This opens a line of communication to the controllor that acts as a conduite to the data. 
		control = c;
		
		//configure elements - Makes them pretty and places around
		loginENT.setColumns(20);
		pwordENT.setColumns(20);
		loginBTN.addActionListener(loginLSN);
		newUserBTN.addActionListener(newUserLSN);
		//setup panel - adds all the widgets to the panel
		panel.add(loginL);
		panel.add(loginENT);
		panel.add(pwordL);
		panel.add(pwordENT);
		panel.add(loginBTN);
		panel.add(newUserBTN);
		panel.add(resultL);
		
		//set up frame
		frame.add(panel);  //adds panel to frame
		frame.pack(); // quickly organizes them (LOTS TO PLAY WITH HERE)
		frame.setVisible(true); //displays the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //shut down program 
		
		
	}
	
}
