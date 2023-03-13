package TestNGPracties;

import org.testng.annotations.Test;


@Test(groups="AllClassTests")
public class TestNGGroupsDemo
{
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("This is the Test1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("This is the Test2");
	}
	
	@Test(groups = {"sanity","regerssion"})
	public void test3()
	{
		System.out.println("This is the Test3");
	}
	
	@Test(groups = {"sanity","regerssion","smoke"})
	public void test4()
	{
		System.out.println("This is the Test4");
	}
	
	@Test
	public void test5()
	{
		System.out.println("This is the Test5");
	}
	
	@Test(groups = {"windows.regerssion"})
	public void test6()
	{
		System.out.println("This is the Test6");
	}
	
	
	@Test(groups = {"linux.regerssion"})
	public void test7()
	{
		System.out.println("This is the Test7");
	}

}
