package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScroolDown {

	public static void main(String[] args) throws Throwable 
	{
		//System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe"); 
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
        

        //Locating element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));
        
        Thread.sleep(2000);
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        Thread.sleep(2000);
        
        WebElement ele=driver.findElement(By.xpath("//a[text()='Selenium WebDriver']"));
     // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", ele);
        
        
        
        
		
	}

}
