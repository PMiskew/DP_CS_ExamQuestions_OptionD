import java.util.ArrayList;

//This code is base on Nov 2019 D # 18

//Comments on this question:
/*
 * 
 * Students writing this question sometimes feel a little chanlleneged in 
 * that is does require them to make some assumptions about the class.
 *  
 * 1)	This question states "the class is partially shown", which means there 
 * 	  	are other possibly fields and methods. Any assumption can be made, provided
 * 		it makes sense in teh context of the problem.  The easiest assumption is
 * 		to assume an INSTANCE METHOD called isGold() which returns True if 
 * 		status is gold and false otherwise.  
 * 
 * 2)	The location of the function goldMails() isn't indicated.  Many students
 * 		assume it is in the Customer class.  However, it would make more sense to 
 *		be in a class that uses the Customer class.  The class (in our example called 
 *		CustomerRunner) that has an ArrayList of Customers is separate meaning we have 
 *		to assume allCustomers is either a local variable in the method, a field
 *		in the class (static or instance depending on situation) or a passed parameter.
 *		In this case I passed the ArrayList as a parameter. 
 * 
 */
public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: 
		//Create an ArrayList of Customers
		ArrayList<Customer> allCustomers = new ArrayList<Customer>();
		
		//Step 2: 
		//Create some objects
		allCustomers.add(new Customer("customer 1","customer1@cust.com"));
		allCustomers.add(new Customer("customer 2","customer2@cust.com"));
		allCustomers.add(new Customer("customer 3","customer3@cust.com"));
		allCustomers.add(new Customer("customer 4","customer4@cust.com"));
		
		//Step 3:
		//Set some gold status
		allCustomers.get(1).changeStatus(); //sets customer 2 gold
		allCustomers.get(3).changeStatus(); //sets customer 4 gold
		
		//Step 4: 
		//Create a new ArrayList to hold the ArrayList that goldMails will
		//return
		
		ArrayList goldEmails = goldMails(allCustomers);
		
		
		//Step5:
		//Check by printing out the arraylist to the screen
		//Notice, when I print an ArrayList I don't get a reference to the object
		//but a nice representation.  This is because ArrayLists have an OVERRIDDEN 
		//toString method
		System.out.println(goldEmails);
		
		
	}
	
	/**
	 * This method takes an ArrayList of Customers it goes through
	 * each element and copies the email address of the gold customers
	 * into an ArrayList of Strings to return. 
	 * @param list
	 * @return
	 */
	public static ArrayList<String> goldMails(ArrayList<Customer> list) {
		
		ArrayList<String> results = new ArrayList<String>(); //create list to hold results
		
		for (int i = 0; i < list.size(); i = i + 1) {
			
			//The exam solution has this if statement
			if (list.get(i) != null) {
				if (list.get(i).isGold()) {
					//One Liner
					//results.add(list.get(i).getEmail());
			
					//Break it down
					Customer tempCust = list.get(i); //get Customer object from list
					String tempEmail = tempCust.getEmail(); //get email from Customer object
					results.add(tempEmail); //add email to result list
				}
			}
			
		}
		
		
		return results;
	}

}
