package automation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilpackage.ConfigReader;

public class LoginTestPropertiesFile
{
	
	@Test
	public void myLoginTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(ConfigReader.getUrl());
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ConfigReader.getUsername());
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigReader.getPasword());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	

}
