package by.jonline.task02.main;

public class Task_02c_03 {

	public static void main(String[] args) {
		/*
		 * Calculate the area of a regular hexagon with side "a" and using the method for calculating the area of a triangle.
		 */
	
		int a = 9;		    
		
				
		System.out.println("Area of the regular hexagon with side = " + a + " is: " + calcAreaHexagon(a));
		
		
				
	}

	
	private static double calcAreaHexagon(int a) {
		   
		return calcAreaTriangle(a) * 6;
		
		 
		}
	
	private static double calcAreaTriangle(int a) {
		 
		return Math.sqrt(3) * Math.pow(a, 2) / 4;
	}

	
	
}