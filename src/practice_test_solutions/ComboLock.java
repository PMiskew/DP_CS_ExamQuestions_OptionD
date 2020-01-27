package practice_test_solutions;

/*
 * The short response on this paper were the saem as the paper
 * that had the Player class example
 */
public class ComboLock {

	
	private boolean isLocked;	//true if locked and false if not locked.  
	private int[] combo;		//stores the three int values for the lock

	public ComboLock() {
		isLocked = false;
		//need this since the array has not been constructed yet. 
		combo = new int[3];
		
	}
	
	public ComboLock(int a, int b, int c) {
		
		combo[0] = a;
		combo[1] = b;
		combo[2] = c;
				
	}
	
	//d)
	public String toString() {
		
		String temp = "";
		
		if (isLocked == true) {
			temp = "The lock is locked";
		}
		else {
			temp = "The lock is not locked";
		}
		
		temp = temp + "\nCombo: "+combo[0]+","+combo[1]+","+combo[2];
		return temp;
	}
	
	//e)
	public boolean equals(ComboLock other) {
		
		//Don't forget null check
		if (other != null) {
			return this.combo[0] == other.combo[0] && this.combo[1] == other.combo[1] && this.combo[2] == other.combo[2];
		}
		return false;
		
	}
	
	//f) BIG IDEA - Player class returned a reference where as in this case we
	//				are returning a copy of the larger lock. 
	public static ComboLock copyLargerLock(ComboLock o1, ComboLock o2) {
		
		int o1Total = o1.combo[0] + o1.combo[1] + o1.combo[2];
		int o2Total = o2.combo[0] + o2.combo[1] + o2.combo[2];
		
		if (o1Total > o2Total) {
			
			ComboLock temp = new ComboLock(o1.combo[0],o1.combo[1],o1.combo[2]);
			return temp;
		}
		else {
		
			ComboLock temp = new ComboLock(o2.combo[0],o2.combo[1],o2.combo[2]);
			return temp;
		
		}
		
	}
	/*
	*	This method takes three integers a, b, and c (0 <= a,b,c <= 60).  
	*	The array combo is set to {a,b,c}.  Returns true if new combo is 
	*	secure and false if new combo is not secure.
	*	
	*	Pre-Conditions: The array combo has been declared and initialized 
	*				correctly. 0 <= a,b,c <= 60
	* 
	*	Post-Condition:	Only the combo field has been modified.  No other *				fields have been changed. 
	*/
	public boolean setCombo(int a, int b, int c)  {
	
		combo[0] = a;
		combo[1] = b;
		combo[2] = c;
		
		return isSecure();
	}

	/*
	*	This method will check to see if the combination is considered 
	*	secure.  Note:  YOU DON’T KNOW HOW IT CHECKS, IT JUST DOES.  
	*	Returns true for secure locks and false for insecure locks  
	*	
	*	Pre-Conditions:	Array combo has been properly declared and 
	*			     	initialized.
	* 
	*	Post-Condition:	The implied object is left unchanged. 
	*/
	public boolean isSecure() {
		//Implementation not shown
		//I have made up and implementation for this;
		//If the combined digits are greater than 50 it is secure. 
		//TRY IT: Try and come up with your own rule that tests your skills. 
		return combo[0] + combo[1] + combo[2] > 50; 
	}

}
