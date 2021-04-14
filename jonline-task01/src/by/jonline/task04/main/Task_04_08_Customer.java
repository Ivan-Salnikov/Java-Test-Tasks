package by.jonline.task04.main;

import java.util.*;

public class Task_04_08_Customer {

	/* Создать класс Customer, спецификация которого приведена ниже. 
	 * Определить конструкторы, set- и get- методы и метод toString(). 
	 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 * 	
	 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
	 * 
	 * 		Найти и вывести:
	 * 			a) список покупателей в алфавитном порядке;
	 * 			b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
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
		
	private static long ID;
	
	private long idCustomer;
	
	private String lastName;
	
	private String firstName;
	
	private String patronymic;
	
	private String address;
	
	private String cardNumber;
	
	private String bankAccountNumber;
		

	 Task_04_08_Customer ( String cLastName, String cFirstName, String cPatronymic, String cAddress, String cCardNumber, String cBankAccountNumber) {
		 
			idCustomer = ID++;
			
			lastName = cLastName;
			
			firstName = cFirstName;
			
			patronymic = cPatronymic;
			
			address = cAddress;
			
			cardNumber = cCardNumber;
			
			bankAccountNumber = cBankAccountNumber;
		 
	 	}
	 

	 
	 
	 public static Task_04_08_Customer getCustomer(Scanner scanner) {
		 
		  Task_04_08_Customer customer = new Task_04_08_Customer("", "", "", "", "", "");
		  
		  System.out.print("name: ");
		  
		  customer.firstName = scanner.next();
		 
		  
		  System.out.print("surname: ");
		  customer.lastName = scanner.next();
		  
		  System.out.print("patronymic: ");
		  customer.patronymic = scanner.next();
		  
		  System.out.print("address: ");
		  customer.address = scanner.next();
		  
		  System.out.print("credit_сard_number: ");
		  customer.cardNumber = scanner.next();
		  
		  System.out.print("account_number: ");
		  customer.bankAccountNumber = scanner.next();
		  
		  return customer;
		 }

	 	
	 public static class ByNameComparator implements Comparator < Task_04_08_Customer > {
		  
	 		@Override
	 		
		  public int compare(Task_04_08_Customer left, Task_04_08_Customer right) {
	 			
		   if (left.lastName != right.lastName) {
			   
			   return left.lastName.compareTo(right.lastName);
			   
		   } else {
			
			   if (left.firstName != right.firstName) {
				   
				   return left.firstName.compareTo(right.firstName);
				   
			   } else {
				   
				   return left.patronymic.compareTo(right.patronymic);
			   }
				   
				   
				  }   
		   }
			   
		   
	}
	 


	public long getIdCustomer() {
		return idCustomer;
	}




	public void setIdCustomer(long idCustomer) {
		this.idCustomer = idCustomer;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getPatronymic() {
		return patronymic;
	}




	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String adress) {
		this.address = adress;
	}




	public String getCardNumber() {
		return cardNumber;
	}




	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}




	public String getBankAccountNumber() {
		return bankAccountNumber;
	}




	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}




	@Override
	public String toString() {
		return "idCustomer=" + idCustomer + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", patronymic=" + patronymic + ", adress=" + address + ", cardNumber=" + cardNumber
				+ ", bankAccountNumber=" + bankAccountNumber + "";
	}
	 

	 
		
}
