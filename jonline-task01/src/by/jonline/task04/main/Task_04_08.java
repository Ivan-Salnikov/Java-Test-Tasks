package by.jonline.task04.main;

import java.util.Scanner;

public class Task_04_08 {

	public static void main(String[] args) {
		/* —оздать класс Customer, спецификаци€ которого приведена ниже. 
		 * ќпределить конструкторы, set- и get- методы и метод toString(). 
		 * —оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами и методами. 
		 * «адать критерии выбора данных и вывести эти данные на консоль.
		 * 	
		 *  ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
		 * 
		 * 		Ќайти и вывести:
		 * 			a) список покупателей в алфавитном пор€дке;
		 * 			b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале
		 * 
		 * Create a Customer class whose specification is given below. 
		 * Define constructors, set and get methods, and the toString () method. 
		 * Create a second class that aggregates an array of type Customer, with appropriate constructors and methods. 
		 * Set the criteria for selecting data and display this data on the console.
		 * 
		 * Customer class: id, last name, first name, patronymic, address, credit card number, bank account number.
		 * Find and withdraw:
		 * 		a) a list of buyers in alphabetical order;
		 * 		b) a list of customers whose credit card number is in a given interval
		 */
		
		
		 Scanner scanner = new Scanner(System.in);
		 
		 Task_04_08_Customers customers = new Task_04_08_Customers(1);
		  
		  while (true) {
			  System.out.println(
					"¬ыберете пункт меню:\n" +
					"0. выйти\n" +
					"1. добавить покупател€\n" +
					"2. вывод покупателей в алфавитном пор€дке\n" +
					"3. вывод покупателей с кредитной картой в интервале\n" +
					": "
					  );
			  
			  int choice = scanner.nextInt();
		   
			  if (choice == 0)
				  break;
			  if (choice < 1 || choice > 3) {
				  
				  System.out.println("выбран неправильный пункт меню, повторите ввод.");
				  
				  continue;
			  }
			  switch (choice) {
			  	
			  	case 1:
			  		customers.push_back(Task_04_08_Customer.getCustomer(scanner));
			  		
			  		break;
			  		
			  	case 2:
			  		customers.sortByName();
			  		
			  		customers.print();
			  		
			  		break;
			  		
			  	case 3:
			  		System.out.println("¬веди диапазон кредитных карт\n");
			  		
			  		System.out.println("ќт: ");
			  		String from = scanner.next();
			  		
			  		System.out.println("ƒо: ");
			  		String to = scanner.next();
			  		
			  		customers.print_if_card_in(from, to);
		   }
		  }
		
	}
	
	
	

}
