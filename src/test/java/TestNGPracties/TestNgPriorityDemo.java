package TestNGPracties;

import org.testng.annotations.Test;


public class TestNgPriorityDemo 
{
	
	
	@Test(priority = 1)
	public void one()
	{
		System.out.println("I am inside The Test1");		
	}
	
	
	@Test(priority = -1)
	public void two()
	{
		System.out.println("I am inside The Test2");	
	}
	
	
	@Test(priority = -2)
	public void three()
	{
		System.out.println("I am inside The Test3");	
	}
	
	@Test
	public void four()
	{
		System.out.println("I am inside The Test4");	
	}
}
