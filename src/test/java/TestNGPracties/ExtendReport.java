package TestNGPracties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReport 
{
	ExtentReports extent;

	@BeforeTest
	public void config()
	{
		//Extenreports,ExtentSparkreporter

		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Result");
		report.config().setDocumentTitle("Test Result");

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester Name", "Hemanadh");


	}


	@Test
	public void intialDemo()
	{

		//extent.createTest("intialDemo");
		ExtentTest test = extent.createTest("intialDemo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Result do not match");
		//test.addScreenCaptureFromBase64String(s);
		extent.flush();


	}

}
