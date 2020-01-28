package interface_work;
/*
 * If you are design a heirarchy and no one will ever create an instance, you can 
 * make the class abstract.
 * The beauty of abstract classes is you can remove all downcasting by inclding 
 * an abstract method.  If you have one abstract method the class must be abstract
 * abstract methods have NO CODE!!!! They are simply reassurance that code will be
 * be found int eh subclass.  
 * Beacause all subclasses have a grow method, we can make that abstract. 
 */
public abstract class Animal {

	private int energy;
	
	
	public void setEnergy(int a) {
		energy = a;
	}
	
	public int getEnergy() { return energy; }
	
	public void move() { 
		System.out.println("MOVING");
		energy = energy - 1; 
	}
	public void eat() {
		System.out.println("EATING");
		energy = energy + 1;
	}
	
	//This is a way of saying anything that extends animal must have this method
	public abstract void grow();
	
}
