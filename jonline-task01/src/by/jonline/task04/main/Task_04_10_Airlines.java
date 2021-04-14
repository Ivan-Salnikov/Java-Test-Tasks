package by.jonline.task04.main;

public class Task_04_10_Airlines {
	
	private Task_04_10_Airline[] airlines;
	
	private int capacity;
	
	private int size;
	
	 
	public Task_04_10_Airlines(int capacity) {
		
		super();
		
		this.size = 0;
		
		this.capacity = capacity;
		
		airlines = new Task_04_10_Airline[capacity];
		
	}
	
	public Task_04_10_Airlines() {
	
		this(10);
	}
	
	
	
	public void push_back (Task_04_10_Airline airline) {
		
		if (size < capacity) {
		
			airlines[size] = airline;
			
			size++;
			
			
			
		} else {
			
			Task_04_10_Airline[] buffer = new Task_04_10_Airline[capacity * 2];
			
			for (int i = 0; i < size; i++) {
				
				buffer[i] = airlines[i];
			}
			
			airlines = buffer;
			
			capacity = capacity * 2;
			
			airlines[size] = airline;
			
			size++;
			
		}
		
	}
	
	 public void print() {
		 
		  for (int i = 0; i < size; ++i) {
			  
			  System.out.println( airlines[i].toString());
		  }	
	 }
	 

	public void printFlightforDestination (String dest) {
		//	a) a list of flights for a given destination;
		
		System.out.println("Список рейсов для пункта назначения " + dest + ":");
		 
		 boolean isFind = false;
		 
		 for (int i = 0; i < size; ++i) {
			  
			  if (airlines[i].getDestination().equals(dest)) {
				
				  System.out.println( airlines[i].toString());
				  
				  isFind = true;
			  }
			  
		  }	
		 
		 if (isFind == false) {
			 System.out.println("Рейсов не найдено...");
		 }
		
	}
	
	public void printFlightForDay (int day, String time ) {
		//	a list of flights for a given day of the week;
		
		String dayOfWeek;
		
		String timeDeparture = "";
		
		if (time != "") {
			timeDeparture = " с временем вылета больше " + time; 
		}
		
		boolean isFind = false;
		
		switch (day) {	
			case 1:
				dayOfWeek = "воскресенье";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isSundayFlight()) {
						  
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
						
						  
					  }
					  
				  }
				
				break;
			case 2:
				dayOfWeek = "понедельник";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isMondayFlight()) {
						
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
					  }
					  
				  }	
				
				break;
			case 3:
				dayOfWeek = "вторник";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isTuesdayFlight()) {
						
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
					  }
					  
				  }
				
				break;
			case 4:
				dayOfWeek = "среда";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isWednesdayFlight()) {
						
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
					  }
					  
				  }
				
				break;
			case 5:
				dayOfWeek = "четверг";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isThursdayFlight()) {
						
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
					  }
					  
				  }
				break;
			case 6:
				dayOfWeek = "пятница";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isFridayFlight()) {
						
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
					  }
					  
				  }
				break;
			case 7:
				dayOfWeek = "суббота";
				System.out.println("Список рейсов для дня недели " + dayOfWeek + timeDeparture + ":");
				
				for (int i = 0; i < size; ++i) {
					  
					  if (airlines[i].isSaturdayFlight()) {
						
						  if (airlines[i].getDepartureTime().compareTo(time) > 0) {
							  
							  System.out.println( airlines[i].toString());
							  
							  isFind = true;
							  
						  }
					  }
					  
				  }
				
				break;
		}
		 
		 
		 
		 if (isFind == false) {
			 System.out.println("Рейсов не найдено...");
		 }
		
	}
	
	 
}
