package OptionDMay2016;

public class Group {

	private String name; // name of group
	private int number; //number of rooms allocated to the group
	
	//Change from the exam:
	// I have moved this field to the correct location and have
	// encapsulated.  In the exam this array is shown in a location
	// which presents a number of issues.  The fact that the array
	// is no encapsulated is problematic in terms of 
	// software design
	private int[] gRooms;
	
	public Group (String name, int number) {
		
		this.name = name; 
		this.number = number; 
		gRooms = new int[number];
	}
	
	public String getName() { return name; }
	public int getNumber() { return number; }
	
	//BAD: This is the line of code from teh exam that has been removed
	//and done in a better way. Note the explaination up with the
	//fields.
	
	//int[] gRooms = new int[number];
	
	//CHANGE:  I have removed the parameter gRooms from this method
	//as the question is really referring the the instance field.  
	//therefore there is no need to pass a parameter.  
	//THIS IS A SIGNIFICANT ISSUE WITH THIS QUESTION!
	public double bill(Room[] allRooms) {
		
		double bill = 0;
		for (int i = 0; i < gRooms.length; i = i + 1) {
			
			for (int j = 0; j < allRooms.length; j = j + 1) {
				
				if (gRooms[i] == allRooms[j].getRoomNumber()) {
					bill = bill + allRooms[j].getPrice();
					break;
				}
				
			}
		}
		
		return bill;
		
	}
}
