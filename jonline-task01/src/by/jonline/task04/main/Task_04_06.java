package by.jonline.task04.main;



public class Task_04_06 {

	public static void main(String[] args) {
		/* Составьте описание класса для представления времени. 
		 * Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
		 * В случае недопустимых значений полей поле устанавливается в значение 0. 
		 * Создать методы изменения времени на заданное количество часов, минут и секунд.
		 * 
		 * Write a class description to clock. 
		 * Provide the possibility of setting the time and changing its individual fields (hour, minute, second) with checking the validity of the entered values. 
		 * In case of invalid field values, the field is set to 0. 
		 * Create methods for changing the time by the specified number of hours, minutes and seconds.
		 */
		
		Task_04_06_Clock clock = new Task_04_06_Clock();
			
		System.out.println(clock.getCurrentTime());
		
		System.out.println("");
		System.out.println("Setting time to 20:07:25");
		clock.setHour(20);
		clock.setMinute(07);
		clock.setSecond(25);
		System.out.println(clock.getCurrentTime());
		
		
		System.out.println("");
		System.out.println("Adding 25 hours...");
		clock.increaseHour(25);
		System.out.println(clock.getCurrentTime());
		
		System.out.println("");
		System.out.println("Subtracting 35 hours...");
		clock.increaseHour(-35);
		System.out.println(clock.getCurrentTime());
		
		System.out.println("");
		System.out.println("Adding 70 minutes...");
		clock.increaseMinute(70);
		System.out.println(clock.getCurrentTime());
		
		System.out.println("");
		System.out.println("Subtracting 1450 minutes...");
		clock.increaseMinute(-1450);
		System.out.println(clock.getCurrentTime());

		System.out.println("");
		System.out.println("Adding 650 seconds...");
		clock.increaseSecond(650);
		System.out.println(clock.getCurrentTime());
		
		System.out.println("");
		System.out.println("Subtracting 3610 seconds...");
		clock.increaseSecond(-3610);
		System.out.println(clock.getCurrentTime());


		
		
	}
	
	
	

}
