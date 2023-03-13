package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionsHandleDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.get("http://omayo.blogspot.com/");
		
		//NoSuchElementException
		//driver.findElement(By.xpath("//input[@value='Loginv']")).click();    ////input[@value='Login
		
		//NoSuchWindowException
		//driver.switchTo().window("abcd");
		
		//NoSuchframeException
		//driver.switchTo().frame("anch");
		
		//NoAlertPresentException
		//driver.switchTo().alert();
		
		//InvalidSelectorException
		//driver.findElement(By.xpath("///input[@value='Login']")).click();  "//input[@value='Login']"
		
		//ElementNotInteractableException
		//driver.findElement(By.id("hbutton")).click();   //hiddenbutton that time
		
		//NoSessionException
		driver.quit();
		driver.findElement(By.xpath("///input[@value='Login']")).click();

	}

}
