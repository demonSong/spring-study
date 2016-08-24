package demon.test.service;

public class HelloWorldServiceImpl implements HelloWorldService {  
	  
    public void sayHello(String name) {  
    	System.out.println("hello my name is : "+name);
    }

	@Override
	public void speak(Person person) {
		System.out.println(person);
	}  
  
} 
