package by.jonline.task04.main;

public class Task_04_09_Books {
	
	private Task_04_09_Book[] books;
	 
	private int capacity;
	
	private int size;
	
	
	public Task_04_09_Books (int capacity_) {
		
		size = 0;
		
		capacity = capacity_;
		
		books = new Task_04_09_Book [capacity];
	}
	
	public Task_04_09_Books () {
		
		this(10);
	}
	
	
	public void push_back (Task_04_09_Book book) {
		
		if (size < capacity) {
		
			books[size] = book;
			
			size++;
			
			
			
		} else {
			
			Task_04_09_Book[] buffer = new Task_04_09_Book[capacity * 2];
			
			for (int i = 0; i < size; i++) {
				
				buffer[i] = books[i];
			}
			
			books = buffer;
			
			capacity = capacity * 2;
			
			books[size] = book;
			
			size++;
			
		}
		
	}
	
	
	 public void print() {
		 
		  for (int i = 0; i < size; ++i) {
			  
			  System.out.println( books[i].toString());
		  }	
	 }
	 
	 
	 public void printBooksByAuthor (String auth) {
		 
		 System.out.println(" ниги автора " + auth + ":");
		 
		 boolean isFind = false;
		 
		 for (int i = 0; i < size; ++i) {
			  
			  if (books[i].getAuthor().equals(auth)) {
				
				  System.out.println( books[i].toString());
				  
				  isFind = true;
			  }
			  
		  }	
		 
		 if (isFind == false) {
			 System.out.println(" ниг не найдено...");
		 }
		 
	 }
	 
	 public void printBooksByPublisher (String publ) {
		 
		 System.out.println(" ниги издательства " + publ + ":");
		 
		 boolean isFind = false;
		 
		 for (int i = 0; i < size; ++i) {
			  
			  if (books[i].getPublisher().equals(publ)) {
				
				  System.out.println( books[i].toString());
				  
				  isFind = true;
			  }
			  
		  }	
		 
		 if (isFind == false) {
			 System.out.println(" ниг не найдено...");
		 }
		 
	 }
	 
	 public void printBooksGreaterPublicationYear (int year) {
		 
		 System.out.println(" ниги изданные после " + year + ":");
		 
		 boolean isFind = false;
		 
		 for (int i = 0; i < size; ++i) {
			  
			  if (books[i].getYearOfPublication() >= year) {
				
				  System.out.println( books[i].toString());
				  
				  isFind = true;
			  }
			  
		  }	
		 
		 if (isFind == false) {
			 System.out.println(" ниг не найдено...");
		 }
		 
	 }
}
