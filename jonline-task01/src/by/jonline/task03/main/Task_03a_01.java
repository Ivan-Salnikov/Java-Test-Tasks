package by.jonline.task03.main;

public class Task_03a_01 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
		 * 
		 * Given text (string). Find the largest number of consecutive spaces in it.
		 */

		
		String someString  = "    Cofee 50 Tea  80   Camel       105  68j465ff  000t   ff45 6gdfg    ";
		
		System.out.println(someString);
		
		
		String findString = " ";

		int i = 0;
		
		for (i = 0; i < someString.length() ; i++){			
			
	    	if (someString.contains(findString)) {
	    		
				findString = findString.concat(" ");
				
	    	} else {
	    		
	    		break;
	    		
	    	}
	    	
	    }
	    
		System.out.println("String contains " + i + " consecutive spaces");
	    
	}

}