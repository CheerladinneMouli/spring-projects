package ai.jobiak.objectpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bank {

	public static void main(String[] args) {
		/*Child ch = new Child();
		Family fm = new Family();
		ch.setIncome(fm);*/
		//ch.expenditure();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Child child = context.getBean("ch",Child.class);
		child.expenditure();
		

	}

}
