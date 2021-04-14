package by.jonline.task04.main;



public class Task_04_06_Clock {
	
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

	private int hour;
	
	private int minute;
	
	private int second;
	
	Task_04_06_Clock () {
		
		hour = 0;
	
		minute = 0;
	
		second = 0;
		
	}

	
	
	Task_04_06_Clock (int hh, int mm, int ss) {
		
		hour = hh;
		
		minute = mm;
		
		second = ss;
		
	}
	
	
	public void increaseHour (int incH) {
	
		if (incH >= 0) {
			
			hour = (hour + incH) % 24;
			
		} else {
			
			hour = (24 + (hour + incH) % 24) % 24;
		}
		
	}
	
	
	public void increaseMinute (int incM) {
		
		
		if (incM >=0) {	
		
			increaseHour((minute + incM) / 60);
			
			minute = (minute + incM) % 60;
			
		} else {
			
			increaseHour(-1 + (minute + incM) / 60);
			
			minute = (60 + (minute + incM) % 60) % 60;
		}
		
	}
	
	
	public void increaseSecond (int incS) {
		
		if (incS >=0) {	
		
			increaseMinute((second + incS) / 60);
			
			second = (second + incS) % 60;
			
		} else {
			
			increaseMinute(-1 + (second + incS) / 60);
			
			second = (60 + (second + incS) % 60) % 60;
		}
		
	}
	

	public void setHour (int hh) {
		
		if (hh <= 23 && hh >= 0 ) {
			
			hour = hh;
			
		} else {
			
			hour = 0;
		}
	}
	
	public void setMinute (int mm) {
		
		
		if (mm <= 59 && mm >= 0 ) {
			
			minute = mm;
			
		} else {
			
			minute = 0;
		}
	}
	
	
	public void setSecond (int ss) {
		
		if (ss <= 59 && ss >= 0 ) {
			
			second = ss;
			
		} else {
			
			second = 0;
		}	
	}
	
	
	public  String getCurrentTime () {
		
		String hh;
		String mm;
		String ss;
		
		if (hour < 10) {
			
			hh = "0" + hour;
		
		} else {

			hh = "" + hour;
		}
			
		if (minute < 10) {
			
			mm = "0" + minute;
		
		} else {

			mm = "" + minute;
		}
		
		
		if (second < 10) {
			
			ss = "0" + second;
		
		} else {

			ss = "" + second;
		}

		return "Current time: " + hh + ":" + mm + ":" + ss;
	}

	


}
