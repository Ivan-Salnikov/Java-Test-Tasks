package by.jonline.task03.main;

public class Task_03a_04 {

	public static void main(String[] args) {
		/*
		 * ������ �� ������� ��� � �������� ���� String ��� StringBuilder
		 * 
		 * � ������� ������� ����������� � �������� ������������ ��������� �� ������ ����� ������������� ����� �����.
		 * 
		 * Using the copy function and the concatenation operation, form the word ����� from the parts of the word �������������.
		 */
		
		String someWord  = "�����������";
		
		String resultWord = "";
		
		
		System.out.println("Original word is " + someWord);
		
		resultWord = resultWord.concat(someWord.substring(7, 8));
		
		resultWord = resultWord.concat(someWord.substring(3, 5));
		
		resultWord = resultWord.concat(someWord.substring(7, 8));
		
		System.out.println("Result word is " + resultWord);
	    
	    
	}

}