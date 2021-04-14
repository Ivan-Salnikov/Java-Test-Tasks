package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02c_10 {

	public static void main(String[] args) {
		/*
		 * A natural number N is given. Write a method (methods) for forming an array, the elements of which are the digits of the number N.
		 */
	
		int n = + (int)(Math.random() *  (25000)); 
		
		System.out.println("N = " + n);
		
		int arr[] = new int[calcNumberLength(n)];
		
		digitsInNumber (n, arr);
		
		System.out.println("Array is " + Arrays.toString(arr));
			

	
	}
	
	
	public static int calcNumberLength(int number) {

	    String n = Integer.toString(number);
	    char[] charArray = n.toCharArray();
	    
	    return charArray.length;
	}
	
	public static void digitsInNumber(int number, int[] arr) {

	    String n = Integer.toString(number);
	    char[] charArray = n.toCharArray();
	    
	    for (int i = 0;i<charArray.length; i++){
	        arr[i] = Character.getNumericValue(charArray[i]);
	    
	    }
	}
	
	
}
