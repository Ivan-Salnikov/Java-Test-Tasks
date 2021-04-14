package by.jonline.task04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_04_10 {

	public static void main(String[] args) {
		/*������� ����� Airline, ������������ �������� ��������� ����. 
		 * ���������� ������������, set- � get- ������ � ����� toString(). 
		 * ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������. 
		 * ������ �������� ������ ������ � ������� ��� ������ �� �������. 
		 * 
		 * Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
		 * ����� � �������:
		 * 	a) ������ ������ ��� ��������� ������ ����������;
		 * 	b) ������ ������ ��� ��������� ��� ������; 
		 * 	c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
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
					"�������� ����� ����:\n" +
					"0. �����\n" +
					"1. �������� ����\n" +
					"2. ����� ���� ������\n" +
					"3. ����� ���� ������ �� ������ ����������\n" +
					"4. ����� ���� ������ ��� ��� ������\n" +
					"5. ����� ���� ������ ��� ��� ������ � ������� ������\n" +
					": "
					  );
			  
			  int choice = scanner.nextInt();
		   
			  if (choice == 0)
				  break;
			  if (choice < 1 || choice > 5) {
				  
				  System.out.println("������ ������������ ����� ����, ��������� ����.");
				  
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
			  		
			  		String dest = getUserInput("������� ����� ����������");
			  		
			  		airlines.printFlightforDestination(dest);
			  		
			  		break;
			  		
			  	case 4:
			  		
			  		day = Integer.parseInt(getUserInput("������� ���� ������ (����� �� 1 �� 7, 1 - �����������)"));
			  		
			  		airlines.printFlightForDay(day, "");
			  		
			  		break;
			  		
			  	case 5:
			  		
			  		day = Integer.parseInt(getUserInput("������� ���� ������ (����� �� 1 �� 7, 1 - �����������)"));
			  		
			  		time = getUserInput("������� ��������� ����� ������");
			  		
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
