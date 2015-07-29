
public class MySingleton {

	private MySingleton(){
		
	}
	
	private static  MySingleton instance;
	
	public static  MySingleton getInstance(){
		if(instance == null){
			instance = new MySingleton();
			}
		return instance;
	}

	public void print(){
		System.out.println("this is a Singleton method");
	}

	
	
	// ----- you can use next method when you use multithreading  -----//
	 /* 
	 private static  MySingleton instance;
	
	public static synchronized  MySingleton getInstance(){
		if(instance == null){
			instance = new MySingleton();
			}
		return instance;
	}

	public void print(){
		System.out.println("this is a Singleton method");
	}

	OR
	
	private static final MySingleton instance = new  MySingleton() ;
	
	public static MySingleton getInstance(){
		return instance;
	}

	public void print(){
		System.out.println("this is a Singleton method");
	}

	




	  */
}
