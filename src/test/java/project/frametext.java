package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frametext {
	
	public static void main(String[] args) throws Throwable {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/PC/Downloads/Iframe1.html");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	

	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	WebElement frametext1 = driver.findElement(By.xpath("//span[text()='Saturday, 3 January 2015']"));
	String framevalue1 = frametext1.getText();
	System.out.println(framevalue1);
	
//	driver.switchTo().defaultContent();
//	Thread.sleep(2000);
//	driver.switchTo().frame(0);
	
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	
	WebElement frametext = driver.findElement(By.xpath("//span[text()='Saturday, 31 January 2015']"));
	String framevalue = frametext.getText();
	System.out.println(framevalue);
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	Thread.sleep(2000);

	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(framevalue1);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(framevalue);
		
	}

}
