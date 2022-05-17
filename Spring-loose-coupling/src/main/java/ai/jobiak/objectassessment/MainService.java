package ai.jobiak.objectassessment;
import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainService {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Airtel air=context.getBean("air",Airtel.class);
		air.calling();
		

	}

}
