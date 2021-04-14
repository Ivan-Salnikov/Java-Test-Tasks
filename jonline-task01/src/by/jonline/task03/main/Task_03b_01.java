package by.jonline.task03.main;
import java.util.regex.Pattern;

public class Task_03b_01 {

	public static void main(String[] args) {
		/*
		 * Работа с регулярными выражениями (Pattern, Matcher)
		 * 
		 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции: 
		 * отсортировать абзацы по количеству предложений; 
		 * в каждом предложении отсортировать слова по длине; 
		 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

		 * 
		 * Create an application that parses the text (the text is stored in a line) and allows you to perform three different operations with the text: 
		 * sort paragraphs by the number of sentences; 
		 * sort words by length in each sentence; 
		 * sort tokens in a sentence in descending order of the number of occurrences of a given character, and in case of equality, alphabetically.
		 */
		
		String someWord  = "Create an application. That parses the text. And allows you to perform three different operations with the text " + 
				"\r\n" + "First. Sort paragraphs by the number of sentences; " + 
				"\r\n" + "2. Second operation. Sort words by length in each sentence;" + 
				"\r\n" + "3. Sort tokens in a sentence in descending order of the number of occurrences of a given character, and in case of equality, alphabetically. OK? The end";
		
		System.out.println(someWord);
		System.out.println("");
		
		System.out.println("Sorting pharagraphs by number of sences:");
		System.out.println(sortPharagraphsByNumberOfSentences(someWord));
		System.out.println("");
		
		
		
		System.out.println("Sorting sences ascending words length:");
		
		for(String sences : someWord.split("[!?.]\\s*")) {
		
			System.out.println(sortSentenceByNumberOfWords(sences));
		}
		System.out.println("");
		
		
		
		String findString = "a";
		
		System.out.println("Sorting words in sences ascending words matching '" + findString + "'");
		
		for(String sences : someWord.split("[!?.]\\s*")) {
		
			System.out.println(sortWordByCountMatchLetter(sences, findString));
		}
		
		
	    
	}
	
	
	public static String sortWordByCountMatchLetter (String sence, String findString) {
		
		String result = "";
		String tempString;
		String regex;
		
		int quantityMatchFirst;
		int quantityMatchSecond;
				
		regex = ("\\s*(\\s|,|!|\\.)\\s*");
		
		Pattern patternWord = Pattern.compile(regex);
		
		String s[] = patternWord.split(sence);
			
		for(int i = 0; i < s.length; i++) {
			
			quantityMatchFirst = quantityMatch (s[i], findString);
			
			for (int j = 0; j < s.length; j++) {
			
				quantityMatchSecond = quantityMatch (s[j], findString);
				
				if (quantityMatchSecond < quantityMatchFirst) {
					
					tempString = s[i];
					s[i] = s[j];
					s[j] = tempString;
					
				} else if (quantityMatchSecond == quantityMatchFirst) {
					
					int compare = s[i].compareToIgnoreCase(s[j]);
					
					if (compare < 0) {
						
						tempString = s[i];
						s[i] = s[j];
						s[j] = tempString;
						
					}
				}
			}
			
								
			}
		
		
		for(int i = 0; i < s.length; i++) {
			
			result = result.concat(s[i]) + " ";
		}
		
		return result;
	}
	
	
	
	
	
	public static int quantityMatch (String word, String findString) {
		
		int result = 0;
		
		char[] charArray = word.toCharArray();
	    
	    for (int i = 0; i < charArray.length; i++){
	        
	    	if (findString.equals(Character.toString(charArray[i]))) {
	    		
	    		result++;

	    	} 	
	    }
		
		return result;
	}
	
	
	
	
	public static String sortSentenceByNumberOfWords (String sence) {
		
		String result = "";
		String tempString;
				
		Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
		
		String s[] = pattern.split(sence);
			
		for(int i = 0; i < s.length; i++) {
			
			for(int j = 0; j < s.length; j++) {
			
				if(s[j].toString().length() > s[i].toString().length()) {
				
					tempString = s[i]; 
					
					s[i] = s[j];
					
					s[j] = tempString; 
				}
								
			}
			
		}
		
		for(int i = 0; i < s.length; i++) {
			
			result = result.concat(s[i]) + " ";
		}
		
		return result;
	}

	
	public static String sortPharagraphsByNumberOfSentences (String inputString) {
		
		String result = "";
		String tempString;
				
		String s[] = inputString.trim().split("\r\n");
			
		for(int i = 0; i < s.length; i++) {
			
			for(int j = 0; j < s.length; j++) {
			
				if(s[j].toString().split("[!?.]\\s*").length > s[i].toString().split("[!?.]\\s*").length) {
				
					tempString = s[i]; 
					
					s[i] = s[j];
					
					s[j] = tempString; 
				}
								
			}
			
		}
		
		for(int i = 0; i < s.length; i++) {
			
			result = result.concat(s[i]) + "\r\n";
		}
		
		return result;
	}

}