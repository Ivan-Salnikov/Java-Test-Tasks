package by.jonline.task02.main;

import java.util.ArrayList;


public class Task_02c_14 {

	
	public static void main(String[] args) {
		/*
		 * A natural number with n digits in it is called the Armstrong number if the sum of its digits raised to the power n is equal to the number itself. 
		 * Find all Armstrong numbers from 1 to k. To solve the problem, use decomposition.
		 * 
		 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. 
		 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
		 */
	

		
		int k =  (int)(Math.random() *  (100000)); 
		
				
		System.out.println("k = " + k);
						
		
		
		ArrayList<Integer> resultList =  fillArray(k);
		
		for (int i = 0; i < resultList.size(); i++) {
			   System.out.println(resultList.get(i));
			}


	}
	
	public static ArrayList<Integer> fillArray (int maxNumber) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for (int i = 1; i <= maxNumber; i++) {
			 			 
			if (Math.pow(sumDigit(i),calcNumberLength(i)) == i) {
				myList.add(i);
			}
		}
		
		return myList;
	}
	
	public static int calcNumberLength(int number) {

	    String n = Integer.toString(number);
	    char[] charArray = n.toCharArray();
	    
	    return charArray.length;
	}
	
	public static int sumDigit (int keyNumber) {
		
		int sum = 0;
		
				
		while(keyNumber != 0){   
		        
				sum = sum + (keyNumber % 10);
				keyNumber = keyNumber / 10;
		}
		
		return sum;
		
	}
	
}


