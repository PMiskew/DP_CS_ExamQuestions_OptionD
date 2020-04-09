package OptionDMay2016;

public class GClient extends Client{ 
	
	private String name;

	//The solution doesn't show this, but I have added it as 
	//It makes the problem much easier to relate the object 
	//opposed to using the name to find the group some way. 
	
	private Group g;
	
	public GClient(String name, int id, String c, Dates dateIn, Dates dateOut, Room r, Group gr) {
		
		super(id,c,dateIn,dateOut,r);
		g = gr;
		this.name = name;
		
	}
	
	

}
