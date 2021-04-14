package by.jonline.task04.main;


import java.util.Scanner;

public class Task_04_07_Point {

	/* Описать класс, представляющий треугольник. 
	 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
	 * 
	 * Describe a class that represents a triangle. 
	 * Provide methods for creating objects, calculating the area, perimeter and intersection of the medians.
	 */
	
	public double x;
	
	public double y;
	
		
	Task_04_07_Point (double x_, double y_) {
		
		x = x_;
		y = y_;
	}
	
	Task_04_07_Point () {
		
		this (0, 0);
	}
		

	public static double distance (Task_04_07_Point a, Task_04_07_Point b) {
		
		double dx = a.x - b.x;
		
		double dy = a.y - b.y;
		
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public void print() {
		
		System.out.println("x: " + x + ", y: " + y);
	 }
	
	
	public void read(Scanner scanner) {
	
		System.out.print("x: ");
		
		x = scanner.nextDouble();
		
		System.out.print("y: ");
		
		y = scanner.nextDouble();
	}


}
