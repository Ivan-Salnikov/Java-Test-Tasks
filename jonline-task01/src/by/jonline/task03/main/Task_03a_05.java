package by.jonline.task03.main;

public class Task_03a_05 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * 
		 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
		 * 
		 * Count how many times the letter "a" occurs among the characters of a given string.
		 */
		
		String someWord  = "The informatics its a good way to enlarge your logics skill";
		
		String findString = "a";
		
		int firstMatch;		
		
		int countMatch = 0;
		
		System.out.println(someWord);
		
		firstMatch = someWord.indexOf(findString, 0);
		
		while (firstMatch >= 0) {
			
			firstMatch = someWord.indexOf(findString, firstMatch + 1);
			
			countMatch++;
		}
		
		System.out.println("String contains letter " + findString + " " + countMatch + " times");
	    
	    
	}

}