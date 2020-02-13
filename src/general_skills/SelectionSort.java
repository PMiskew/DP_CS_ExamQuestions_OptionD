package general_skills;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Theory:
		/*
		 * The way selection sort works is that it goes through the 
		 * list and selects the smallest value.  Once the smallest value
		 * has been "selected" it is moved to the front of the list.
		 * 
		 * s = smallest
		 * 
		 * i                 s
		 * 3, 6, 9, 2, 4, 1, 0, 8 Identify smallest 
		 * 0, 6, 9, 2, 4, 1, 3, 8 Swap - END OF FIRST PASS
		 * 
		 * increment i
		 * 
		 *    i           s
		 * 0, 6, 9, 2, 4, 1, 3, 8 Identify smallest
		 * 0, 1, 9, 2, 4, 6, 3, 8 Swap - END OF SECOND PASS
		 * 
		 * increment i
		 * 
		 *       i  s         
		 * 0, 1, 9, 2, 4, 6, 3, 8 Identify smallest
		 * 0, 1, 2, 9, 4, 6, 3, 8 Swap - END OF THRID PASS
		 * 
		 * increment i
		 *          
		 *          i        s
		 * 0, 1, 2, 9, 4, 6, 3, 8 Identify smallest
		 * 0, 1, 2, 3, 4, 6, 9, 8 Swap - END OF FOURTH PASS
		 * 
		 * increment i
		 * 
		 *             4
		 *             i
		 * 0, 1, 2, 3, 4, 6, 9, 8 Identify smallest (smallest is i)
		 * 0, 1, 2, 3, 4, 6, 9, 8 Swap - END OF FIFTH PASS (NO CHANGE)
		 * 
		 * increment i
		 *                s
		 *                i
		 * 0, 1, 2, 3, 4, 6, 9, 8 Identify smallest (smallest is i)
		 * 0, 1, 2, 3, 4, 6, 9, 8 Swap - END OF SIXTH PASS (NO CHANGE)
		 * 
		 * increment i
		 *                   i  s
		 * 0, 1, 2, 3, 4, 6, 9, 8 Identify smallest 
		 * 0, 1, 2, 3, 4, 6, 8, 9 Swap - END OF 7th Pass
		 * 
		 * Since there are 8 elements we can be confident that the list is
		 * sorted by the end of the 7th pass. 
		 * 
		 * 
		 */
		int[] arr = {1,5,7,3,5,7,8,5,3,5,7};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	/**
	 * This is pulled from the pseudocode found on wikipedia. 
	 * @param arr
	 */
	public static void selectionSort(int[] a) {
		
		/* a[0] to a[aLength-1] is the array to sort */
		int i,j;
		int aLength = a.length; // initialize to a's length

		/* advance the position through the entire array */
		/*   (could do i < aLength-1 because single element is also min element) */
		for (i = 0; i < aLength-1; i++) {
		    /* find the min element in the unsorted a[i .. aLength-1] */

		    /* assume the min is the first element */
		    int jMin = i;
		    /* test against elements after i to find the smallest */
		    for (j = i+1; j < aLength; j++)
		    {
		        /* if this element is less, then it is the new minimum */
		        if (a[j] < a[jMin])
		        {
		            /* found new minimum; remember its index */
		            jMin = j;
		        }
		    }

		    if (jMin != i) 
		    {
		    	int temp = a[i];
		    	a[i] = a[jMin];
		    	a[jMin] = temp;
		    }
		}
	}
}
