package by.jonline.task04.main;

public class Task_04_03_Student {
	/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
	 * Создайте массив из десяти элементов такого типа. 
	 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
	 * 
	 * Create a class named Student, containing the fields: last name and initials, group number, grade (an array of five elements). 
	 * Create an array of ten elements of this type. 
	 * Add the option to display the names and numbers of groups of students with grades of only 9 or 10.
	 */
	
	Task_04_03_Student (String name, String group, int grade[]) {
		
		nameStudent = name;
		
		numberGroup = group;
		
		gradeArray = grade.clone();
	}
	
		
	
	private String nameStudent;
	
	private String numberGroup;
	
	private int gradeArray [] = null;
	
	
	public String getStudentName (){
		
		return nameStudent;
		
	}
	
	public String getStudentGroup (){
		
		return numberGroup;
		
	}
	
	public String getGrades (){
		
		String grades = "";
		
		for (int i = 0; i < gradeArray.length; i++) {
			
			grades = grades + gradeArray[i] + ", ";
		}
		
		return grades;
		
	}
	
	
	public boolean isStudentGrade (int minGrade, int maxGrade){
		
		boolean isTrue = true;
		
		for (int i = 0; i < gradeArray.length; i ++) {
			
			if ((gradeArray[i] > maxGrade) || (gradeArray[i] < minGrade)) {
				
				isTrue = false;
				break;
				
			} 
				
		}
		
		return isTrue;
		
	}
	
}
