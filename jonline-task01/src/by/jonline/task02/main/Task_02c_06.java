package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02c_06 {

	public static void main(String[] args) {
		/*
		 * Write a method (s) that checks whether the given three numbers are coprime.
		 */
	
		int arrayDimension = 3; //Array dimension
		int maxNumber = 50; // max number for array elements
		int minNumber = 0; // min number for array elements				
		
		int arrayA [] = new int[arrayDimension];
		
			
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the array
		}
		
				
		System.out.println("Array = " + Arrays.toString(arrayA));

		int k = gcdForArray(arrayA);
		if (k == 1 ) {
			System.out.println("GCD is " + k + ". Numbers is coprime.");	
		} else {
			System.out.println("GCD is " + k + ". Numbers is NOT coprime.");
		}
		
		
			
			

	}
	
	private static int gcdForArray (int[] arr) {
		
		int temp = 0;
				
		for (int i = 0; i < arr.length; i++) {
			temp = gcd(temp, arr[i]);
		}
		return temp;
	}
	

	private static int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}
	
}
