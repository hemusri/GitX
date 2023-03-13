package TestNGPracties;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailedManuallyDemo 
{
	@Test
	public void test1()
	{
		System.out.println("I am Inside Test1");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("I am Inside Test2");
	//	int i =1/0;
	}

	
	@Test(retryAnalyzer = TestNGPracties.RetryFailedAutomaticalyDemo.class)
	public void test3()
	{
		System.out.println("I am Inside Test3");
		Assert.assertTrue(false);
	}


}
