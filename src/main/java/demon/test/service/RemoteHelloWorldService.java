package demon.test.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteHelloWorldService extends Remote{
	
	void sayHello(String name) throws RemoteException;
	
}
