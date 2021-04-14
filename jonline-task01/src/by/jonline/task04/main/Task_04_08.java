package by.jonline.task04.main;

import java.util.Scanner;

public class Task_04_08 {

	public static void main(String[] args) {
		/* ������� ����� Customer, ������������ �������� ��������� ����. 
		 * ���������� ������������, set- � get- ������ � ����� toString(). 
		 * ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
		 * ������ �������� ������ ������ � ������� ��� ������ �� �������.
		 * 	
		 * ����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
		 * 
		 * 		����� � �������:
		 * 			a) ������ ����������� � ���������� �������;
		 * 			b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
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
					"�������� ����� ����:\n" +
					"0. �����\n" +
					"1. �������� ����������\n" +
					"2. ����� ����������� � ���������� �������\n" +
					"3. ����� ����������� � ��������� ������ � ���������\n" +
					": "
					  );
			  
			  int choice = scanner.nextInt();
		   
			  if (choice == 0)
				  break;
			  if (choice < 1 || choice > 3) {
				  
				  System.out.println("������ ������������ ����� ����, ��������� ����.");
				  
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
			  		System.out.println("����� �������� ��������� ����\n");
			  		
			  		System.out.println("��: ");
			  		String from = scanner.next();
			  		
			  		System.out.println("��: ");
			  		String to = scanner.next();
			  		
			  		customers.print_if_card_in(from, to);
		   }
		  }
		
	}
	
	
	

}
