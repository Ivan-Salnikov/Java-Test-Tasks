package by.jonline.task04.main;

public class Task_04_01 {

	public static void main(String[] args) {
		/* �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ���� ����������. 
		 * �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� ������� ���������� �������� �� ���� ���� ����������. 
		 * 
		 * Create class Test1 with two variables. Add a display method and methods for modifying these variables. 
		 * Add a method that finds the sum of the values of these variables, and a method that finds the largest value of these two variables.
		 */
		
		Test1 test = new Test1();
		
		test.setVar1(25);
		
		test.setVar2(68);
		
		test.printVar();
		
		System.out.println("Sum of the variables: " + test.sumVar() );
		
		System.out.println("Maximum of the variables: " + test.maxVar() );

	}

}
