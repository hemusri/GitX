package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement google=driver.findElement(By.xpath("//input[@name='q']"));
		google.sendKeys("Gmail");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		google.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("(//input[@aria-label='Google Search' and@name='btnK'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create a Gmail account")).click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent win:"+parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create an account ']")).click();
		//driver.switchTo().window(child);
		
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
			if(!window.equals(parent))
			{
			driver.switchTo().window(window);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Hemanadh");
			}
			
		}
			
		
		
		
		
		
	}

}
