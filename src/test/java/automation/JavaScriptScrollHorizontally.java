package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScrollHorizontally {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;


		driver.get(" Website URL ");

		WebElement Element = driver.findElement(By.linkText("Auto Testing"));

		//This will scroll the page Horizontally till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

}
