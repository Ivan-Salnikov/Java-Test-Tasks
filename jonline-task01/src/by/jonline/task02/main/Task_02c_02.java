package by.jonline.task02.main;

public class Task_02c_02 {

	public static void main(String[] args) {
		/*
		 * Write a method (s) for finding the greatest common divisor of four natural numbers.
		 */
	
		int a = 9;		    
		
		int b = 12;
		
		int c = 24;
		
		int d = 6;
		
		System.out.println("GCD (" + a + ", " + b + ", " + c + ", " + d + ") = " + gcd_4(a, b, c, d ));
		
		
				
	}

	
	private static int gcd_4(int a, int b, int c, int d) {
		   
		int temp = gcd(a,b);
		
		temp = gcd(temp, c);
		
		temp = gcd(temp, d);
		
		return temp;
		}
	
	private static int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}


	
	
}