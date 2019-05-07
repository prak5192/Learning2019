package singleton.demo;

// Block level locking , but not thread safe.
// In some cases tow threads can create two innstance.

public class SingletonBlockLock {
	private static SingletonBlockLock instance;
	
	private SingletonBlockLock(){}
	
	public synchronized static SingletonBlockLock getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton.class) 
			{
				if(instance == null)
				{
					instance = new SingletonBlockLock();
				}
			}
		}
		return instance;
	}
}
