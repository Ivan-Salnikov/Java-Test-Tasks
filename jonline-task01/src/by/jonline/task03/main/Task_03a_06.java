package by.jonline.task03.main;

public class Task_03a_06 {

	public static void main(String[] args) {
		/*
		 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder
		 * 
		 * �� �������� ������ �������� �����, �������� ������ ������ ������.
		 * 
		 * Get a new one from the given string by repeating each character twice.
		 */
		
		String someWord  = "The informatics its a good way to enlarge your logics skill";
				
		String resutlWord = "";
		
		System.out.println(someWord);
		
		for (int i = 0; i < someWord.length(); i++) {
			
			resutlWord = resutlWord.concat(someWord.substring(i, i+1));
			resutlWord = resutlWord.concat(someWord.substring(i, i+1));
			
		}
		
		
		
		System.out.println(resutlWord);
	    
	    
	}

}