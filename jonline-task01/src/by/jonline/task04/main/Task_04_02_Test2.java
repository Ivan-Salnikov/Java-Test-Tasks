package by.jonline.task04.main;

public class Task_04_02_Test2 {
	/* Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
	 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
	 * Добавьте set- и get- методы для полей экземпляра класса.. 
	 * 
	 * Create class Test2 with two variables. 
	 * Add a constructor with input parameters. 
	 * Add a constructor that initializes the default class members. 
	 * Add set- and get- methods for the fields of the class instance.
	 */
	
	Task_04_02_Test2 (int v1, int v2) {
		var1 = v1;
		var2 = v2;
	}
	
	Task_04_02_Test2 () {
		var1 = 0;
		var2 = 0;
	}
	
	private int var1;
	
	private int var2;
	
	public void setVar1 (int tempVar1) {
		var1 = tempVar1;
	}
	
	public void setVar2 (int tempVar2) {
		var2 = tempVar2;
	}

	
	public int getVar1 () {
		
		return var1;
		
	}
	
	public int getVar2 () {
		
		return var2;
		
	}
	
	public void printVar () {
		System.out.println("var1: " + var1 );
		System.out.println("var2: " + var2 );
	}
}
