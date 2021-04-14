package by.jonline.task02.main;

public class Task_02c_01 {

	public static void main(String[] args) {
		/*
		 * Write a method (s) for finding the greatest common divisor and the least common multiple of two natural numbers.
		 */
	
		int a = 6;		    
		
		int b= 8;
		
		System.out.println("GCD (" + a + ", " + b + ") = " + gcd(a, b ));
		System.out.println("LCM (" + a + ", " + b + ") = " + lcm(a, b ));
		
				
	}

	
	private static int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}


	private static int lcm(int a, int b) {
		
		return a * b / gcd(a, b);
		
		}
	
}