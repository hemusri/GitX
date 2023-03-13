package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practies {
	
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert art = driver.switchTo().alert();
		art.sendKeys("welcome");
		art.accept();
		
		
	}

}
