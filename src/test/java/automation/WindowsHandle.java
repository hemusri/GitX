package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//single window
		
		String partentwindow = driver.getWindowHandle();
		System.out.println("ParentWindow"+partentwindow+driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for(String windowHandle:windowhandles)
		{
			if(!windowHandle.equals(partentwindow))
			{
				driver.switchTo().window(windowHandle);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Hemanadh");	
				Thread.sleep(2000);
				driver.close();
				
			}
		
			//System.out.println(windowHandle+driver.getTitle());
			
		}
		
		driver.switchTo().window(partentwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hemanadh");
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
