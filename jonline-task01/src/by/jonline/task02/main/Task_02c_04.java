package by.jonline.task02.main;

import java.util.Arrays;

public class Task_02c_04 {

	public static void main(String[] args) {
		/*
		 * On the plane, n points are given by their coordinates. 
		 * Write a method (methods) that determine which of the pairs of points is the greatest distance. 
		 * Enter the coordinates of the points into the array.
		 */
	
		int arrayX [] = new int[] {-2, -8, 9, 10, 4, 12, 5, 4, -11, 6};		    
		
		int arrayY [] = new int[] {-6, 2, -4, 6, 8, 0, -10, 2, 8, 4};
		
		int pointCoord [] [] = new int[][] {{0, 0 }, {0, 0}};
		
		
		System.out.println("Coordinates for x = " + Arrays.toString(arrayX));
		System.out.println("Coordinates for y = " + Arrays.toString(arrayY));
		
		double maxD = calcMaxDistance(arrayX, arrayY, pointCoord);
		
		System.out.println("Maximum distance between the point (" + pointCoord[0][0] + ", " + pointCoord[0][1] + ") and ("+ 
				pointCoord[1][0] + ", " + pointCoord[1][1] + ") with distance = " + maxD);
			
		
		
	}
	
	private static double calcMaxDistance(int[] arrX, int[] arrY, int[][] pointCoord) {
		
		double maxDistance = 0;
		
		for (int i = 0; i < arrX.length; i++) {
			for (int j = 0; j < arrX.length; j++) {
				if (maxDistance < calcDistance(arrX[i], arrY[i], arrX[j], arrY[j])) {
					maxDistance = calcDistance(arrX[i], arrY[i], arrX[j], arrY[j]);	
					pointCoord[0][0] = arrX[i];
					pointCoord[0][1] = arrY[i];
					
					pointCoord[1][0] = arrX[j];
					pointCoord[1][1] = arrY[j];
				}				
			}
		}
		return 	maxDistance;
			
	}
	
	
	private static double calcDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	

}
