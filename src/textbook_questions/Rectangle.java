package textbook_questions;

public class Rectangle {

	//Rectangle has 4 encpasulated fields
	private int left;
	private int bottom;
	private int width;
	private int height;
	
	
	//Rectangele has one constructor
	public Rectangle(int l, int b, int w, int h) {
		
		left = Math.max(l, 0);
		bottom = Math.max(b, 0);
		width = Math.max(w, 0);
		height = Math.max(h, 0);
		
	}
	
	//get method - accessor methods (access fields directly)
	public int getLeft() {  return left; }
	public int getBottom() { return bottom; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	//get method - accessor methods (access properties based on fields)
	public int getTop() { return bottom + height; }
	public int getRight() {  return left + width; }
	
	
	
	//Static/Class method
	public static Rectangle intersection(Rectangle r1, Rectangle r2) {
		
		
		
		//Find left rect
		Rectangle lrect = r1;
		Rectangle rrect = r2;
		
		if (r1.left > r2.left) {
			lrect = r2;
			rrect = r1;
		}
		
		if (lrect.left + lrect.left + lrect.width < rrect.left) {
			return new Rectangle(0,0,0,0);
		}
		
		//If we make it here the lrect.left <= rrect.left <= lrect.left + lrect.width 
		
		//Case 1 rrect is fully below lrect meaning they don't intersect
		if (lrect.bottom > rrect.bottom + rrect.height) {
			return new Rectangle(0,0,0,0);
		}
		
		//Case 2 rrect is full above rrect meaning they don't intersect
		if (lrect.bottom + lrect.height < rrect.bottom) {
			return new Rectangle(0,0,0,0);
		}
		
		//Case 3 - They must overlap and the 
		//right left must be the new left
		int l = rrect.left;
		//bottom
			//Case 1						Case 2							Case 3
			//   									*********				**********
			//  **********					*****************				**************
			//  **************				***************** ---BOTTOM 	************** --BOTTOM
			//  ************** --BOTTOM		************					**********
			//      ********** 
			//
			//The bottom will be the max between left and rigtht bottom
		int b = Math.max(lrect.bottom, rrect.bottom);
		//Right - It is easier to find the right position then find the width
		//The right will be the 
		int r = Math.min(lrect.left + lrect.width, rrect.left + rrect.width);
		//Top - It is easier to find the top and then find the height
		int t = Math.min(lrect.bottom + lrect.height, rrect.bottom + rrect.height);
		
		int w = r - l;
		int h = t - b;
		
		return new Rectangle(l,b,w,h);
		
		//NOTE:  THESE EXAMPLE CASES ARE NOT EXAUSTIVE
		//Example 1  (left, bottom, width, height) --> (right, top)
		// r1 = (3,1,5,4) --> (3 + 5, 1 + 4) --> (8, 5)
		// r2 = (6,4,4,2) --> (6 + 4, 4 + 2) --> (10,6)
		
		// r1.insersects(r2)
		// lrect = r1
		// rrect = r2
		// l = 6	
		// b = Math.max(1,4) --> 4
		// r = Math.min(3 + 5, 6 + 4) --> 8
		// t = Math.min(1 + 4, 4 + 2) --> 5
		// w = 8 - 6 --> 2
		// h = 5 - 4 --> 1
		// r3 = new Rectangle(6,4,2,1)
		
		//Example 2 left, bottom, width, height) --> (right, top)
		// r1 = (1,2,5,3) --> (1 + 5, 2 + 3) --> (6, 5)
		// r2 = (2,3,3,1) --> (2 + 3, 3 + 1) --> (5,4)
		
		// r1.insersects(r2)
		// lrect = r1
		// rrect = r2
		// l = 2	
		// b = Math.max(2,3) --> 3
		// r = Math.min(1 + 5, 2 + 3) --> 5
		// t = Math.min(2 + 3, 3 + 1) --> 4
		// w = 5 - 2 --> 3
		// h = 4 - 3 --> 2
		// r3 = new Rectangle(6,4,2,1)
		
		
		//Example 2 left, bottom, width, height) --> (right, top)
		// r1 = (1,2,5,3) --> (1 + 5, 2 + 3) --> (6, 5)
		// r2 = (2,3,3,1) --> (2 + 3, 3 + 1) --> (5,4)
		
		// r1.insersects(r2)
		// lrect = r1
		// rrect = r2
		// l = 2	
		// b = Math.max(2,3) --> 3
		// r = Math.min(1 + 5, 2 + 3) --> 5
		// t = Math.min(2 + 3, 3 + 1) --> 4
		// w = 5 - 2 --> 3
		// h = 4 - 3 --> 2
		// r3 = new Rectangle(6,4,2,1)
				
		
		
		
		
		
	}
}
