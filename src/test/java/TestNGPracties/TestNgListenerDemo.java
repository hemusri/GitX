package TestNGPracties;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGPracties.TestNGListeners.class)
public class TestNgListenerDemo 
{
	@Test
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside Test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is Skipped ");
	}

}
