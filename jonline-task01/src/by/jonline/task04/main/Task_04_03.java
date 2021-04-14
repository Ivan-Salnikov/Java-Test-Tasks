package by.jonline.task04.main;

import java.util.stream.IntStream;

public class Task_04_03 {

	public static void main(String[] args) {
		/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
		 * Создайте массив из десяти элементов такого типа. 
		 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
		 * 
		 * Create a class named Student, containing the fields: last name and initials, group number, grade (an array of five elements). 
		 * Create an array of ten elements of this type. 
		 * Add the option to display the names and numbers of groups of students with grades of only 9 or 10.
		 */
		
		
		int quantityOfStudent = 10;
		
		Task_04_03_Student studentArray[] = new Task_04_03_Student [quantityOfStudent];
		
		
		
		studentArray[0] = new Task_04_03_Student("St1", "10.2", IntStream.of(8,9,9,10,5).toArray());
		
		studentArray[1] = new Task_04_03_Student("St2", "8.1", IntStream.of(8,9,9,10,9).toArray());
		
		studentArray[2] = new Task_04_03_Student("St3", "2.1", IntStream.of(8,9,6,10,9).toArray());
		
		studentArray[3] = new Task_04_03_Student("St4", "5.7", IntStream.of(8,9,9,10,9).toArray());
		
		studentArray[4] = new Task_04_03_Student("St5", "11.4", IntStream.of(7,9,9,10,9).toArray());
		
		studentArray[5] = new Task_04_03_Student("St6", "9.4", IntStream.of(9,9,10,10,9).toArray());
		
		studentArray[6] = new Task_04_03_Student("St7", "6.2", IntStream.of(7,9,5,10,9).toArray());
		
		studentArray[7] = new Task_04_03_Student("St8", "5.2", IntStream.of(10,9,9,10,9).toArray());
		
		studentArray[8] = new Task_04_03_Student("St9", "11.4", IntStream.of(7,9,6,10,9).toArray());
		
		studentArray[9] = new Task_04_03_Student("St10", "7.3", IntStream.of(10,10,9,10,10).toArray());
		
		
				
		for (int i = 0; i < studentArray.length; i++) {
			
			System.out.print("Name: " + studentArray[i].getStudentName());
			
			System.out.print(", Group: " + studentArray[i].getStudentGroup());
			
			System.out.println(", Grades: " + studentArray[i].getGrades());
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < studentArray.length; i++) {
			
			if (studentArray[i].isStudentGrade(9, 10)) {
				
				System.out.println("Student " + studentArray[i].getStudentName() + ", group " + studentArray[i].getStudentGroup() + " has a grade 9 and 10");	
			}
						
		}

		

	}

}
