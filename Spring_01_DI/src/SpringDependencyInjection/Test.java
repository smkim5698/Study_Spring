package SpringDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		Programmer programmer = (Programmer) context.getBean("p");
		programmer.programming();
	}
}
