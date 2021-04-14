package by.jonline.task03.main;

public class Task_03a_02 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * В строке вставить после каждого символа 'a' символ 'b'.
		 * 
		 * In the string insert after each 'a' character 'b'.
		 */

		
		String someString  = " Cofee 50 Tea  80   Camel    68j4a65ff  000t   ff45 6gdfg    ";
		
		System.out.println(someString);
		
		
		String findString = "a";
		String replaceString = "ab";

		someString = someString.replace(findString, replaceString); 
	    	
	    
		System.out.println(someString);
	    
	}

}