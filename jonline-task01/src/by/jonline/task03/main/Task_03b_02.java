package by.jonline.task03.main;
import java.util.regex.Pattern;

public class Task_03b_02 {

	public static void main(String[] args) {
		/*
		 * ������ � ����������� ����������� (Pattern, Matcher)
		 *
		 * ���� ������, ���������� ��������� ����� (xml-��������):
		 * <notes>
			 <note id = "1">
			 	<to>����</to>
			 	<from>�����</from>
			 	<heading>�����������</heading>
			 	<body>������� ��� ������!</body>
			 </note>
			 <note id = "2">
			 	<to>����</to>
			 	<from>����</from>
			 	<heading>������ �����������</heading>
			 	<body/>
			 </note>
			</notes>
			�������� ����������, ����������� ��������������� ���������� ���������� ����� xml-��������� � ��� ��� 
			(����������� ���, ����������� ���, ���������� ����, ��� ��� ����). 
			������������ �������� ��������� XML ��� ������� ������ ������ ������.
		 */
		
		String someWord  = "<notes>"
				+ "<note id = \"1\">"
				+ "<to>����</to>"
				+ "<from>�����</from>"
				+ "<heading>�����������</heading>"
				+ "<body>������� ��� ������!</body>"
				+ "</note>"
				+ "<note id = \"2\">"
				+ "<to>����</to>"
				+ "<from>����</from>"
				+ "<heading>������ �����������</heading>"
				+ "<body/>"
				+ "</note>"
				+ "</notes>";
		
		System.out.println(someWord);
		System.out.println("");
		
		String regex = "<(?:\"[^\"]*\"['\"]*|'[^']*'['\"]*|[^'\">])+>";
						
		Pattern patternWord = Pattern.compile(regex);
		
		String s[] = patternWord.split(someWord);
		
		for(int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);
			
		}
		
	
	}
}