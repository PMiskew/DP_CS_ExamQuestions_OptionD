package interface_work;


//To link an interface we implement it.  This means that they must have
//any methods that are listed in the interface
public class Plane implements Flyable {

	private int fuel;
	
	public void fly() { fuel = fuel - 1; }

	@Override
	public void crash() {
		fuel = 0;
	}
	
}
