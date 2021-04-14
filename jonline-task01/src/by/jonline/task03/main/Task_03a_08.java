package by.jonline.task03.main;

public class Task_03a_08 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * 
		 * Вводится строка слов, разделенных пробелами. 
		 * Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
		 * 
		 * A string of words is entered, separated by spaces. 
		 * Find the longest word and display it on the screen. 
		 * The case when there may be several longest words, do not process.
		 */
		
		String someWord  = " The good way to enlarge your logics skill is informatics";
		
		String findString = " ";
		String maxWord;
		
		int firstSpace = 0;
		int nextSpace = 0;
		int maxWordLength;
		
		
		System.out.println(someWord);
		
		firstSpace = someWord.indexOf(findString, 0);
		
		if (firstSpace > 0) {
			
			nextSpace = firstSpace;  
					
			firstSpace = 0;
			
		} else {
			nextSpace = someWord.indexOf(findString, 1);	
		}
		
		
		maxWordLength = nextSpace - firstSpace - 1;
		
		maxWord = someWord.substring(firstSpace + 1, nextSpace);
		

		
		while ((nextSpace - firstSpace - 1) >= 0) {
			
			firstSpace = someWord.indexOf(findString, nextSpace);
			
			if (firstSpace == -1) {
				break;
			}
			
			nextSpace = someWord.indexOf(findString, firstSpace + 1);
			
			if (nextSpace == -1) {
				nextSpace = someWord.length() ;
			}
			
			if ((nextSpace - firstSpace - 1) > maxWordLength) {
			
				maxWordLength = nextSpace - firstSpace - 1 ;
			
				maxWord = someWord.substring(firstSpace + 1, nextSpace);
			

			}
		}
		
			
		System.out.println("The longest word in the string is '" + maxWord + "' with length " + maxWordLength);
	    
	    
	}

}