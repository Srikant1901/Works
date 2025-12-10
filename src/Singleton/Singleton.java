package Singleton;

public class Singleton {
	
	private static final Singleton instance = new Singleton();
//	int id;
//	String name;
	
//	public Singleton() {
//		this.id = 1;
//		this.name = "Srikant";
//	}
//	
//	public Singleton(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		if(instance!=null) {
			return instance;
		}
		return new Singleton();
	}
	

}
