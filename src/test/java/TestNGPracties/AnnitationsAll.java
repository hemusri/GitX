
package TestNGPracties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnitationsAll 
{
	
	
	@BeforeSuite
	public void test1()
	{
		System.out.println("test 1 Before Suite will be execution");
	}

	@BeforeTest
	public void test2()
	{
		System.out.println("test 2 Before Test will be execution");
	}
	
	@BeforeClass
	public void test3()
	{
		System.out.println("test 3 Before Class will be execution");
	}

	@BeforeMethod
	public void test4()
	{
		System.out.println("test 4 Before Method will be execution");
	}
	
	@Test
	public void test5()
	{
		System.out.println("test 5 Test will be execution");
	}
	
	@AfterMethod
	public void test6()
	{
		System.out.println("test 6 After Method will be execution");
	}
	
	@AfterClass
	public void test7()
	{
		System.out.println("test 7 After Class will be execution");
	}
	
	@AfterTest
	public void test8()
	{
		System.out.println("test 8 After Test will be execution");
	}
	
	
	@AfterSuite
	public void test9()
	{
		System.out.println("test 9 After Suite will be execution");
	}
	
	
}
