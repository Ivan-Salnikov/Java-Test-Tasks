package by.jonline.task03.main;

public class Task_03_05 {

	public static void main(String[] args) {
		/*
		 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
		 * Крайние пробелы в строке удалить.
		 * 
		 * Remove all extra spaces in the line, that is, replace series of consecutive spaces with single spaces.
		 * Remove trailing spaces in the line.
		 */

		
		String someString  = "    Cofee 50 Tea  80   Camel     105  68j465ff  000t   ff45 6gdfg    ";
		
		System.out.println(someString);
		
		String resultString = "";
		
		String findString = " ";
		
		boolean isSpaceBegin = false;
		
		someString  = someString.trim();
		
		char[] charArray = someString.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (findString.equals(Character.toString(charArray[i]))) {
	    		
	    		if (isSpaceBegin == false) {
	    		
	    			isSpaceBegin = true;
	    			
	    			resultString = resultString + findString;
	    		}
	    	} else {
	    		
	    		resultString = resultString + Character.toString(charArray[i]);
	    		
	    		isSpaceBegin = false;
	    	
	    	}
	    	
	    	
	    }
	    
		System.out.println(resultString);
	    
	}

}