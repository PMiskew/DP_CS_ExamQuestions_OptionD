package sample_IA_A_2;
import java.util.ArrayList;
import java.util.Arrays;


//SAMPLE IA_A
public class Controller {
	
	private ArrayList<User> userslist = new ArrayList<User>();
	/**
	 * Constructor 
	 */
	public Controller() {
		
		//Created some users
		char[] pw = {'a','a'};
		User u1 = new User("Paul Miskew",32,"Mr. Smith",pw);
		User u2 = new User("Paul Miskew",32,"Mr. Smith",pw);
		User u3 = new User("John Bunion",32,"Mr. Smith",pw);
	
		userslist.add(u1);
		userslist.add(u2);
		userslist.add(u3);
		
		
		
		Login l = new Login(this);
	}
	
	/**
	 * 
	 * @param u
	 * @param p
	 * @return
	 * 
	 */
	public int checkpasswordNONALPHA(String u, char[] p) {
		
		for (int i = 0; i < userslist.size(); i = i + 1) {
			/*
			 * userslist contains a user
			 * userslist.get(i).getName()
			 * 	  GETS USER
			 * 
			 * 
			 */
			String n = userslist.get(i).getUserName();
			
			if (n.equals(u)) { //user name is valid
				System.out.println("user name good");
				char[] c = userslist.get(i).getPassword();
				
				if (Arrays.equals(p, c)) {
					return 0; //password is valid - user name is valid
				}
				else {
					return 1; //password is invalid
				}
				
			}
		}
		return 2; //username is invalid
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("SAMPLE IA A - Stage 1");
		System.out.println("Goals");
		System.out.println("1. Set up a Model-View-Control Structure");
		System.out.println("2. Practice setting up a class structure");
		System.out.println("Class Structure");
		System.out.println("Part 1: Attribites/Fields");
		System.out.println("Part 2: Constructors ");
		System.out.println("Part 3: Behaviours/Methods");
		
		System.out.println("3. Practice using pre-existing classes");
		System.out.println("4. Set up a basic GUI");
		
		//This starts our program.  Everything gets built and started
		//in the controller constructor.  The program then waits for 
		//something to happen. 
		Controller c = new Controller();
	}
}
