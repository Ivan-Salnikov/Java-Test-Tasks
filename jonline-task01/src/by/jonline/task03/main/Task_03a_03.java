package by.jonline.task03.main;

public class Task_03a_03 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * Проверить, является ли заданное слово палиндромом
		 * 
		 * Check if the given word is a palindrome
		 */

		
		String someWord  = "ammthtmma";
		
		
		int indexMidWord;
		String firstHalfWord;
		String secondHalfWord;
		
		indexMidWord = someWord.length() / 2;
		
		firstHalfWord = someWord.substring(0, indexMidWord + someWord.length() % 2);
		
	
		StringBuilder sb = new StringBuilder (someWord.substring(indexMidWord,someWord.length())) ;
		
		secondHalfWord = sb.reverse().toString();
				

		if (firstHalfWord.equals(secondHalfWord)) {
		
			System.out.println(someWord + " is palindrome");
			
		} else {
			
			System.out.println(someWord + " is NOT palindrome");
		}
		
		
	    
	    
	}

}