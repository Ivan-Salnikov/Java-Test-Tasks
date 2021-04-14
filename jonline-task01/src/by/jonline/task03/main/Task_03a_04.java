package by.jonline.task03.main;

public class Task_03a_04 {

	public static void main(String[] args) {
		/*
		 * Работа со строкой как с объектом типа String или StringBuilder
		 * 
		 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
		 * 
		 * Using the copy function and the concatenation operation, form the word “торт” from the parts of the word “информатика”.
		 */
		
		String someWord  = "информатика";
		
		String resultWord = "";
		
		
		System.out.println("Original word is " + someWord);
		
		resultWord = resultWord.concat(someWord.substring(7, 8));
		
		resultWord = resultWord.concat(someWord.substring(3, 5));
		
		resultWord = resultWord.concat(someWord.substring(7, 8));
		
		System.out.println("Result word is " + resultWord);
	    
	    
	}

}