package by.jonline.task04.main;



public class Task_04_05 {

	public static void main(String[] args) {
		/* ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне. 
		 * ѕредусмотрите инициализацию счетчика значени€ми по умолчанию и произвольными значени€ми. 
		 * —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод позвол€ющее получить его текущее состо€ние. 
		 * Ќаписать код, демонстрирующий все возможности класса.
		 * 
		 * Describe a class that implements a decimal counter that can increment or decrement its value by one within a specified range. 
		 * Consider initializing the counter with default values and arbitrary values. 
		 * The counter has methods for increasing and decreasing state, and a method for getting its current state. 
		 * Write code that demonstrates all the capabilities of the class.
		 */
		
		Task_04_05_Counter counterOne = new Task_04_05_Counter(0, 20, 2);
		
		Task_04_05_Counter counterTwo = new Task_04_05_Counter(4, 50, 5);
		
		Task_04_05_Counter counterThree = new Task_04_05_Counter(10, 70, 14);
		
		System.out.println("Counter one, min value " + counterOne.getMinValue()  + ", max value " + counterOne.getMaxValue() + ", current = " + counterOne.getCurrentValue());
		System.out.println("Counter two, min value " + counterTwo.getMinValue()  + ", max value " + counterTwo.getMaxValue() + ", current = " + counterTwo.getCurrentValue());
		System.out.println("Counter three, min value " + counterThree.getMinValue()  + ", max value " + counterThree.getMaxValue() + ", current = " + counterThree.getCurrentValue());
		
		
		System.out.println("");
		System.out.println("Increasing all of counters ten times");
		
		for (int i = 0; i < 10; i++) {
			
			counterOne.increase();
			counterTwo.increase();
			counterThree.increase();
			
		}
		System.out.println("Counter one, current = " + counterOne.getCurrentValue());
		System.out.println("Counter two, current = " + counterTwo.getCurrentValue());
		System.out.println("Counter three, current = " + counterThree.getCurrentValue());
		
		
		
		System.out.println("");
		System.out.println("Decreasing all of counters five times");
		
		for (int i = 0; i < 5; i++) {
			
			counterOne.decrease();
			counterTwo.decrease();
			counterThree.decrease();
			
		}
		System.out.println("Counter one, current = " + counterOne.getCurrentValue());
		System.out.println("Counter two, current = " + counterTwo.getCurrentValue());
		System.out.println("Counter three, current = " + counterThree.getCurrentValue());
		
		
		
		System.out.println("");
		System.out.println("Changing all of counters to random in specified range");
							
		counterOne.setRandomValue();	
		counterTwo.setRandomValue();
		counterThree.setRandomValue();		
		
		System.out.println("Counter one, current = " + counterOne.getCurrentValue());
		System.out.println("Counter two, current = " + counterTwo.getCurrentValue());
		System.out.println("Counter three, current = " + counterThree.getCurrentValue());
		

		
	}
	
	
	

}
