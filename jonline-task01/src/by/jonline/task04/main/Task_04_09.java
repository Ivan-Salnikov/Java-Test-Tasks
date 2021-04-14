package by.jonline.task04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_04_09 {

	public static void main(String[] args) {
		/* ������� ����� Book, ������������ �������� ��������� ����. 
		 * ���������� ������������, set- � get- ������ � ����� toString(). 
		 * ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������. 
		 * ������ �������� ������ ������ � ������� ��� ������ �� �������.
		 * 
		 * Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
		 * ����� � �������:
		 * 	a) ������ ���� ��������� ������;
		 * 	b) ������ ����, ���������� �������� �������������;
		 * 	c) ������ ����, ���������� ����� ��������� ����.
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
					"�������� ����� ����:\n" +
					"0. �����\n" +
					"1. �������� �����\n" +
					"2. ����� ���� ����\n" +
					"3. ����� ���� ������\n" +
					"4. ����� ���� ������������\n" +
					"5. ����� ���� ���������� ����� ��������� ����\n" +
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
			  		books.push_back(Task_04_09_Book.getBook());
			  		
			  		break;
			  		
			  	case 2:
			  		
			  		books.print();
			  		
			  		break;
			  		
			  	case 3:
			  		
			  		String auth = getUserInput("������� ������");
			  		
			  		books.printBooksByAuthor(auth);
			  		
			  		break;
			  		
			  	case 4:
			  		
			  		String publisher = getUserInput("������� ������������");
			  		
			  		books.printBooksByPublisher(publisher);
			  		
			  		break;
			  		
			  	case 5:
			  		
			  		int year = Integer.parseInt(getUserInput("������� ��������� ��� �������"));
			  		
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
