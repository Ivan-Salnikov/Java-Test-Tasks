package by.jonline.task04.main;

import java.util.Comparator;

public class Task_04_04_Train {
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
	
	Task_04_04_Train (String dest, int numTrain, String timeDep) {
		
		destination = dest;
		
		numberTrain = numTrain;
		
		timeDeparture = timeDep;
	}
	
		
	
	private String destination;
	
	private int numberTrain;
	
	private String timeDeparture;
	
	
	public String getDestination (){
		
		return destination;
		
	}
	
	@Override
	public String toString() {
		return "destination=" + destination + ", numberTrain=" + numberTrain + ", timeDeparture="
				+ timeDeparture;
	}

	
	public static class ByNumberComparator implements Comparator <Task_04_04_Train> {
		 
		@Override
		
		public int compare(Task_04_04_Train left, Task_04_04_Train right) {
		
			return left.numberTrain - right.numberTrain;
		}
		
	}
	
	
	public static class ByDestinationComparator implements Comparator <Task_04_04_Train> {
		 
		@Override
		
		public int compare(Task_04_04_Train left, Task_04_04_Train right) {
		
			return left.destination.compareTo(right.destination);
		}
		
	}
	
	
	public static class ByTimeComparator implements Comparator <Task_04_04_Train> {
		 
		@Override
		
		public int compare(Task_04_04_Train left, Task_04_04_Train right) {
		
			return left.timeDeparture.compareTo(right.timeDeparture);
		}
		
	}
	
	public static class ByDestinationAndTimeComparator implements Comparator <Task_04_04_Train> {
		 
		@Override
		
		public int compare(Task_04_04_Train left, Task_04_04_Train right) {
		
			if (left.destination == right.destination) {
				
				return left.timeDeparture.compareTo(right.timeDeparture);
			
			} else {
				
				return left.destination.compareTo(right.destination);
			}
				
			
		}
		
	}
	
	
	public int getNumTrain (){
		
		return numberTrain;
		
	}
	
	public String getTimeDeparture (){
		
		return timeDeparture;
		
	}
	
	public void setNumTrain (int num){
		
		numberTrain = num;
		
	}
	
	
	
	
	
	
}
