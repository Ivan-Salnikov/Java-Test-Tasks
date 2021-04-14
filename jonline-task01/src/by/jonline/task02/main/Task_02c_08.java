package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02c_08 {

	public static void main(String[] args) {
		/*
		 * An array D is given. 
		 * Determine the following sums: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6]. 
		 * Explanation. Create a method (s) to calculate the sum of three consecutive array elements with numbers from k to m.
		 */
	
		int arrayDimension = 10; //Array dimension
		int maxNumber = 50; // max number for array elements
		int minNumber = 0; // min number for array elements				
		
		int arrayA [] = new int[arrayDimension];
		
			
		for (int i = 0; i < arrayDimension; i++) {
			arrayA[i] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the array
		}
		
				
		System.out.println("Array = " + Arrays.toString(arrayA));

		
		System.out.println("D[1]+D[2]+D[3] = " + SumArrayMembers(arrayA, 0, 2));	
		System.out.println("D[3]+D[4]+D[5] = " + SumArrayMembers(arrayA, 2, 4));
		System.out.println("D[4]+D[5]+D[6] = " + SumArrayMembers(arrayA, 3, 5));
				
			
			

	}
	
	private static int SumArrayMembers (int[] arr, int minIndex, int maxIndex) {
		
		int temp = 0;
				
		for (int i = minIndex; i <= maxIndex; i++) {
			temp = temp + arr[i];
		}
		return temp;
	}
	


	
}
