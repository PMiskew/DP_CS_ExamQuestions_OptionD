package sample_IA_A_2;


public class User {
	
	//Fields:
	private String name;
	private int age;
	private String email;
	private String teacher;
	private String userName;
	private char[] password;
	

	//Static Field - shared by all instances. 
	private static int count = 0;
	
	//Constructors
	/*
	  1. You can overload them. 
	  2. Has to have the same name as the class
	  3. It is a special instance method. 
	  4. returns a reference to the object. 
	  		- Common misunderstanding is constructors return nothing. 
	  		- We don't specify a return type.
	//*/
	public User(String n, int a, String t, char[] pw) {
		
		name = n;
		age = a;
		teacher = t;
		password = pw;
		
		count = count + 1;
		
		//Highlight an algorithms
		// You might write a flowchart for this and explore it in more detail. 
		/* 
		 * The user name will always be the first initial and the last name. 
		 * Assume pre-condition: name is always the format <first name> <last name>
		 */
		
		//Paul Miskew
		int space = name.indexOf(" ");
		userName = name.charAt(0) + name.substring(space + 1) + count;
		
		
	}
	
	public String toString() {
		String result = "name: "+name;
		result = result + "\n"+userName;
		return result;
	}

	
	//Get Methods - instance
	public String getName() { return name; }
	public int getAge() { return age; }
	public String getTeacher() { return teacher; }
	public String getUserName() { return userName; }
	public char[] getPassword() { return password; }
	
	//Set Methods - instance
	public void setName(String n) { name = n; };
	public void setAge(int a) { age = a; }
	public void setTeacher(String t) { teacher = t; }
	public void setPassword(char[] pw) { password = pw; }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] pw = {'a','a'};
		User u1 = new User("Paul Miskew",32,"Mr. Smith",pw);
		System.out.println(u1);
		
		User u2 = new User("Paul Miskew",32,"Mr. Smith",pw);
		System.out.println(u2);
		
		User u3 = new User("John Bunion",32,"Mr. Smith",pw);
		System.out.println(u3);
		
		
	}

}
