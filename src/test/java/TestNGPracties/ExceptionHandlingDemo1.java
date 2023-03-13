package TestNGPracties;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
		try
		{
			demo();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static void demo()throws Exception
	{

			System.out.println("Hello World....!");
			
			throw new ArithmeticException("Not valid opertion");
			
//			int i =1/0;
//			
//			System.out.println("Completed");
	}

}
