package by.jonline.task02.main;


public class Task_02c_17 {

	
	public static void main(String[] args) {
		/*
		 * The sum of its digits was subtracted from the given number. 
		 * The sum of its digits was again subtracted from the result, etc. 
		 * How many such actions must be performed to get zero? 
		 * To solve the problem, use decomposition.
		 * 
		 *  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
		 *  Сколько таких действий надо произвести, чтобы получился нуль? 
		 *  Для решения задачи использовать декомпозицию.
		 */
	
		int n =  (int)(Math.random() *  (200)); 
				
		System.out.println("n = " + n);
		
		System.out.println("Quantity of actions is " + quantityActions(n));
						

	}
	
	
	public static int quantityActions (int keyNumber) {
		
		int quantAct = 1;
		
		while (keyNumber > 0) {
			int sumD = sumDigit(keyNumber);
			keyNumber = keyNumber - sumD;
			
			quantAct++;
		}
		
		return quantAct;
	}
	
	
		
	public static int sumDigit (int keyNumber) {
		
		int sum = 0;
		
				
		while(keyNumber != 0){   
		        
				sum = sum + (keyNumber % 10);
				keyNumber = keyNumber / 10;
		}
		
		return sum;
		
	}
	
	
}


