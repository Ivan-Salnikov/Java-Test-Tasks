package by.jonline.task04.main;



public class Task_04_07_Triangle {

	/* Описать класс, представляющий треугольник. 
	 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
	 * 
	 * Describe a class that represents a triangle. 
	 * Provide methods for creating objects, calculating the square, perimeter and intersection of the medians.
	 */
	
	private Task_04_07_Point a;
	
	private Task_04_07_Point b;
	
	private Task_04_07_Point c;
	
		
	Task_04_07_Triangle (Task_04_07_Point a_, Task_04_07_Point b_, Task_04_07_Point c_) {
		
		a =  a_;
	
		b = b_;
	
		c = c_;
	}
				
	
	
	public void printTriangle () {
		
		System.out.println ("A: ");
		a.print();
		
		System.out.println ("B: ");
		b.print();
		
		System.out.println ("C: ");
		c.print();
		
	}
	
	public double perimeter ( ) {
		
		double ab = Task_04_07_Point.distance(a, b);
		
		double bc = Task_04_07_Point.distance(b, c);
		
		double ac = Task_04_07_Point.distance(a, c);
		
		return ab + bc + ac; 
	}
	
	
	public double square ( ) {
		
		double ab = Task_04_07_Point.distance(a, b);
		
		double bc = Task_04_07_Point.distance(b, c);
		
		double ac = Task_04_07_Point.distance(a, c);
		
		double pp = (ab + bc + ac);
				
		return Math.sqrt(pp * (pp - ab) * (pp - bc) * (pp - ac)); 
	}
	
	
	public Task_04_07_Point medianCrossing () {
		
		return new Task_04_07_Point ((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
	}


}
