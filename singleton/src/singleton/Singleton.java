package singleton;

public class Singleton {
	public String str;
	public static Singleton getSingleInstance() {
		Singleton instance = new Singleton();
		return instance;
	}
	private Singleton()
	{
		
	}

}
