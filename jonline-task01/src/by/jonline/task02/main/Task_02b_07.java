package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02b_07 {

	public static void main(String[] args) {
		/*
		 * Let there be given two non-decreasing sequences of real numbers a1<=a2<=...<=an and b1<=b2<=...<=bm.
		 * It is required to indicate the places where you want to insert the elements of the sequence b1,b2,..,bm 
		 * into the first sequence so that the new sequence remains increasing.
		 */
			
		int arrayA [] = new int[] {5, 8, 9, 21, 42, 42, 79, 99, 112, 553, 625};		    
		
		int arrayB [] = new int[] {6, 29, 45, 55, 55, 75, 98, 329, 455, 810, 828, 940, 1025, 1260};
		
		
		System.out.println("Sequence A is  " + Arrays.toString(arrayA));
		System.out.println("Sequence B is  " + Arrays.toString(arrayB));
		
		for(int i = 0; i < arrayB.length; i++) {
			
			int k = BinarySearch(arrayA, 0, arrayA.length - 1, arrayB[i]);
			
			System.out.println("Place for inserting " + arrayB[i] + " is " + (int) (k+1));
		}	
		
	}
	
	 
	 private static int BinarySearch(int[] arr, int lowPosition, int highPosition, int keyValue)
	  {
	    
		int midPosition;
		
		while(lowPosition < highPosition){
	      
			midPosition = lowPosition + (highPosition - lowPosition) / 2; // Middle of the already sorted sequence
			
	      
			int valueMidPosition = arr[midPosition];
			
	      
			if (valueMidPosition < keyValue) {
				lowPosition = midPosition + 1;
	        } else if (valueMidPosition > keyValue) {
	            highPosition = midPosition;
	        } else if (valueMidPosition == keyValue) {
	        	lowPosition = midPosition;
	            break;
	        }
	    }
		return lowPosition;
	  }


}

