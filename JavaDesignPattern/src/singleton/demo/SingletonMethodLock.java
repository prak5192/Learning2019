package singleton.demo;

// It is thread safe , but too expensive.
//  


public class SingletonMethodLock {
	private static SingletonMethodLock instance;
	
	private SingletonMethodLock(){}
	
	public synchronized static SingletonMethodLock getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton.class) 
			{
				if(instance == null)
				{
					instance = new SingletonMethodLock();
				}
			}
		}
		return instance;
	}
}
