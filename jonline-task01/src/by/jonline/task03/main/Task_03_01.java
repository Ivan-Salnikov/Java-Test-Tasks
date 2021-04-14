package by.jonline.task03.main;

public class Task_03_01 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с массивом символов
		 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
		 * 
		 * Given an array of camelCase variable names. Convert titles to snake_case.
		 */

		
		String[] camelCaseArray  = new String[] {"thisIsExampleOfCamelCase", "camelCaseWillBeShortOrLong", "theCamelHasTwoHumps"};
		
		
		for (int i = 0; i < camelCaseArray.length; i++) {
			 System.out.println(camelCaseArray[i]);
			 System.out.println(CamelToSnake(camelCaseArray[i]));
		}
		
	}
	
	public static String CamelToSnake(String camelCase) {

		String tempString = "";
		
		char[] charArray = camelCase.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (Character.isUpperCase(charArray[i])) {
	    		
	    		tempString = tempString + "_" + Character.toLowerCase(charArray[i]);

	    	} else {
	    		tempString = tempString +  charArray[i];
	    	}
	    	
	    	
	    
	    }
	    return tempString;
	}

}
