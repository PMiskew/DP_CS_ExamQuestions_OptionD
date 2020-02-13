package general_skills;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Theory:
		 * 
		 * Bubble sort is an inefficient sorting algorithm you can think
		 * of it like a bubble moving through the data structure comparing 
		 * the size of each element. Each pass the largest values "bubbles"
		 * to the end of the array. 
		 * 
		 * 	Pass 1 runs from i = 0 to i = length - 2 = 2
		 *  (3, 6), 9, 2 NO SWAP
		 *   3, (6, 9), 2 NO SWAP
		 *   3, 6, (9, 2)    SWAP
		 *   3, 6, 2, 9  DONE PASS
		 *   
		 * Pass 2 runs from i = 0 to i = length - 3 = 1
		 * (3, 6), 2, 9 NO SWAP
		 *  3, (6, 2), 9 SWAP
		 *  3, 2, 6, 9 DONE PASS
		 *  
		 * Pass 2 runs from i = 0 to i = length - 4 = 0
		 * (3, 2), 6, 9 SWAP 
		 *  2, 3, 6, 9 DONE PASS
		 *  
		 * COMPLETE
		 * 
		 * The outer loop represents each pass
		 * The inner loop deals with the swapping of elements 
		 * 
		 *
		 */
		int[] arr = {1,5,7,3,5,7,8,5,3,5,7};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i = i + 1) {
			
			for (int j = 0; j < arr.length - i - 1; j = j + 1) {
				
				if (arr[j] > arr[j + 1]) {
					//Swaping Elements
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		
	}
	
}

