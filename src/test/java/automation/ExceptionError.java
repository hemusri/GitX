package automation;

public class ExceptionError {
	
	
	int x;
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		funA();		
		
	}
	
	static void funA()
	{
		System.out.println("FunA");
		funB();
	}
	
	static void funB()
	{
		System.out.println("FunB");
		funA();
		
	}
	

}
