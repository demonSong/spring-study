package demon.springframework.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demon.springframework.aop.service.Aservice;
import demon.springframework.aop.service.impl.BserviceImpl;

public class AOPTest {

	@Test
	public void testJDKAop(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		Aservice aService =(Aservice) applicationContext.getBean("aService");
		aService.barA();
		aService.fooA("demon AOP");
	}
	
	@Test
	public void testCglibAop(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
		BserviceImpl bService =(BserviceImpl) applicationContext.getBean("bService");
		bService.barB();
		bService.fooB("demon AOP",-2);
	}
}
