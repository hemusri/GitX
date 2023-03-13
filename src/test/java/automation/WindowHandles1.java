package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles1 {

	public static void main(String[] args) throws Throwable
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window "+parentwindow+driver.getTitle());
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		
		Set<String> windowshandles = driver.getWindowHandles();
		
		for(String windowhandle:windowshandles)
		{
			if(!windowhandle.equals(parentwindow))
			{
				driver.switchTo().window(windowhandle);
				String ele=driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();	
				System.out.println("Element "+ele);
				Thread.sleep(2000);
				//driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hemanadh");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
