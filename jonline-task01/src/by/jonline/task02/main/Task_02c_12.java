package by.jonline.task02.main;

import java.util.ArrayList;


public class Task_02c_12 {


	public static void main(String[] args) {
		/*
		 * Given natural numbers K and N. 
		 * Write a method (methods) for forming an array A, whose elements are numbers, 
		 * the sum of the digits of which is equal to K and which are not greater than N.
		 */
	

		
		int k =  (int)(Math.random() *  (20)); 
		
		int n =  500; 
		
		System.out.println("K = " + k);
		System.out.println("N = " + n);
						
		
		
		ArrayList<Integer> resultList =  fillArray(k, n);
		
		for (int i = 0; i < resultList.size(); i++) {
		   System.out.println(resultList.get(i));
		}


	}
	
	public static ArrayList<Integer> fillArray (int keyNumber, int maxNumber) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for (int i = 1; i <= maxNumber; i++) {
			 			 
			if (checkSumEqual(i, keyNumber)) {
				myList.add(i);
			}
		}
		
		return myList;
	}
	
	
	
	public static boolean checkSumEqual (int checkDigit, int keyNumber) {
		
		int sum = 0;
		
				
		while(checkDigit != 0){   
		        
				sum = sum + (checkDigit % 10);
		        checkDigit = checkDigit / 10;
		}
		
		if (sum == keyNumber) {
			return true;
		} else {
			return false;
		}
	}
	
}


