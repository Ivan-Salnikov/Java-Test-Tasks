package by.jonline.task04.main;

import java.util.Scanner;

public class Task_04_07 {

	public static void main(String[] args) {
		/* Описать класс, представляющий треугольник. 
		 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
		 * 
		 * Describe a class that represents a triangle. 
		 * Provide methods for creating objects, calculating the area, perimeter and intersection of the medians.
		 */
		
		
		System.out.println("Creating triangle. Please enter the coordinates of the vertices of the triangle");
		
		Scanner scanner = new Scanner(System.in);

		Task_04_07_Point a = new Task_04_07_Point();
		
		Task_04_07_Point b = new Task_04_07_Point();
		
		Task_04_07_Point c = new Task_04_07_Point();
		
		System.out.println("enter A: ");
		a.read(scanner);
		
		System.out.println("enter B: ");
		b.read(scanner);
		
		System.out.println("enter C: ");
		c.read(scanner);
		
	
		Task_04_07_Triangle triangle = new Task_04_07_Triangle(a, b, c);		
		
		  System.out.println("square: " + triangle.square());
		  
		  System.out.println("perimeter: " + triangle.perimeter());
		  
		  System.out.print("median_crossing: ");
		  
		  triangle.medianCrossing().print();
	}
	
	
	

}
