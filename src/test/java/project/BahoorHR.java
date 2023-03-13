package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BahoorHR {

	
	public static void main(String[] args) throws AWTException {

		//WebDriverManager.chromedriver().setup();
		System.getProperty("webdriver.chrome.driver", "‪C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://urja.bamboohr.com/careers/51");
		//driver.findElement(By.xpath("//div[@class='jss-e20']//button")).click();
		driver.findElement(By.xpath("//div[@class='fab-CardContent fab-CardContent--customSpacing' and @style='padding: 32px 24px;']//button[1]//span[text()='Apply for This Job']")).click();
	
		driver.findElement(By.id("firstName")).sendKeys("Hemanadh");
		driver.findElement(By.id("lastName")).sendKeys("R");
		driver.findElement(By.id("email")).sendKeys("hemanadh@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9716888990");
		driver.findElement(By.id("streetAddress")).sendKeys("Bhimavaram");
		driver.findElement(By.id("city")).sendKeys("Bhimavaram");
		driver.findElement(By.id("state")).sendKeys("Andh");
		driver.findElement(By.id("zip")).sendKeys("564325");
		
		driver.findElement(By.className("fab-SelectToggle__toggleButton")).click();
		WebElement search = driver.findElement(By.xpath("//input[@class='fab-MenuSearch__input']"));
		search.sendKeys("Laos");
		driver.findElement(By.xpath("//div[text()='Laos']")).click();
		
		WebElement data = driver.findElement(By.id("dateAvailable"));
		//data.click();
		
		data.sendKeys("22112022");
		data.click();
		
		driver.findElement(By.id("desiredPay")).sendKeys("2000");
		
		driver.findElement(By.xpath("//label[text()='Cover Letter']//..//span[text()='Choose File']")).click();
		
		
		/*
		 * 1)copy the path
		 * 2)CTRL+V
		 * 3)Enter
		 */
		
	
		Robot rb = new Robot();
		rb.delay(1000);
		
		//put path to the file a cilpboard
		StringSelection ss = new StringSelection("C:\\Users\\PC\\Pictures\\Screenshots\\Screenshot (43).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL+V
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		
		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(1000);
		
		
		driver.findElement(By.xpath("//label[text()='Resume']//..//span[text()='Choose File']")).click();

		
		rb.delay(1000);
		
		//put path to the file a cilpboard
		StringSelection ss2 = new StringSelection("C:\\Users\\PC\\Pictures\\Screenshots\\Screenshot (42).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		
		//CTRL+V
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		
		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(1000);
		
		
		driver.close();
		//driver.findElement(By.xpath("//span[text()='Submit Application']"));
		
	
	}

}
