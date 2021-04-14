package by.jonline.task04.main;

public class Test1 {
	/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
	 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных. 
	 * 
	 * Create class Test1 with two variables. Add a display method and methods for modifying these variables. 
	 * Add a method that finds the sum of the values of these variables, and a method that finds the largest value of these two variables.
	 */
	private int var1;
	
	private int var2;
	
	public void setVar1 (int tempVar1) {
		var1 = tempVar1;
	}
	
	public void setVar2 (int tempVar2) {
		var2 = tempVar2;
	}

	public void printVar () {
		System.out.println("var1: " + var1 );
		System.out.println("var2: " + var2 );
	}
	
	public int sumVar () {
		
		return var1 + var2;
		
	}
	
	public int maxVar () {
		
		return Math.max(var1, var2);
		
	}
}
