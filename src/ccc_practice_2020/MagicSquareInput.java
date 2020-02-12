package ccc_practice_2020;


import java.util.Scanner;

/*
 * Goal:
 * 1. 	To look at a input issue that cause a lot of students problem
 * 		on the contest. 
 * 2. 	IB - 2D arrays taking inputs and basic properties including
 * 		the standard loop. 
 * 
 * I am not solving the problem here. 
 */
public class MagicSquareInput {


	public static void main(String[] arg) {
		
		magicSquareInput();
		
	}
	
	public static void maginSquareInputInfo() {
		
		
		int[] line1 = {1,2,3,4};
		int[] line2 = {1,2,3,4};
		int[] line3 = {1,2,3,4};
		int[] line4 = {1,2,3,4};
		
		//Process:
		
	}
	
	public static void magicSquareInput() {
	
		System.out.println("Magic Square Input");
		//BIG IDEA: s.nextInt() takes integers separated by ENTER or SPACE
		int[][] matrix = new int[4][4]; //This makes a 4 by 4 array - Stores 16 values
		Scanner s = new Scanner(System.in);
	
		
		for (int r = 0; r < 4; r = r + 1) {
			for (int c = 0; c < 4; c = c + 1) {
				matrix[r][c] = s.nextInt();
			}
		}
		
		//Print out row major
		
		
		//Print out column major
		
		
		//Print out one row at time. 
		System.out.println("END Magic Square Input");
		
	}
	
	
	
	
	
}
