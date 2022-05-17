package ai.jobiak.qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ai.jobiak.object.Student;
public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Student student=context.getBean("student",Student.class);
		student.cheating();
	}

}
