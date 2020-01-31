package sample_IA_A_1;

import java.util.ArrayList;
import java.util.Arrays;

//SAMPLE IA_A
public class Controller {

	private ArrayList<String> users = new ArrayList<String>();
	private ArrayList<char[]> passwords = new ArrayList<char[]>();
	
	public Controller() {
		
		users.add("user 1");
		users.add("user 2");
		
		char[] pwd1 = {'p','a','s','s','w','o','r','d','1'};
		char[] pwd2 = {'p','a','s','s','w','o','r','d','1'};
		passwords.add(pwd1);
		passwords.add(pwd2);
		
		
		Login l = new Login(this);
	}
	
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
		System.out.println("SAMPLE IA A - Stage 1");
		System.out.println("Goals");
		System.out.println("1. Set up a Model-View-Control Structure");
		System.out.println("2. Practice setting up a class structure");
		System.out.println("3. Practice using pre-existing classes");
		System.out.println("4. Set up a basic GUI");
		Controller c = new Controller();
	}
}
