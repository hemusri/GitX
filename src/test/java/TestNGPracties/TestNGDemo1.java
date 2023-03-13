package TestNGPracties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo1 {

	WebDriver driver = null;
	@BeforeTest
	public void funA()
	{
		//System.getProperty("webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearch() throws Throwable
	{
		//google open
		driver.get("https://www.google.co.in/");

		//enter the text in search box
		driver.findElement(By.name("q")).sendKeys("automation");
		Thread.sleep(2000);
		//click on search button
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}
