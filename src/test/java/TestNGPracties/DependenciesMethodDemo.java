package TestNGPracties;

import org.testng.annotations.Test;

public class DependenciesMethodDemo 
{

	@Test(dependsOnMethods = {"test2","test3"})
	public void test1()
	{
		System.out.println("I am in inside the Test1");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("I am in inside the Test2");
	}
	
	@Test()
	public void test3()
	{
		System.out.println("I am in inside the Test3");
	}

}
