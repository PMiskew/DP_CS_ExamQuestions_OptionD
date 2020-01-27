package practice_test_solutions;
/*
 * 
 * Responses to questions from test. 
 * 
 * 1.  What is the difference between a class and an object?
 * 
 * 		A class is a blueprint used to create an instance of the class.  The
 * 		instance of the class is the object.  One class can be used to make 
 *		many objects.  For example, the blueprints to make a bike are the class
 *		and any bike built using the blueprints is an object. 
 *
 * 2. What is the differnce between a call to a class (static) method an an instance  method?
 * 	
 * 		A class/static method does not need an implied object.  This means that when calling 
 * 		a class/static method you use the name of the class.  For example the pow method in 
 * 		in the Math class is a static class/method, which means to invoke it we use: 
 * 
 * 		Math.pow(1,2);
 * 
 * 		However, the substring method in the String class is a non-static method meaning we 
 * 		need an instance to call it.  For example String.substring(3,4) is invalid since 
 * 		we don't know what stirng is being acted on.  To use substring you must use a String
 * 		to invoke it. For example
 * 
 * 		String word = "tower";
 * 		word.substring(0,4);
 * 
 * 		Static methods can not access non-static fields or methods.
 * 
 * 3. What is encpasulation?  What is it used?
 * 
 * 		Encapsulation is the process of protecting fields and methods using the private
 * 		or protected modifier.  These limit who can access the fields or methods.  With 
 * 		fields this is particularly useful because all error checking can be done inside
 * 		the method by using get or set methods that manage access.  This means updating
 * 		code is significanly simplified and a when sharing a piece of code that is developed
 * 		all users will have the same restrictions. 
 * 
 * 
 * 
 * 
 * 
 */


public class Player {

	private String name;
	private int[] stats;
	
	
	public Player() {
		
		//This line isn't necessary since strings are defaulted to null
		name = null;
		//You have to do this! Notice that in the fields the stats reference has been
		//made, but the stats array isself hasn't been constructed. 
		//The right hand side "new int[3]" is constructing the array.  
		stats  = new int[3];
	}
	
	public Player(int p, int h, int d, String n) {
		name = n;
		//You need the below line or you will get a null reference error
		stats = new int[3];
		stats[0] = p;
		stats[1] = h;
		stats[2] = d;
		
	}
	
	
	
	/*
	*	This method takes three integers h, p, and d (0 <= h,p,d <= 100).  
	*	The array stats is set to {h,p,d}.  The stats must be validated. 
	*	If they are valid they are left unchanged else they are randomly 
	*	set. 
	*	
	*	Pre-Conditions: The array stats has been declared and initialized 
	*					correctly. 0 <= h,p,d <= 100
	* 
	*	Post-Condition:	Only the stats field has been modified.  No other *				fields have been changed. 
	*/
	public void setStats(int h, int p, int d)  {
		//QUESTION C: Always take note of the pre and post conditions. 
		stats[0] = h;
		stats[1] = p;
		stats[2] = d;
	}

	/*
	*	This method checks if the stats elements are valid.  NOTE:  YOU 
	*	DON’T KNOW HOW IT WORKS, IT JUST DOES.  If the stats are valid 
	*	they are left unchanged.  If the states are not valid they are 
	*	randomized to valid states.
	*
	*	Pre-Conditions: The array stats has been declared and initialize 
	*					correctly. 
	* 
	*	Post-Condition:	Only the stats field has been modified.  No other 
	*					fields have been changed.
	*/
	public void validateStats() {
		//implementation not shown on test
		//I have written a "pretend version"
		if (stats[0] < 0 || stats[0] > 100) {
			stats[0] = (int)(Math.random()*101);
		}
		if (stats[1] < 0 || stats[1] > 100) {
			stats[1] = (int)(Math.random()*101);
		}
		if (stats[2] < 0 || stats[2] > 100) {
			stats[2] = (int)(Math.random()*101);
		}
	}
	
	public String toString() {
		
		//A lot of students forget how to use the \n command. 
		String temp = "Player: "+name+"\nHealth: "+stats[0]+"\nAttack: "+stats[1]+"\nDefense: "+stats[2];
		return temp;
	}
	
	public static Player battle(Player o1, Player o2) {
	
		//This question is asking that you return a reference to the winning player. 
		//DO NOT make a new copy just return the reference. 
		
		if (o1.stats[0] + o1.stats[1] + o1.stats[3] == o2.stats[0] + o2.stats[1] + o2.stats[3]) {
			return null;
		}
		if (o1.stats[0] + o1.stats[1] + o2.stats[3] > o1.stats[0] + o2.stats[1] + o2.stats[3]) {
			return o1;
		}
		
		return o2;
		
	}


}
