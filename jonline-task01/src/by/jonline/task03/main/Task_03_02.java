package by.jonline.task03.main;

public class Task_03_02 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с массивом символов
		 * Замените в строке все вхождения 'word' на 'letter'.
		 * 
		 * Replace all occurrences of 'word' in the string with 'letter'.
		 */

		
		String someString  = "this Is Example Of Camel Case word camel Case Will word Be Short Orword Long the word Camel Has Two Humps";
		
		System.out.println(someString);
		
		String findString = "word";
		String replaceString = "letter";
		
		while (someString.indexOf(findString) != -1) {
			someString	= someString.replace(findString, replaceString);
		}
		
		System.out.println(someString);
		
		
	    
	    
	}

}