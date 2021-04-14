package by.jonline.task04.main;

import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_04_04 {

	public static void main(String[] args) {
		/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
		 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
		 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
		 * Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
		 * 
		 * Create a Train class containing fields: destination name, train number, departure time. 
		 * Create data into an array of five elements of the Train type, add the ability to sort the array elements by train numbers. 
		 * Add the ability to display information about the train, the number of which is entered by the user. 
		 * Add the ability to sort the array by destination, where trains with the same destination must be sorted by departure time.
		 */
		
		
		int quantityOfTrains = 5;
		
		Task_04_04_Train trainArray[] = new Task_04_04_Train [quantityOfTrains];
				
		
		trainArray[0] = new Task_04_04_Train("Dest_1", 5, "14-10");
		
		trainArray[1] = new Task_04_04_Train("Dest_1", 7, "02-05");
		
		trainArray[2] = new Task_04_04_Train("Dest_2", 22, "22-40");
		
		trainArray[3] = new Task_04_04_Train("Dest_5", 1, "06-00");
		
		trainArray[4] = new Task_04_04_Train("Dest_1", 44, "19-50");
		
		
		System.out.println("Schedule before sorting:");
		
		for(int i = 0; i < trainArray.length; i++) {
			
			System.out.println(trainArray[i].toString());
			
		}

		System.out.println("");
		
		
		Arrays.sort(trainArray, new Task_04_04_Train.ByNumberComparator());
		
		System.out.println("After sorting by train number:");
		
		for(int i = 0; i < trainArray.length; i++) {
			
			System.out.println(trainArray[i].toString());
			
		}

		
		System.out.println("");
		
		Arrays.sort(trainArray, new Task_04_04_Train.ByDestinationAndTimeComparator());
		
		System.out.println("After sorting by destination (+time):");
		
		for(int i = 0; i < trainArray.length; i++) {
			
			System.out.println(trainArray[i].toString());
			
		}
		
		
		
		
		System.out.println("");
		System.out.println("Finding information about the train by user input");
		
		String numTrain = getUserInput("Please enter the number of train >>");
		
		int trainFind = Integer.parseInt(numTrain);
		
		System.out.println(getTrainInfo(trainFind, trainArray));
		
		
		
	}
	
	
	public static String getTrainInfo (int num, Task_04_04_Train arr[]) {
        
		String result = "Train with the number " + num + " does not exists";
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].getNumTrain() == num) {
				
				result = "Train with the number " + num + " has the destination to " + arr[i].getDestination() + " and departure time " + arr[i].getTimeDeparture();
				break;
			}
		}
		
        return result;

    }
	
	 public static String getUserInput (String prompt) {
	        String inputLine = null;
	        System.out.print(prompt + "  ");
	        try {
	            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	            inputLine = is.readLine();
	            if (inputLine.length() == 0) return null;
	        } catch (IOException e) {
	            System.out.println("IOException:  " + e);
	        }
	        return inputLine;

	    }
	
	
}
