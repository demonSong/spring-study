package demon.springframework.aop.service.impl;

import demon.springframework.aop.service.Aservice;

public class AserviceImpl implements Aservice {

	public String barA() {
		System.out.println("AServiceImpl.barA()");
		return "barA 返回参数";
	}

	public void fooA(String _msg) {
		System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
	}
}
