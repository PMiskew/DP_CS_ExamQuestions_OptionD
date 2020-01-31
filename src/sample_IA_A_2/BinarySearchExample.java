package sample_IA_A_2;

import java.util.Arrays;

public class BinarySearchExample {

	public static void main(String[] args) {
		/*
		 * IB REQUIREMENTS:
		 * 
		 * 	Searches: 	Linear Search
		 * 				Binary Search
		 * 
		 *  Sorts:		BubbleSort
		 *  			SelectionSort
		 *  
		 * Additional:
		 * 
		 * Sorts:		Insertion Sort
		 * 				MergeSort (Recursive)
		 * 				QuickSort (Recursive)
		 */
		int[] data = {5,4,8,1,3,4,7,8,9};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		//Non-recursive Test
		System.out.println(binarySearch(data,9)); //right most --> 8
		System.out.println(binarySearch(data,1)); //left most --> 0
		System.out.println(binarySearch(data,8)); //right, duplicate --> 6
		System.out.println(binarySearch(data,4)); //left, duplicate --> 2
		System.out.println(binarySearch(data,6)); //not present --> -1 
		//Sample Trace
		/*
		 *	binarySearch(data,9) //RIGHT EXTREME
		 *
		 * 	low	|	high	|	mid | TRUE STATEMENT
		 * ------------------------------------------
		 * 	 0		 8			4		 9 > arr[4] (7) --> low = 4 + 1 = 5
		 * 	 5		 8		    6		 9 > arr[6] (8) --> low = 6 + 1 = 7
		 * 	 7		 8			7		 9 > arr[7] (8) --> low = 7 + 1 = 8
		 * 	 8		 8			8		9 == arr[8] (9) --> return 8	
		 * 
		 * 	binarySearch(data,4) //LEFT NOT EXTREME (DUPLICATE)
		 *
		 * 	low	|	high	|	mid | TRUE STATEMENT
		 * ------------------------------------------
		 * 	 0		 8			4		 4 < arr[4] (7) --> high = 4 - 1 = 3
		 * 	 0		 3		    1		 4 > arr[1] (3) --> low = 1 + 1 = 2
		 * 	 2		 3			2		4 == arr[2](4) --> return 2
		 * 
		 * 
		 * binarySearch(data, 6) //NOT PRESENT
		 *
		 * 	low	|	high	|	mid | TRUE STATEMENT
		 * ------------------------------------------
		 * 	 0		 8			4		  6 > arr[4] (7) = 5 --> low = 4 + 1 = 5
		 * 	 5		 8		    6		  6 < arr[6] (8) --> high = 6 - 1  = 5
		 * 	 5		 5			5		  6 < arr[5] (7) --> low = mid + 1 = 6
		 *   6		 5			5		  low > high -- return -1
		 */
		
		//Recursive Test
		System.out.println("RECURSIVE VERSION");
		int low = 0;
		int high = data.length - 1;
		
		System.out.println(binarySearchRecursive(data,low,high,9)); //right most --> 8
		System.out.println(binarySearchRecursive(data,low,high,1)); //left most --> 0
		System.out.println(binarySearchRecursive(data,low,high,8)); //right, duplicate --> 6
		System.out.println(binarySearchRecursive(data,low,high,4)); //left, duplicate --> 2
		System.out.println(binarySearchRecursive(data,low,high,6)); //not present --> -1 
		//Sample Trace
		/*
		 * NOTE: I am only showing parameters that can change in 
		 * trace. 
		 * 
		 * BinarySearchRecursive(arr,0,8,9) shortened to BSR(low,high) = BSR(0,8)
		 * 
		 * BSR(0,8) = BSR(5,8) = 8
		 * BSR(5,8) = BSR(6,8) = 8
		 * BSR(6,8) = BSR(7,8) = 8
		 * BSR(8,8) = 8 (END) --> arr[8] == 9
		 * 
		 * BinarySearchRecursive(arr,0,8,4) shortened to BSR(low,high) = BSR(0,8)
		 *
		 * BSR(0,8) = BSR(0,3) = 4
		 * BSR(0,3) = BSR(2,3) = 4
		 * BSR(2,3) = 2 (END) --> arr[2] == 4
		 *
		 * BinarySearchRecursive(arr,0,8,6) shortened to BSR(low,high) = BSR(0,8)
		 *
		 * BSR(0,8) = BSR(5,8) = -1 
		 * BSR(5,8) = BSR(5,5) = -1 
		 * BSR(5,5) = BSR(5,4) = -1
		 * BSR(5,4) = -1 --> low > high return -1 
		 *
		 *
		 */
	
		//Question: What is a binary search?
		/*
		 * A binary search is a search that can only be applied to 
		 * SORTED DATA.  Unlike a linear search that progresses
		 * through the data in sequence a binary search starts by checking
		 * the middle value.  It then makes a decision based on the 
		 * size of the middle value relative to the value being searched
		 * for.
		 * 
		 * low = l
		 * high = h
		 * middle = m
		 * target value = 3
		 * 
		 * first check  3 < data[4]
		 * 			l           m           h
		 * index =  0  1  2  3  4  5  6  7  8
		 *  data = [1, 3, 4, 4, 5, 7, 8, 8, 9]
		 *  
		 * second check 3 > data[1]
		 * 			l  m     h
		 * index =  0  1  2  3  4  5  6  7  8
		 *  data = [1, 3, 4, 4, 5, 7, 8, 8, 9]
		 *  
		 * third check  3 == data[1] DONE
		 * 			      l  h
		 * 				  m
		 * index =  0  1  2  3  4  5  6  7  8
		 *  data = [1, 3, 4, 4, 5, 7, 8, 8, 9]
		 *
		 */
		
		//Question: What is the benefit of binary search?
		/*
		 * It is much faster than a linear search (less comparisons). 
		 * However, note the time requirements comes from sorting the 
		 * data or if entering new elements then need to be inserted in
		 * order, which presents some challenges.  
		 *  
		 */
	}
	
	/**
	 * 
	 * @return
	 */
	public static int binarySearch(int[] arr, int value) { 
		
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high)/2;
		
		while (low <= high) {
			if (arr[mid] == value) {
				return mid;
			}
			if (arr[mid] < value) {
				low = mid + 1;
			}
			if (arr[mid] > value) {
				high = mid - 1;
			}
			mid = (low + high)/2;
		}
		return -1; //not found
	}
	
	public static int binarySearchRecursive(int[] arr, int low, int high, int value) {
		int mid = (low + high)/2;
		if (low > high) {
			return -1;
		}
		if (arr[mid] == value) {
			return mid;
		}
		if (arr[mid] < value) {
			return binarySearchRecursive(arr,mid + 1,high,value);
		}
		if (arr[mid] > value) {
			return binarySearchRecursive(arr,low,mid - 1,value);
		}
		return -1;
		
	}

}
