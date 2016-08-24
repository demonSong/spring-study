package demon.test.service;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMITest {
	
	@Test
	public void testRmi() {
		try {
			ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
			HelloWorldService helloWorldService=(HelloWorldService) applicationContext.getBean("rmiHelloWorldService");
			helloWorldService.sayHello("888");
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testHessian() {
		try {
			ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
			HelloWorldService helloWorldService=(HelloWorldService) applicationContext.getBean("hessianHelloWorldService");
			helloWorldService.sayHello("hessian");
			helloWorldService.speak(new Person("hessian", 20));
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
