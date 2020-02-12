package general_skills;

import java.util.ArrayList;

/*
 * This class just looks at different ways of finding primes
 * and also has some questions around primes
 */
public class FindingPrimes {

	
	public static void main(String[] args) {
		System.out.println(isPrime(6));
		System.out.println(primeList(10));
	}
	
	/*
	 * THis function finds the first n primes and returns a list
	 */
	public static ArrayList<Integer> primeList(int n) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int ctr = 2;
		while (list.size() < n) {
			if (isPrime(ctr)) {
				list.add(ctr);
			}
			ctr = ctr + 1;
		}
		return list;
		
	}
	public static boolean isPrime(int a) {
		
		//This loop only has to go to the root of a since 
		//factor pair with the root in the center
		// factors of 12 = {1, 2, 3, 4, 6, 12,} 
		// factors of 9 = {1, 3, 9}
		if (a < 2) 
			return false;
		
		for (int i = 2; i <= (int)Math.sqrt(a); i = i + 1) 
			if (a % i == 0) 
				return false;
		
		return true;
		
	}
}
