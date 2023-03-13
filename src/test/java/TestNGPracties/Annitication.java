package TestNGPracties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annitication 
{
	@Test
	public void test3()
	{
		System.out.println("test3 ");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 ");
	}
	
	@BeforeTest
	public void test5()
	{
		System.out.println("before test ");
	}
	
	@BeforeMethod
	public void test4()
	{
		System.out.println("before method ");
	}
	
	

}
