package by.jonline.task03.main;

public class Task_03a_10 {

	public static void main(String[] args) {
		/*
		 * –абота со строкой как с объектом типа String или StringBuilder
		 * 
		 * —трока X состоит из нескольких предложений, каждое из которых кончаетс€ точкой, восклицательным 
		 * или вопросительным знаком. 
		 * ќпределить количество предложений в строке X.

		 * 
		 * Line X consists of several sentences, each ending with a period, exclamation mark, or question mark. 
		 * Determine the number of sentences in line X.
		 */
		
		String someWord  = "Tom! No Answer. Tom! No answer. Whats gone with that boy, I wonder? You TOM!";
		
		System.out.println(someWord);
		
		int countSentences = someWord.split("[!?.]+").length;
	    
			
		System.out.println("String contains " + countSentences + " sentences");	    
	    
	}

}