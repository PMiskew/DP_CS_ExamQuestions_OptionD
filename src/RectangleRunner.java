
public class RectangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10,5);
		Rectangle r2 = new Rectangle(5,10);
		Rectangle r3 = new Rectangle(r2);
		Rectangle r4 = Rectangle.copyLarger(r1,r2);
		/*
		 * You can call a static method with an instance, but
		 * it is VERY BAD FORM!!! When we see an instnace calling
		 * a method we think it is an instance method. 
		 */
		System.out.println(Rectangle.getRectangleCount());
		
		System.out.println(Rectangle.getRectangleCount());
		
	}

}
