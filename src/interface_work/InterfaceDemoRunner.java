package interface_work;

import java.util.ArrayList;

public class InterfaceDemoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mammal m1 = new Mammal();
		Bird b1 = new Bird();
		//Animal a1 = new Animal();
		
		Animal ma1 = new Mammal();
		Animal ba1 = new Bird();
		
		m1.eat();
		m1.move();
		m1.grow();
		
		b1.eat();
		b1.move();
		b1.grow();
		
		//a1.eat();
		//a1.move();
		//a1.grow();  //ERROR Since grow is only in Bird and Mammal
		
		
		ma1.eat();
		ma1.move();
		//This is an error, but we know it will work because we know that the referecen
		//is an Animal, but the object is Mammal, and the Mammal class has instructions 
		//to grow
		//At compile the REFERENCE TYPE IS ASSUMED TO BE THE OBJECT TYPE. 
		//Below line is needed if Animal does NOT have abstract method header grow
		//((Mammal)ma1).grow();
		ma1.grow();
		
		
		ba1.eat();
		ba1.move();
		//Below line is needed if Animal does NOT have abstract method header grow
		//((Bird)ba1).grow();
		ba1.grow();
		
		//Would anyone ever do this?
		//Anything in this design is either a Bird or an Mammal is never an Animal. 
		//Because of this we can make Aniaml an abstract class.  This means that 
		//the programmer CAN NEVER CREATE AN INSTANCE. 
		//Animal a2 = new Aniaml();
		
		//WHAT HAPPENS IF MY DESIGN INCLUDES A PLANE AND THAT PLANE CAN FLY LIKE A BIRD
		//I want to group all flying objects together in a data strcutre
		//Question?  What is my reference type
		
		//ArrayList<Object> flyable = new ArrayList<Object>();
		
		//This is where an interface comes in useful and is exactly what you are doing
		//when you create listeners. 
		//What is an interface:
		//	An interface is a class where ALL METHODS ARE IS ABSTRACT.  THERE NO CODE! 
		//	An inteface might include a static constant field. 
		//	An interface lets you work outside the hierarchy. 
		//	An interface DOES NOT HAVE TO, but often does align with the IS A relationship
		//	A reference can be to an inferace, but you cannot create an instance. 
		
		ArrayList<Flyable> flyable = new ArrayList<Flyable>();
		flyable.add(new Bird());
		flyable.add(new Plane());
		
		
		
		
		
	}
	

}
