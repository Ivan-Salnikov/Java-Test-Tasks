package by.jonline.task03.main;
import java.util.regex.Pattern;

public class Task_03b_02 {

	public static void main(String[] args) {
		/*
		 * Работа с регулярными выражениями (Pattern, Matcher)
		 *
		 * Дана строка, содержащая следующий текст (xml-документ):
		 * <notes>
			 <note id = "1">
			 	<to>Вася</to>
			 	<from>Света</from>
			 	<heading>Напоминание</heading>
			 	<body>Позвони мне завтра!</body>
			 </note>
			 <note id = "2">
			 	<to>Петя</to>
			 	<from>Маша</from>
			 	<heading>Важное напоминание</heading>
			 	<body/>
			 </note>
			</notes>
			Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип 
			(открывающий тег, закрывающий тег, содержимое тега, тег без тела). 
			Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
		 */
		
		String someWord  = "<notes>"
				+ "<note id = \"1\">"
				+ "<to>Вася</to>"
				+ "<from>Света</from>"
				+ "<heading>Напоминание</heading>"
				+ "<body>Позвони мне завтра!</body>"
				+ "</note>"
				+ "<note id = \"2\">"
				+ "<to>Петя</to>"
				+ "<from>Маша</from>"
				+ "<heading>Важное напоминание</heading>"
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