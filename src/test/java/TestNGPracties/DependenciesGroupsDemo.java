
package TestNGPracties;

import org.testng.annotations.Test;

public class DependenciesGroupsDemo 
{
	
	//@Test(dependsOnGroups = {"sanity1"})
	@Test(dependsOnGroups = {"sanity.*"})
	public void test1()
	{
		System.out.println("I am in inside the Test1");
	}
	
	@Test(groups="sanity1")
	public void test2()
	{
		System.out.println("I am in inside the Test2");
	}
	
	@Test(groups="sanity2")
	public void test3()
	{
		System.out.println("I am in inside the Test3");
	}

}
