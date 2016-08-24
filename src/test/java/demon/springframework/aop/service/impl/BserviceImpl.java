package demon.springframework.aop.service.impl;

public class BserviceImpl {
	
	public void fooB(String _msg, int _type) {
		System.out.println("BServiceImpl.fooB(msg:" + _msg + " type:" + _type
				+ ")");
		if (_type == 1)
			throw new IllegalArgumentException("测试异常");
	}

	public void barB() {
		System.out.println("BServiceImpl.barB()");
	}
}
