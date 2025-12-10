package Singleton;

public class Client {
	public static void main(String[] args) {
         
		Singleton s = Singleton.getInstance();
		
		System.out.println(s);
		
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s1);
		
		System.out.println(s.equals(s1));
		
	}

}

//Single thread---------------->
//Result
//Singleton.Singleton@4517d9a3
//Singleton.Singleton@4517d9a3
//true
