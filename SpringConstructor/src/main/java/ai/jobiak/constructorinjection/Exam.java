package ai.jobiak.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s=context.getBean("student",Student.class);
		s.displayStudentInfo();
		Student s1=context.getBean("std",Student.class);
		s1.displayStudentInfo();
	}
}
