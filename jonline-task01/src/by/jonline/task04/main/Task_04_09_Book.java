package by.jonline.task04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_04_09_Book {

	/* Создать класс Book, спецификация которого приведена ниже. 
	 * Определить конструкторы, set- и get- методы и метод toString(). 
	 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
	 * Найти и вывести:
	 * 	a) список книг заданного автора;
	 * 	b) список книг, выпущенных заданным издательством;
	 * 	c) список книг, выпущенных после заданного года.
	 * 
	 * Create a Book class, the specification of which is given below. 
	 * Define constructors, set and get methods, and the toString () method. 
	 * Create a second class that aggregates an array of type Book with appropriate constructors and methods. 
	 * Set the criteria for selecting data and display this data on the console.
	 * 
	 * Book: id, title, author (s), publisher, year of publication, number of pages, price, type of binding.
	 * Find and withdraw:
	 * 	a) a list of books by a given author;
	 * 	b) a list of books published by a given publisher;
	 * 	c) a list of books released after a given year.
	 */
		
	private static long ID;
	
	private long idBook;
	
	private String title;
	
	private String author;
	
	private String publisher;
	
	private int yearOfPublication;
	
	private int numberPages;
	
	private double price;
	
	private String typeBinding;
		

	public Task_04_09_Book(String title, String author, String publisher, int yearOfPublication, int numberPages,
			double price, String typeBinding) {
		
		super();
		
		this.idBook = ID++;
		
		this.title = title;
		
		this.author = author;
		
		this.publisher = publisher;
		
		this.yearOfPublication = yearOfPublication;
		
		this.numberPages = numberPages;
		
		this.price = price;
		
		this.typeBinding = typeBinding;
		
	}

	 
	 
	 public static Task_04_09_Book getBook() {
		 
		  Task_04_09_Book book = new Task_04_09_Book("", "", "", 0, 0, (double)0, "");
		  
		  book.title =  getUserInput("title: ");
		  
		  book.author =  getUserInput("author(s): ");
		  
		  book.publisher =  getUserInput("publisher: ");
		  
		  book.yearOfPublication =  Integer.parseInt(getUserInput("year of publication: "));
		  
		  book.numberPages =  Integer.parseInt(getUserInput("number of pages: "));
		  
		  book.price =  Double.parseDouble(getUserInput("price: "));
		  
		  book.typeBinding =  getUserInput("type of binding: ");
		  
		  return book;
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



	@Override
	public String toString() {
		return "idBook=" + idBook + ", title=" + title + ", author=" + author + ", publisher="
				+ publisher + ", yearOfPublication=" + yearOfPublication + ", numberPages=" + numberPages + ", price="
				+ price + ", typeBinding=" + typeBinding + "";
	}



	public long getIdBook() {
		return idBook;
	}



	public void setIdBook(long idBook) {
		this.idBook = idBook;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public int getYearOfPublication() {
		return yearOfPublication;
	}



	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}



	public int getNumberPages() {
		return numberPages;
	}



	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getTypeBinding() {
		return typeBinding;
	}



	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}
	
	 


	
	 
		
}
