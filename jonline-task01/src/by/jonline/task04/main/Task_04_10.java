package by.jonline.task04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_04_10 {

	public static void main(String[] args) {
		/*Создать класс Airline, спецификация которого приведена ниже. 
		 * Определить конструкторы, set- и get- методы и метод toString(). 
		 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
		 * Задать критерии выбора данных и вывести эти данные на консоль. 
		 * 
		 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
		 * Найти и вывести:
		 * 	a) список рейсов для заданного пункта назначения;
		 * 	b) список рейсов для заданного дня недели; 
		 * 	c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
		 * 
		 * Create an Airline class, the specification of which is given below. 
		 * Define constructors, set- and get- methods, and the toString () method. 
		 * Create a second class that aggregates the Airline array with appropriate constructors and methods. 
		 * Set the criteria for selecting data and display this data on the console.
		 * 
		 * Airline: destination, flight number, aircraft type, departure time, days of the week.
		 * Find and withdraw:
		 * 	a) a list of flights for a given destination;
		 * 	b) a list of flights for a given day of the week;
		 * 	c) a list of flights for a given day of the week, the departure time for which is greater than the given one.
		 */
		
		int day;
		String time;
		 
		Task_04_10_Airlines airlines = new Task_04_10_Airlines(1);
				
		Task_04_10_Airline a1 = new Task_04_10_Airline("Istanbul", "N1591", "Boeing", "13-10", true, true, true, true, true, true, true);
		
		airlines.push_back(a1);
		
		a1 = null;
		
		a1 = new Task_04_10_Airline("Moscow", "G1455", "Boeing", "06-10", true, false, true, false, true, false, true);
		
		airlines.push_back(a1);
		
		a1 = null;
		
		a1 = new Task_04_10_Airline("Chikago", "US225", "Airbus", "09-15", true, true, false, true, false, true, true);
		
		airlines.push_back(a1);
		
		a1 = null;
		
		a1 = new Task_04_10_Airline("Los Angeles", "US4565", "Airbus", "05-10", true, true, true, true, true, false, false);
		
		airlines.push_back(a1);		
		
		a1 = null;
		
		a1 = new Task_04_10_Airline("Moscow", "G1240", "Boeing", "12-40", true, true, true, true, true, true, true);
		
		airlines.push_back(a1);
		

		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		
			System.out.println(
					"\n" +
					"Выберете пункт меню:\n" +
					"0. выйти\n" +
					"1. добавить рейс\n" +
					"2. вывод всех рейсов\n" +
					"3. вывод всех рейсов по пункту назначения\n" +
					"4. вывод всех рейсов для дня недели\n" +
					"5. вывод всех рейсов для дня недели и времени вылета\n" +
					": "
					  );
			  
			  int choice = scanner.nextInt();
		   
			  if (choice == 0)
				  break;
			  if (choice < 1 || choice > 5) {
				  
				  System.out.println("выбран неправильный пункт меню, повторите ввод.");
				  
				  continue;
			  }
			  switch (choice) {
			  	
			  	case 1:
			  		airlines.push_back(Task_04_10_Airline.getAirline());
			  		
			  		break;
			  		
			  	case 2:
			  		
			  		airlines.print();
			  		
			  		break;
			  		
			  	case 3:
			  		
			  		String dest = getUserInput("Введите пункт назначения");
			  		
			  		airlines.printFlightforDestination(dest);
			  		
			  		break;
			  		
			  	case 4:
			  		
			  		day = Integer.parseInt(getUserInput("Введите день недели (цифра от 1 до 7, 1 - воскресенье)"));
			  		
			  		airlines.printFlightForDay(day, "");
			  		
			  		break;
			  		
			  	case 5:
			  		
			  		day = Integer.parseInt(getUserInput("Введите день недели (цифра от 1 до 7, 1 - воскресенье)"));
			  		
			  		time = getUserInput("Введите начальное время вылета");
			  		
			  		airlines.printFlightForDay(day, time);
			  		
			  		break;
			  		
		   }
		  }
		
		scanner.close();
	

	}
	
	private static String getUserInput (String prompt) {
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
