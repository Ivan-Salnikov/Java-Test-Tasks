package by.jonline.task02.main;


public class Task_02c_11 {

	public static void main(String[] args) {
		/*
		 * Write a method (s) that determines which of the given two numbers has more digits.
		 */
	
		int n =  (int)(Math.random() *  (25000)); 
		
		int m =  (int)(Math.random() *  (25000)); 
		
		System.out.println("N = " + n);
		System.out.println("M = " + m);
		
		int k = CompareNumbersLength(n, m);
		
		switch (k) {
			case 1:
				System.out.println("Number " + n + " contains more digits");
				break;
			case 2:
				System.out.println("Number " + m + " contains more digits");
				break;
			case 0:
				System.out.println("Number " + n + " and " + m + " contains equal digits");
				break;
		}
		
		
			

	
	}
	
	public static int CompareNumbersLength (int x, int y) {
		int quantX = CalcNumberLength(x);
		int quantY = CalcNumberLength(y);
		
		if (quantX > quantY) {
			return 1;
		} else if (quantX < quantY) {
			return 2;
		} else return 0;
		
	}
	
	public static int CalcNumberLength(int number) {

	    String n = Integer.toString(number);
	    char[] charArray = n.toCharArray();
	    
	    return charArray.length;
	}
	
	
	
	
}
