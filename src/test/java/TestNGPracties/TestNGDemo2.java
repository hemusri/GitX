package TestNGPracties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import config.PropertiesFile2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo2 {

	WebDriver driver = null;
	public static String browserName =  null;
	
	
	@BeforeTest
	public void funA() throws Throwable
	{
		//System.getProperty("webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		
		PropertiesFile2.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}
	
	@Test
	public void googleSearch2() throws Throwable
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
	
	public void googleSearch3() throws Throwable
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
	public void tearDown() throws Throwable
	{
		driver.close();
		System.out.println("Test Completed Successfully");
		PropertiesFile2.setProperties();
	}
}
