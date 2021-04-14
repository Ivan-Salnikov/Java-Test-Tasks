package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02b_08 {

	public static void main(String[] args) {
		/*
		 * Fractions p1/q1, p2/q2, ... pn/qn - are given, ( pi, qi - natural). 
		 * Write a program that brings these fractions to a common denominator and orders them in ascending order.
		 */
	
		int arrayP [] = new int[] {2, 8, 9, 20, 4, 18, 79, 99, 112, 20};		    
		
		int arrayQ [] = new int[] {6, 2, 4, 6, 8, 12, 10, 20, 40, 60};
		
		
		System.out.println("Sequence of numerators is  " + Arrays.toString(arrayP));
		System.out.println("Sequence denominators is  " + Arrays.toString(arrayQ));			
		
		int lcm = arrayQ[0];
		
		for (int i = 0; i < arrayQ.length; i++) {
			
			lcm = lcm * arrayQ[i] / gcd(lcm, arrayQ[i]);
		}
		
		System.out.println("LCM is " + lcm);
		
		for (int i = 0; i < arrayQ.length; i++) {
			
			arrayP[i] = arrayP[i] * (lcm / arrayQ[i]);
			arrayQ[i] = lcm; 
			
		}
		
		System.out.println("Sequence of numerators is  " + Arrays.toString(arrayP));
		System.out.println("Sequence denominators is  " + Arrays.toString(arrayQ));

		ShellSort(arrayP);	
		
		System.out.println("Sorting numerators ascending....");
		System.out.println("Sequence of numerators is  " + Arrays.toString(arrayP));
		System.out.println("Sequence denominators is  " + Arrays.toString(arrayQ));
		
	}

	
	private static int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
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
