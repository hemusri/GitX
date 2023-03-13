package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertMaghanaBus {

	public static void main(String[] args) throws Throwable 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.meghanabus.in/index.html");
		
		driver.findElement(By.xpath("//img[@title='click to close']")).click();
		
		driver.findElement(By.xpath("//a[text()='Manage Bookings']")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		Thread.sleep(2000);
		
		Alert ala = driver.switchTo().alert();
		
		ala.accept();
		
		String msg = driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(msg);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
