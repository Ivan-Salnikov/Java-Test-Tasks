package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02c_05 {

	public static void main(String[] args) {
		/*
		 * Write a program that finds the second largest number in the array A [N]. 
		 * Print a number that is less than the maximum element of the array, but larger than all other elements.
		 */
	
		int arrayDimension = 20; //Array dimension
		int maxNumber = 2000; // max number for array elements
		int minNumber = -2000; // min number for array elements				
		
		int arrayA [] = new int[arrayDimension];
		
			
		for (int i = 0; i<arrayDimension; i++) {
			arrayA[i] = minNumber + (int)(Math.random() *  (maxNumber - minNumber)); // fill the array
		}
		
		
		System.out.println("Array = " + Arrays.toString(arrayA));
				
		System.out.println("Second largest number is " + FindNLargest(arrayA, 2));
			
			

	}
	
	
	
	private static long FindNLargest (int arr[], int pos) {
		
		ShellSort(arr);
		
		return arr[arr.length - pos];
		
	}
	
	private static void Swap(int[] array, int i, int j) {
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
	                    Swap(array, j, j - hop);
	                else
	                    break;
	            }
	        }
	    }
	
}
