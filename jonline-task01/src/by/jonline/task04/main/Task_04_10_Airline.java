package by.jonline.task04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_04_10_Airline {
	
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

	public Task_04_10_Airline(String destination, String flightNumber, String aircraftType, String departureTime,
			boolean isSundayFlight, boolean isMondayFlight, boolean isTuesdayFlight, boolean isWednesdayFlight,
			boolean isThursdayFlight, boolean isFridayFlight, boolean isSaturdayFlight) {
		
		super();
		
		this.idAirline = ID++;
		
		this.destination = destination;
		
		this.flightNumber = flightNumber;
		
		this.aircraftType = aircraftType;
		
		this.departureTime = departureTime;
		
		this.isSundayFlight = isSundayFlight;
		
		this.isMondayFlight = isMondayFlight;
		
		this.isTuesdayFlight = isTuesdayFlight;
		
		this.isWednesdayFlight = isWednesdayFlight;
		
		this.isThursdayFlight = isThursdayFlight;
		
		this.isFridayFlight = isFridayFlight;
		
		this.isSaturdayFlight = isSaturdayFlight;
	}



	private static long ID;
	
	private long idAirline;
	
	private String destination; 
	
	private String flightNumber;
	
	private String aircraftType;
	
	private String departureTime;
	
	private boolean isSundayFlight;
	
	private boolean isMondayFlight;
	
	private boolean isTuesdayFlight;
	
	private boolean isWednesdayFlight;
	
	private boolean isThursdayFlight;
	
	private boolean isFridayFlight;
	
	private boolean isSaturdayFlight;
	   

	 public static Task_04_10_Airline getAirline() {
		 
		 
		  Task_04_10_Airline airline = new Task_04_10_Airline("", "", "", "", false, false, false, false, false, false, false);
		  
		  airline.destination =  getUserInput("destination: ");
		  
		  airline.flightNumber =  getUserInput("flight number: ");
		  
		  airline.aircraftType =  getUserInput("aircraf type: ");
		  
		  airline.departureTime =  getUserInput("departure time: ");
		  
		  airline.isSundayFlight =  Boolean.getBoolean(getUserInput("is Sunday flight? (type 1 if yes, type 0 if no): "));
		  
		  airline.isMondayFlight =  Boolean.getBoolean(getUserInput("is Monday flight? (type 1 if yes, type 0 if no): "));
		  
		  airline.isTuesdayFlight =  Boolean.getBoolean(getUserInput("is Tuesday flight? (type 1 if yes, type 0 if no): "));
		  
		  airline.isWednesdayFlight =  Boolean.getBoolean(getUserInput("is Wednesday flight? (type 1 if yes, type 0 if no): "));
		  
		  airline.isThursdayFlight =  Boolean.getBoolean(getUserInput("is Thursday flight? (type 1 if yes, type 0 if no): "));
		  
		  airline.isFridayFlight =  Boolean.getBoolean(getUserInput("is Friday flight? (type 1 if yes, type 0 if no): "));
		  
		  airline.isSaturdayFlight =  Boolean.getBoolean(getUserInput("is Saturday flight? (type 1 if yes, type 0 if no): "));
		  
		  		  
		  return airline;
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


	public long getIdAirline() {
		return idAirline;
	}


	public void setIdAirline(long idAirline) {
		this.idAirline = idAirline;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAircraftType() {
		return aircraftType;
	}


	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	public boolean isSundayFlight() {
		return isSundayFlight;
	}


	public void setSundayFlight(boolean isSundayFlight) {
		this.isSundayFlight = isSundayFlight;
	}


	public boolean isMondayFlight() {
		return isMondayFlight;
	}


	public void setMondayFlight(boolean isMondayFlight) {
		this.isMondayFlight = isMondayFlight;
	}


	public boolean isTuesdayFlight() {
		return isTuesdayFlight;
	}


	public void setTuesdayFlight(boolean isTuesdayFlight) {
		this.isTuesdayFlight = isTuesdayFlight;
	}


	public boolean isWednesdayFlight() {
		return isWednesdayFlight;
	}


	public void setWednesdayFlight(boolean isWednesdayFlight) {
		this.isWednesdayFlight = isWednesdayFlight;
	}


	public boolean isThursdayFlight() {
		return isThursdayFlight;
	}


	public void setThursdayFlight(boolean isThursdayFlight) {
		this.isThursdayFlight = isThursdayFlight;
	}


	public boolean isFridayFlight() {
		return isFridayFlight;
	}


	public void setFridayFlight(boolean isFridayFlight) {
		this.isFridayFlight = isFridayFlight;
	}


	public boolean isSaturdayFlight() {
		return isSaturdayFlight;
	}


	public void setSaturdayFlight(boolean isSaturdayFlight) {
		this.isSaturdayFlight = isSaturdayFlight;
	}


	@Override
	public String toString() {
		return "idAirline=" + idAirline + ", destination=" + destination + ", flightNumber="
				+ flightNumber + ", aircraftType=" + aircraftType + ", departureTime=" + departureTime
				+ ", isSundayFlight=" + isSundayFlight + ", isMondayFlight=" + isMondayFlight + ", isTuesdayFlight="
				+ isTuesdayFlight + ", isWednesdayFlight=" + isWednesdayFlight + ", isThursdayFlight="
				+ isThursdayFlight + ", isFridayFlight=" + isFridayFlight + ", isSaturdayFlight=" + isSaturdayFlight
				+ "";
	}
	
	
	
	
}
