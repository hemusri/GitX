package TestNGPracties;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{

	public void onFinish(ITestContext result) 
	{					
		System.out.println("*******Test Completed :"+result.getName());
	}		

	public void onStart(ITestContext result)
	{					
		System.out.println("*******Test Satrted :"+result.getName());
	}		

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{	
		System.out.println("*******Test Faild With SueecessPrecent :"+result.getName());
	}		

	public void onTestFailure(ITestResult result) 
	{					
		System.out.println("*********Test Failure :"+result.getName());
	}		

	public void onTestSkipped(ITestResult result) 
	{					
		System.out.println("*******Test Skipped :"+result.getName());
	}		

	public void onTestStart(ITestResult result)
	{					

	}		

	public void onTestSuccess(ITestResult result) {					

	}		

}
