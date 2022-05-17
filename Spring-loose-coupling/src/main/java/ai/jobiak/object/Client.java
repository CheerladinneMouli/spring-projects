package ai.jobiak.object;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*
		 * Student student = new Student(); <
		 * MathCheat cheat = new MathCheat();
		 * student.setMathcheat(cheat); student.Cheating();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu=context.getBean("stu",Student.class);
		stu.cheating();
		

	}

}
