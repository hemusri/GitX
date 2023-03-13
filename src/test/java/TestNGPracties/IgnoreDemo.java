
package TestNGPracties;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



//@Ignore
public class IgnoreDemo 
{
	@Test
	@Ignore
	public void test1()
	{
		System.out.println(" I am inside Test 1");
	}

	@Test(enabled=false)
	
	public void test2()
	{
		System.out.println(" I am inside Test 2");
	}

}
