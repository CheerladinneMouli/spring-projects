package ai.jobiak.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Grass {

	public static void main(String[] args) {
//		Milk m = new BuffaloMilk();
//		m.butterMilk();//its a lot of stuff so by using the springs we can get the implementation very easily
//		m.ghee();
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		System.out.println("ready to load");
		//BuffaloMilk buf=(BuffaloMilk)context.getBean("buffalo");//there is no need of always doing casting
		//buf.butterMilk();
		//buf.ghee();
//		CowMilk cm=context.getBean("cow",CowMilk.class);//here we have to change the source code if want to get another class implementation but the customer want the code without touching source code so we have to use interface here
//		cm.butterMilk();
//		cm.ghee();
		Milk m=context.getBean("milk",Milk.class);
		m.butterMilk();
		m.ghee();
		
	}

}
