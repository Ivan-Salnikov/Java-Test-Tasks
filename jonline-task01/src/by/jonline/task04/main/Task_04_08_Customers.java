package by.jonline.task04.main;

import java.util.*;

class Task_04_08_Customers {
 
	private Task_04_08_Customer[] customers;
 
	private int capacity;
	private int size;
 
	 public Task_04_08_Customers(int capacity_) {
		 
		  size = 0;
		  
		  capacity = capacity_;
		  
		  customers = new Task_04_08_Customer[capacity];
		  
		  
	 }
	 
	 public Task_04_08_Customers() {
		 
		 this(10);
		 
	 }
	 
	 public void push_back(Task_04_08_Customer customer) {
		  
		 if (size < capacity) {
			 
		   customers[size] = customer;
		   
		   size++;
		   
		  } else {
		   
			  Task_04_08_Customer[] buffer = new Task_04_08_Customer[capacity * 2];
			  
			  for (int i = 0; i < size; ++i) {
				  buffer[i] = customers[i];
			  }
			  
			  customers = buffer;
			  
			  capacity = capacity * 2;
			  
			  customers[size] = customer;
			  
			  size++;
			  
		  }
	 }
	 
	 public void print() {
		 
		  for (int i = 0; i < size; ++i) {
			  
			  System.out.println( customers[i].toString());
		  }	
	 }
	 
	 
	 public void sortByName() {
		 
		 
		 Arrays.sort(customers, 0, size, new Task_04_08_Customer.ByNameComparator());
		 
	 }
	 
	 
	 public void print_if_card_in(String a, String b) {
		
		 for (int i = 0; i < size; ++i) {
		
			 if (customers[i].getCardNumber().compareTo(a) >= 0 && customers[i].getCardNumber().compareTo(b) <= 0) {
			
				 customers[i].toString();		
			}
			 		
		 }
	 }
	 
}