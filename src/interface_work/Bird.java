package interface_work;

public class Bird extends Animal implements Flyable{

	private int wingspan;
	
	public void grow() { 
		System.out.println("Growing BIRD");
		wingspan = wingspan + 1;
	}
	
	public void fly() {
		setEnergy(getEnergy() - 1);
	}

	@Override
	public void crash() {
		// TODO Auto-generated method stub
		
	}
}
