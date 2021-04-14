package by.jonline.task04.main;

public class Task_04_05_Counter {
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
	
	private int minValue = 0;
	
	private int maxValue = 100;
	
	private int currentValue = 0;
	
	Task_04_05_Counter (int min, int max, int current) {
		
		minValue = min;
		
		maxValue = max;
		
		currentValue = current;
		
		
	}
	
	
	public void setRandomValue () {
		
		currentValue =  minValue + (int) (Math.random() *  (maxValue - minValue));
	}
	
	
	public int getCurrentValue () {
		
		return currentValue;
	}
	
	public int getMinValue () {
		
		return minValue;
	}
	
	public int getMaxValue () {
		
		return maxValue;
	}
	
	public void increase () {
		
		if (currentValue == maxValue) {
			
			throw new ArrayIndexOutOfBoundsException(currentValue + 1);
			
		} else {
		
			currentValue++;
		}
		
	}
	
	
	public void decrease () {
		
		if (currentValue == minValue) {
			
			throw new ArrayIndexOutOfBoundsException(currentValue - 1);
			
		} else {
		
			currentValue--;
		}
		
	}
	
	
	
}
