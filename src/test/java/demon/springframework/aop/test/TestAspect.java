package demon.springframework.aop.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {

	//joinPoint 是用来做什么的
	public void doAfter(JoinPoint jp) {
		System.out.println("log Ending method: "
				+ jp.getTarget().getClass().getName() + "."
				+ jp.getSignature().getName());
	}

	//方法执行延时到了doAround中去完成,体现了joinPoint的作用
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long time = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		time = System.currentTimeMillis() - time;
		System.out.println("process time: " + time + " ms");
		return retVal;
	}

	public void doBefore(JoinPoint jp) {
		System.out.println("log Begining method: "
				+ jp.getTarget().getClass().getName() + "."
				+ jp.getSignature().getName());
	}

	public void doThrowing(JoinPoint jp, Throwable ex) {
		System.out.println("method " + jp.getTarget().getClass().getName()
				+ "." + jp.getSignature().getName() + " throw exception");
		System.out.println(ex.getMessage());
	}

}
