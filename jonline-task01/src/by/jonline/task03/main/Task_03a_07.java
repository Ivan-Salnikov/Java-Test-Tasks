package by.jonline.task03.main;

public class Task_03a_07 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * 
		 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
		 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
		 * 
		 * A string is entered. It is required to remove duplicate characters and all spaces from it. 
		 * For example, if you entered "abc cde def ", then" abcdef "should be output.
		 */
		
		String someWord  = "The informatics its a good way to enlarge your logics skill";
		
		//String someWord  = "abc cde def ";
		
		String firstPart;
		
		String secondPart;
		
		System.out.println(someWord);
		
		someWord = someWord.trim();
		
		someWord = someWord.replace(" ", "");
		
		for (int i = 0; i < someWord.length(); i++) {
			
			if (someWord.indexOf(someWord.substring(i, i+1), i+1) > 0) {
				
				firstPart = someWord.substring(0, i+1);
				
				secondPart = someWord.substring(i+1, someWord.length());
				
				secondPart = secondPart.replace(someWord.substring(i, i+1), "");
				
				someWord = firstPart + secondPart;
				
			}
			
		}
		
		
		
		System.out.println(someWord);
	    
	    
	}

}