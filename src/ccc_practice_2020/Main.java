package ccc_practice_2020;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Contest and "best" practices:
 * 
 * If you write the CCC and use Java the online marker will ONLY accept
 * a class called Main. 
 * 
 * What this means is once you have completed a question it needs to be put
 * into the Main class. 
 * 
 * What I do is write the problem in a function.  By doing this we keep 
 * everything in the main and it provides the benefit of being able
 * to exit the function when I find the solution. 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
	
		String result = j12019();
		System.out.println(result);
		
	}
	
	public static String j12019() {
		
		//Create Scanner and take 6 inputs. 
		//Creates a new scanner object.  s is a REFERENCE TYPE
		Scanner s = new Scanner(System.in);
		
		//Scanner has a constructor and it takes System.in as a parameter
		
		
		//Take input for 6 integers
		//int is a PRIMITIVE TYPE
		//nextInt() is a(n) instance method
		//An instance method is invoked using an object. 
		//A static/class method is invoked with the name of the class. 
		int a3 = s.nextInt();
		int a2 = s.nextInt();
		int a1 = s.nextInt();
		int b3 = s.nextInt();
		int b2 = s.nextInt();
		int b1 = s.nextInt();
		
		//Java and programming languages in general take BEDMAS
		//Common mistakes 1/2+3 but wanted 1/(2+3)
		int at = 3*a3 + 2*a2 + a1;
		int bt = 3*b3 + 2*b2 + b1;
		
		if (at > bt) {
			return "A";
		}
		else if (at == bt) {
			return "T";
		}
		else {
			return "B";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
