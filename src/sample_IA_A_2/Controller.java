package sample_IA_A_2;

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
		System.out.println("SAMPLE IA A - Stage 2");
		System.out.println("Goals");
		System.out.println("1. Talk about benefits of ordered data");
		System.out.println("2. Show and example of a binary search");
		Controller c = new Controller();
	}
}
