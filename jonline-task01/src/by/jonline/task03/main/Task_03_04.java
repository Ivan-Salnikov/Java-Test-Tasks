package by.jonline.task03.main;

public class Task_03_04 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с массивом символов
		 * В строке найти количество чисел.
		 * 
		 * Find the number of numbers in the string.
		 */

		
		String someString  = "Cofee 50 Tea 80 Camel 10568j465000t ff456gdfg";
		
		System.out.println(someString);
		
		int countDigits = 0;
		
		boolean isNumberBegin = false;
		
		char[] charArray = someString.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (Character.isDigit(charArray[i])) {
	    		
	    		if (isNumberBegin == false) {
	    		
	    			isNumberBegin = true;
		    		countDigits++;
		    		
	    		}
	    	} else {
	    		
	    		isNumberBegin = false;
	    	
	    	}
	    	
	    	
	    }
	    
	    System.out.println("String contains " + countDigits + " numbers");
	    
	}

}