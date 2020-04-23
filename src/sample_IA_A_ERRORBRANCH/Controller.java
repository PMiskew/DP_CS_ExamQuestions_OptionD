package sample_IA_A_ERRORBRANCH;

import java.util.ArrayList;
import java.util.Arrays;

//SAMPLE IA_A
public class Controller {

	private ArrayList<String> users = new ArrayList<String>();
	private ArrayList<char[]> passwords = new ArrayList<char[]>();
	
	public Controller() {
		
		//For this section to work the users must be entered
		//alphabetically
		users.add("user 1");
		users.add("user 2");
		users.add("user 3");
		users.add("user 4");
		users.add("user 5");
		users.add("user 6");
		char[] pwd1 = {'p','a','s','s','w','o','r','d','1'};
		char[] pwd2 = {'p','a','s','s','w','o','r','d','1'};
		char[] pwd3 = {'p','a','s','s','w','o','r','d','1'};
		char[] pwd4 = {'p','a','s','s','w','o','r','d','1'};
		char[] pwd5 = {'p','a','s','s','w','o','r','d','1'};
		char[] pwd6 = {'p','a','s','s','w','o','r','d','1'};
			
		passwords.add(pwd1);
		passwords.add(pwd2);
		passwords.add(pwd3);
		passwords.add(pwd4);
		passwords.add(pwd5);
		passwords.add(pwd6);
		
		
		Login l = new Login(this);
	}
	
	
	/**
	 * STAGE 2:
	 * 
	 */
	public void addUser(String u, char[] pwd) {
		
		for (int i = 0; i < users.size(); i = i + 1) {
			
			if (users.get(i).compareTo(u) < 0) {
				users.add(i,u);
				passwords.add(i,pwd);
			}
		}
	}
	
	/**
	 * STAGE 1 
	 * @param u
	 * @param p
	 * @return
	 */
	public int checkpasswordNONALPHA(String u, char[] p) {
		
		for (int i = 0; i < users.size(); i = i + 1) {
			if (users.get(i).equals(u)) {
				System.out.println("user name good");
				if (Arrays.equals(p, passwords.get(i))) {
					return 0;
				}
				else {
					return 1;
				}
			}
		}
		return 2;
	}
	public static void main(String[] args) {
		System.out.println("SAMPLE IA A - Stage 2");
		System.out.println("Goals");
		System.out.println("1. Talk about benefits of ordered data");
		System.out.println("2. Show and example of a binary search");
		System.out.println("3. Identifying button that is clicked");
		System.out.println("4. Adding new user alphabetically");
		Controller c = new Controller();
	}
}
