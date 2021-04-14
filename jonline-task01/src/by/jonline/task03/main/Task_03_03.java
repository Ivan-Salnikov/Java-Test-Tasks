package by.jonline.task03.main;

public class Task_03_03 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с массивом символов
		 * В строке найти количество цифр.
		 * 
		 * Find the number of digits in the string.
		 */

		
		String someString  = "Cofee 50 Tea 80 Camel 10000";
		
		System.out.println(someString);
		
		int countDigits = 0;
		
		char[] charArray = someString.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (Character.isDigit(charArray[i])) {
	    		
	    		countDigits++;

	    	} 
	    	
	    }
	    
	    System.out.println("String contains " + countDigits + " digits");
	    
	}

}