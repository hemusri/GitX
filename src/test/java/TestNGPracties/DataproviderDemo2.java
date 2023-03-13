package TestNGPracties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderDemo2 
{
	@Test(dataProvider = "setdate")
	public void funA(String a,String b)
	{

		//System.setProperty("webdriver.chrome.driver", "C:\\\\Seleniumproject\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//		 WebElement loginusername =driver.findElement(By.xpath("//input[@name='txtUsername']"));
		//		 WebElement loginpassword =driver.findElement(By.xpath("//input[@name='txtPassword']"));	

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(b); 
		driver.findElement(By.xpath("//input[@name='Submit']")).click();	
	}

	@DataProvider
	public Object[][]setdate()
	{
		Object[][]o1= new Object[3][2];

		o1[0][0] = "Admin";
		o1[0][1] = "admin123";
		o1[1][0] = "admin";
		o1[1][1] = "adm123";
		o1[2][0] = "adm";
		o1[2][1] = "admin126";

		return o1;
	}



}
