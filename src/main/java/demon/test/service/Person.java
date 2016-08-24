package demon.test.service;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 3180860396362927094L;

	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name =name;
		this.age =age;
	}
	
	@Override
	public String toString() {
		return "Hello my name is:"+name+", and my age is:"+age; 
	}

}
