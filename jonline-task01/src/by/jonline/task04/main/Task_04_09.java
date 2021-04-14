package by.jonline.task04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_04_09 {

	public static void main(String[] args) {
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
		
		
		 
		Task_04_09_Books books = new Task_04_09_Books(1);
		
		Task_04_09_Book b1 = new Task_04_09_Book("Tom Sawer", "Mark Twain", "Pub1", 1982, 220, 5.89, "b1");
		
		books.push_back(b1);
				
		b1 = new Task_04_09_Book("The Daughter's Tale", "Armando Lucas Correa", "Pub2", 2021, 550, 25.42, "b2");
		
		books.push_back(b1);

		b1 = new Task_04_09_Book("Mornings with Rosemary", "Libby Page", "Pub2", 2018, 150, 15.00, "b2");
		
		books.push_back(b1);

		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		
			System.out.println(
					"\n" +
					"Выберете пункт меню:\n" +
					"0. выйти\n" +
					"1. добавить книгу\n" +
					"2. вывод всех книг\n" +
					"3. вывод книг автора\n" +
					"4. вывод книг издательства\n" +
					"5. вывод книг выпущенных после заданного года\n" +
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
			  		books.push_back(Task_04_09_Book.getBook());
			  		
			  		break;
			  		
			  	case 2:
			  		
			  		books.print();
			  		
			  		break;
			  		
			  	case 3:
			  		
			  		String auth = getUserInput("Введите автора");
			  		
			  		books.printBooksByAuthor(auth);
			  		
			  		break;
			  		
			  	case 4:
			  		
			  		String publisher = getUserInput("Введите издательство");
			  		
			  		books.printBooksByPublisher(publisher);
			  		
			  		break;
			  		
			  	case 5:
			  		
			  		int year = Integer.parseInt(getUserInput("Введите начальный год издания"));
			  		
			  		books.printBooksGreaterPublicationYear(year);
			  		
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
