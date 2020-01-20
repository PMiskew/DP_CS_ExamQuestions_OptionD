
public class Rectangle {

	private double side1;
	private double side2;
	
	/*
	 * Static/Class Fields: 
	 * 		- 	Static fields are shared by all instances
	 * 		- 	Change a static field once and this is reflected for
	 * 			all instance
	 * 		-	This has memory benefits specifically when there are lots
	 * 			of objects
	 * 		-	A statics field is a great way to keep track of the number
	 * 			of instances of class. 
	 */
	
	private static int rectangleCount;
	
	public Rectangle(Rectangle other) {
		
		this.side1 = other.side1;
		this.side2 = other.side2;
		rectangleCount = rectangleCount + 1;
	}
	
	
	public Rectangle(double a, double b) {
		side1 = a;
		side2 = b;
		rectangleCount = rectangleCount + 1;
	}
	
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getArea() { return side1 * side2; }
	
	/*
	 * Static/Class Methods:
	 * 		-	Static methods CANNOT ACCESS instance fields
	 * 		-	Static methods do not need an instance to be called
	 * 		- 	Static methods are typically called with the name
	 * 			of the class. 
	 * 		-	Since the static field of all instnaces is the same
	 * 			static methods call access static fields
	 * 		-	GENERAL RULE: if a method only uses static fields
	 * 			make the method static. 
	 */
	
	public static int getRectangleCount() { return rectangleCount; }
	
	
	/**
	 * This method takes two Rectangle objects as a parameter and returns
	 * a new copy of the larger rectangle.  Larger is defined as the rectangle
	 * with the greater area.  If both rectangles have the same area then either
	 * rectangle can copied. 
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static Rectangle copyLarger(Rectangle o1, Rectangle o2) {
		
		//Why can I access the fields of o1 and o2 inside this static method?
		//
		//	-	They are passed objects not implied objects
		//  -	I don't need to access the fields through the get methods since
		//		we are inside the rectangle class. 
		//Why can there be two variables called result? 
		//
		//	- 	There is no error because of the SCOPE
		
		if (o1.getArea() > o2.getArea()) {
			
			Rectangle result = new Rectangle(o1.side1,o1.side2);
			return result;
			
		}
		Rectangle result = new Rectangle(o2.side1, o2.side2);
		return result;
		
		
		
		
		
		
		
		
	}
	
	//Can everyone write a toString method for me. 
	
	public String toString() {
		
		return "Side1: "+side1+"\nSide2: "+side2;
	}
	
	
}
