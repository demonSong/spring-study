package demon.springframework.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demon.springframework.aop.service.Aservice;

public class AOPTest {

	@Test
	public void testAop(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		Aservice service =(Aservice) applicationContext.getBean("aService");
		service.barA();
		service.fooA("demon AOP");
	}
}
