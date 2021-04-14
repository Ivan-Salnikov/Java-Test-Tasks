package by.jonline.task02.main;

public class Task_02c_07 {

	public static void main(String[] args) {
		/*
		 * Write a method (s) for calculating the sum of the factorials of all odd numbers from 1 to 9..
		 */
	
		
			
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0 ) {
				System.out.println("Factorial for " + i + " is " + CalcFactorial(i));
			}
			
		}
	

	}
	
	private static int CalcFactorial (int number) {
		
		int temp = 1;
		
		for (int i = 1; i <= number; i++) {
			temp = temp * i;
		}
		return temp;
	}
	


	
}
