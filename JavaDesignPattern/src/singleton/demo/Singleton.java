package singleton.demo;

// Double-Checked Locking

public class Singleton {

	private static Singleton instance;
	
	private Singleton(){}
	
	public synchronized static Singleton getInstance()
	{
		if(instance == null)
		{
			synchronized (Singleton.class) 
			{
				if(instance == null)
				{
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
