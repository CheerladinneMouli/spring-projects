package ai.jobiak.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		Student student = new Student();
//		student.setStudentname("mouli");//its not a good approach
//	student.displayStudentInfo();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s=context.getBean("student",Student.class);
		s.displayStudentInfo();
		
		Student s1=context.getBean("student1",Student.class);
		s1.displayStudentInfo();
	}
}
