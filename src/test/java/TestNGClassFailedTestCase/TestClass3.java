package TestNGClassFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3
{
	@Test
	public void testWordpress()
	{
		Assert.assertTrue(false);
		System.out.println("testWordpress is working as expated");
	}
}
