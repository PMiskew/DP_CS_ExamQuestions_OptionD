
public class RectangleRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10,5);
		Rectangle r2 = r1;
		Rectangle r3 = new Rectangle(r2);
		Rectangle r4 = Rectangle.copyLarger(r1,r2);
		Rectangle r5;
		
		
		/*
		 * You can call a static method with an instance, but
		 * it is VERY BAD FORM!!! When we see an instnace calling
		 * a method we think it is an instance method. 
		 */
		System.out.println(Rectangle.getRectangleCount());
		
		System.out.println(Rectangle.getRectangleCount());
	
		//This automatically called toString()
		System.out.println(r1);
		//But this is equally valid
		System.out.println(r1.toString());
		
		String s1 = "Paul";
		String s2 = "Adam";
		
		if (r1 == r2) {
			System.out.println("Equals");
		}
		
		
		
	}

}
