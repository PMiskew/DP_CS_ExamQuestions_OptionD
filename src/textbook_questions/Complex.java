package textbook_questions;

public class Complex {

	private double re;
	private double im; 
	
	public Complex(double r, double i) {
		re = r;
		im = i;
	}
	
	//Nothing needs to go in here since it defaults to 0, however,
	//the method must be written since by writing another constructor the
	//default goes away. 
	public Complex() {
		
	}
	
	public double getRe() { return re; }
	public double getIm() { return im; }
	
	public double modulus() {
		return Math.sqrt(Math.pow(re,2) + Math.pow(im,2));
		
	}
	
	
	//Not in the question, but I will add a toString and equals
	public String toString() {
		if (im < 0) {
			return re + " - " +Math.abs(im)+"i";
		}
		if (im == 0 && re == 0)
		if (im == 0) {
			return re + "";
		}
		if (re == 0)
		return re + " + "+im+"i";
	}
	
}
