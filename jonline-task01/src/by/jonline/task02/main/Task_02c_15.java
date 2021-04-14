package by.jonline.task02.main;

import java.util.ArrayList;


public class Task_02c_15 {

	
	public static void main(String[] args) {
		/*
		 * Find all natural n-digit numbers whose digits form a strictly increasing sequence (for example, 1234, 5789). 
		 * To solve the problem, use decomposition.
		 * 
		 *  Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). 
		 *  Для решения задачи использовать декомпозицию.
		 */
	
		
				
		int n = 3;
		
		System.out.println("n = " + n);
						
		
		
		ArrayList<Integer> resultList =  fillArray(n);
		
		for (int i = 0; i < resultList.size(); i++) {
			   System.out.println(resultList.get(i));
			}


	}
	
	public static ArrayList<Integer> fillArray (int numberDigits) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for (int i = (int) Math.pow(10, numberDigits-1); i <= Math.pow(10, numberDigits) - 1; i++) {
			 			 
			if (isDigitAscending(i)) {
				myList.add(i);
			}
		}
		
		return myList;
	}
	
	
	public static boolean isDigitAscending (int checkDigit) {
		
		boolean isAscending = false;
		
		String n = Integer.toString(checkDigit);
	    char[] charArray = n.toCharArray();
	    
	    for (int i = 1; i < charArray.length; i++){
	        
	    	if (Character.getNumericValue(charArray[i-1]) < Character.getNumericValue(charArray[i])) {
	    		isAscending = true;
	    	} else {
	    		isAscending = false;
	    		break;
	    	}
	    
	    }
		
		return isAscending;
	}
	
	
	
	
}


