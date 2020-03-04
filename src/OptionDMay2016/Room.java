package OptionDMay2016;

public class Room {

	private int roomNumber;
	private int beds;
	private double price; 
	private boolean empty;
	
	
	
	public Room(int rN, int b, double p, boolean e) {
		roomNumber = rN;
		beds = b;
		price = p;
		empty = e;
		
		
	}
	
	public int getRoomNumber() { return roomNumber; }
	public int getBeds() { return beds; }
	public double getPrice() { return price; }
	public boolean isEmpty() { return empty; }
	
	
	
}
