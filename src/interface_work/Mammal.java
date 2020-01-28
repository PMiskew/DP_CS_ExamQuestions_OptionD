package interface_work;

public class Mammal extends Animal {

	private int hairlength;
	
	public void grow() { 
		System.out.println("Growing Mammal");
		hairlength = hairlength + 1;
	}
}
