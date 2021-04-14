package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02b_06 {

	public static void main(String[] args) {
		/*
		 * Shell sort. An array of n real numbers is given. You want to order it in ascending order.
		 * This is done as follows: two neighboring elements ai and ai + 1 are compared. 
		 * If ai <= ai+1, then move forward one element. If ai > ai + 1, then a permutation is performed 
		 * and shifted one element back. 
		 * Create an algorithm for this sorting.
		 */
			
		int arrayA [] = new int[] {42, 625, 9, 79, 42, 112, 21, 8, 99, 5, 553};		       
		
		System.out.println("Sequence before sorting is  " + Arrays.toString(arrayA));
		
		ShellSort(arrayA);		
		
		System.out.println("Sequence after sorting is  " + Arrays.toString(arrayA));
		
	}
	
	 //Swap two elements of array
	private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


	 private static void ShellSort(int[] array) {
		 int hop = 1;
		 int length = array.length;
	        for (int i = hop; i < length; i++) {
	            for (int j = i; j >= hop; j = j - hop) {
	                if (array[j] < array[j - hop])
	                    swap(array, j, j - hop);
	                else
	                    break;
	            }
	        }
	    }


}

