package demon.springframework.aop.service.impl;

import demon.springframework.aop.service.Aservice;

public class AserviceImpl implements Aservice {

	public void barA() {
		System.out.println("AServiceImpl.barA()");
	}

	public void fooA(String _msg) {
		System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
	}
}
