package by.jonline.task03.main;

public class Task_03a_09 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * 
		 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
		 * Учитывать только английские буквы.
		 * 
		 * Count the number of lowercase (small) and uppercase (big) letters in the entered line. 
		 * Consider only English letters.
		 */
		
		String someWord  = "The good way (хорошо бы) to ENLARGE YOUR LOGICS SKILL is informatics";
		
		System.out.println(someWord);
		
		System.out.println("String contains " + someWord.length() + " symbols");
		
		int countUpperCase = 0;
		
		int countLowerCase = 0;
		
		int countOther = 0;
		
		char c;

	    for (int i = 0; i < someWord.length(); i++) {
	        
	    	c = someWord.charAt(i);
	        
	    	if (c >= 'A' && c <= 'Z') {
	    		
	    		countUpperCase++;
	    		
	    		} else if (c >= 'a' && c <= 'z'){
	    			
	    			countLowerCase++;
	    		
	    		} else {
	    		
	    			countOther++;	
    		}	
	    		
		}
	    
			
		System.out.println("The number of uppercase letters is " + countUpperCase + ", lowercase is " + countLowerCase + ", the number of non-English letters is " + countOther);	    
	    
	}

}