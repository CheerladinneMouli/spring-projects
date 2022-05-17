package ai.jobiak.usesource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ai.jobiak.ifaces.BDigital;
import ai.jobiak.source.A;

public class TestAB {

	public static void main(String[] args) {
		//B b = new B();
		//b.publishing();//throws nullpointer Exceptionqa					````````````````																							`
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
//		B b = (B)factory.getBean("b");
//		b.publishing();
//		if(factory.containsBean("aObj")) {
//		A a = (A)factory.getBean("aObj");
//		a.print();
//	}
		BDigital bDigital=(BDigital)factory.getBean("bDigital");
	}
}
