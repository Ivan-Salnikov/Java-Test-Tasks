package by.jonline.task02.main;

import java.util.ArrayList;


public class Task_02c_16 {

	
	public static void main(String[] args) {
		/*
		 * Write a program that determines the sum of n - digit numbers containing only odd digits. 
		 * Also determine how many even digits are in the found amount. 
		 * To solve the problem, use decomposition.
		 * 
		 *  Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
		 *  Определить также, сколько четных цифр в найденной сумме. 
		 *  Для решения задачи использовать декомпозицию.
		 */
	
		
				
		int n = 3;
		
		System.out.println("n = " + n);
						
		
		
		ArrayList<Integer> resultList =  fillArray(n);
		
		for (int i = 0; i < resultList.size(); i++) {
			   System.out.println(resultList.get(i));
			}

		int sum = sumArrayList(resultList);
		
		System.out.println("Sum = " + sum + ". Quantity even digits is " + calcNumberDigitsEven(sum));

	}
	
	
	
	
	public static ArrayList<Integer> fillArray (int numberDigits) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for (int i = (int) Math.pow(10, numberDigits-1); i <= Math.pow(10, numberDigits) - 1; i++) {
			 			 
			if (checkNumberDigitsOdd(i)) {
				myList.add(i);
			}
		}
		
		return myList;
	}
	
	public static int sumArrayList (ArrayList<Integer> arrL ) {
		
		int sum = 0;
		
		ArrayList<Integer> myList = arrL;
		
		for (int i = 0; i < myList.size(); i++) {
			sum = sum + myList.get(i);
		}
		
		return sum;
	}
	
	
	public static boolean checkNumberDigitsOdd (int checkDigit) {
		
		boolean isNumberDigitsOdd = false;
		
		String n = Integer.toString(checkDigit);
	    char[] charArray = n.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (Character.getNumericValue(charArray[i]) % 2 != 0) {
	    		isNumberDigitsOdd = true;
	    	} else {
	    		isNumberDigitsOdd = false;
	    		break;
	    	}
	    
	    }
		
		return isNumberDigitsOdd;
	}
	
	
	public static int calcNumberDigitsEven (int checkDigit) {
		
		int quantityNumberDigitsEven = 0;
		
		String n = Integer.toString(checkDigit);
	    char[] charArray = n.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (Character.getNumericValue(charArray[i]) % 2 == 0) {
	    		quantityNumberDigitsEven = quantityNumberDigitsEven + 1;
	    	} 	    
	    }
		
		return quantityNumberDigitsEven;
	}
	
	
}


