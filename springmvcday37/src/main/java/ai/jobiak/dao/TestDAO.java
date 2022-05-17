package ai.jobiak.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDAO {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("jdbc-beans.xml");
		CustomerDAO dao=(CustomerDAO) context.getBean("custDAO");
		dao.insertRow(415,"mouli",4000);

	}

}