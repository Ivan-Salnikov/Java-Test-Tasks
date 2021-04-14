package by.jonline.task02.main;



public class Task_02c_09 {

	public static void main(String[] args) {
		/*
		 * Given the numbers X, Y, Z, T - the lengths of the sides of the quadrangle. 
		 * Write a method (methods) for calculating its area if there is a right angle between sides of length X and Y.
		 */
	
		int x = 10; 
		int y = 20; 
		int z = 15; 				
		int t = 21;
		
		
				
		System.out.println("Area of Quadrangle is " + CalcAreaQuadrangle (x, y, z, t));

	
	}
	
	private static double CalcAreaQuadrangle (int x, int y, int z, int t) {
		
		double AreaRightTriangle = CalcAreaRightTriangle (x, y);
		
		System.out.println("AreaRightTriangle is " + AreaRightTriangle);
		
		double AreaTriangle  = CalcAreaTriangle(CalcHypotenuse (x, y), z, t);
		
		System.out.println("AreaTriangle is " + AreaTriangle);
		
		return AreaRightTriangle + AreaTriangle;
	
	}
	
	
	private static double CalcAreaRightTriangle (int x, int y) {
		
		double xLeg = (double) x;		
		double yLeg = (double) y;
		
		return xLeg * yLeg / 2;
	}
	
	
	private static double CalcHypotenuse (int x, int y) {
	
		double xLeg = (double) x;		
		double yLeg = (double) y;
	
		
		return Math.sqrt(Math.pow(xLeg,2) + Math.pow(yLeg,2));
	
	}
	
	private static double CalcAreaTriangle (double x, double y, double z) {
		
		double halfPerimeter = (x + y + z) / 2;
				
		return Math.sqrt(halfPerimeter * (halfPerimeter - x) * (halfPerimeter - y) * (halfPerimeter - z));
	}


	
}
