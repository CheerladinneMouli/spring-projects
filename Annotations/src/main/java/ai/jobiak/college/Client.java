package ai.jobiak.college;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegebean" , College.class);
		System.out.println("The college object is created by using Spring " + college);
		college.test();

	}

}
