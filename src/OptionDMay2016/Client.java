package OptionDMay2016;

public class Client {

	private int customerID;
	private String name;
	private Dates arrive; 
	private Dates leave;
	private Room bedroom;
	
	public Client(int id, String c, Dates dateIn, Dates dateOut, Room r) {
		
		setCustomerID(id);
		setName(c);
		setArrive(dateIn);
		setLeave(dateOut);
		setBedroom(r);
		
	}
	
	public void setCustomerID(int id) {customerID = id; }
	public void setName(String c) { name = c; }
	public void setArrive (Dates dateIn) { arrive = dateIn; }
	public void setLeave (Dates dateOut) { leave = dateOut; }
	public void setBedroom(Room r) { bedroom = r; }
	
	public int getCustomerID() { return customerID; }
	public String getName() { return name; }
	public Dates getArrive() { return arrive; }
	public Dates getLeave() { return leave; }
	public Room getBedroom() { return bedroom; }
	
	public void bill() {
		
	
		double bill = bedroom.getPrice();
		String result = "Room: " + bedroom.getRoomNumber();
		result = result + "\n"+arrive.getYear()+"/"+arrive.getMonth()+"/"+arrive.getDay();
		result = result + "\n"+leave.getYear()+"/"+leave.getMonth()+"/"+leave.getDay();
		result = result + Dates.StayDays(arrive, leave);
		result = result + bedroom.getPrice() * Dates.StayDays(arrive, leave);
		System.out.println(result);
		
	}
	
	
	
}
