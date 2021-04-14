package by.jonline.task04.main;

public class Task_04_02 {

	public static void main(String[] args) {
		/* Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. 
		 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
		 * Добавьте set- и get- методы для полей экземпляра класса.. 
		 * 
		 * Create class Test2 with two variables. 
		 * Add a constructor with input parameters. 
		 * Add a constructor that initializes the default class members. 
		 * Add set- and get- methods for the fields of the class instance.
		 */
		
		Task_04_02_Test2 test1 = new Task_04_02_Test2();
		
		System.out.println("Initialize Test2 by default:");
		
		test1.printVar();
		
		
		System.out.println("Initialize Test2 by constructor with input parameters:");
		
		Task_04_02_Test2 test2 = new Task_04_02_Test2(65, 79);
		
		test2.printVar();
		
		
		System.out.println("Change Temp2 variables with set- method:");
		
		test2.setVar1(55);
		
		test2.setVar2(110);
		
		test2.printVar();
		
		
		System.out.println("Get Temp2 variables with get- method:");
		
		System.out.println("var1: " + test2.getVar1());
		
		System.out.println("var2: " + test2.getVar2());

	}

}
