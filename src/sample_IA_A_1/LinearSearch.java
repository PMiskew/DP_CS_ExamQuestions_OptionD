package sample_IA_A_1;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(Arrays.toString(data));
		
		//Question: What is a linear/sequential search?
		/*
		 * A linear or sequential search is a search that progresses through
		 * each element in sequence.  It can be applied to unsorted data. 
		 * 
		 */
	}
	
	/**
	 * returns index if value is contained in data, else returns -1
	 * @param data
	 * @return
	 */
	public int linearSearch(int[] data, int value) {
		
		for (int i = 0; i < data.length; i = i + 1) {
			
			if (data[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * returns index if value is contained in data, else returns -1
	 * @param data
	 * @return
	 */
	public int linearSearch(String[] data, String value) {
		
		for (int i = 0; i < data.length; i = i + 1) {
			
			if (data[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * returns index if value is contained in data, else returns -1
	 * @param data
	 * @return
	 */
	public int linearSearch(char[] data, char value) {
		
		for (int i = 0; i < data.length; i = i + 1) {
			
			if (data[i] == value) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * returns index if value is contained in data, else returns -1
	 * @param data
	 * @return
	 */
	public int linearSearch(double[] data, double value) {
		
		for (int i = 0; i < data.length; i = i + 1) {
			
			if (data[i] == (value)) {
				return i;
			}
		}
		return -1;
	}
}
