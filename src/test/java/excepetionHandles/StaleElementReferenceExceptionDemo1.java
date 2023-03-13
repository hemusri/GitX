package excepetionHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceExceptionDemo1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Hemanadh");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("xyz");
		
		driver.navigate().refresh();
		
		try
		{
		username.sendKeys("Hemanadh");
		}
		catch (Exception e)
		{
			username = driver.findElement(By.name("username"));
			username.sendKeys("Hemanadh");
		}


	}

}
