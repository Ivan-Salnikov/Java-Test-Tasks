package by.jonline.task02.main;

import java.util.ArrayList;


public class Task_02c_13 {

	
	public static void main(String[] args) {
		/*
		 * Two primes are called "twins" if they differ from each other by 2 (for example, 41 and 43).
		 * Find and print all pairs of "twins" from the segment [n, 2n], where n is a given natural number greater than 2. To solve the problem, use decomposition.
		 */
	

		
		int n =  (int)(Math.random() *  (150)); 
		
				
		System.out.println("n = " + n);
						
		
		
		ArrayList<Integer> resultList =  fillArray(n, 2*n);
		
		for (int i = 1; i < resultList.size(); i++) {
		   if (resultList.get(i) - resultList.get(i-1) == 2) {
			   System.out.println(resultList.get(i-1) + ", " +resultList.get(i));   
		   }
		}


	}
	
	public static ArrayList<Integer> fillArray (int lowNumber, int maxNumber) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for (int i = lowNumber; i <= maxNumber; i++) {
			 			 
			if (isPrime(i)) {
				myList.add(i);
			}
		}
		
		return myList;
	}
	
	
	
	public static boolean isPrime (int checkDigit) {
		
		boolean isPrime = true;
		
		for (int z = 2; z <= Math.sqrt((double)checkDigit); z++ ) {
			if (checkDigit % z == 0) {
				isPrime = false;
			}
		}
		
		return isPrime;
		
	}
	
}


