package TestNGPracties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {

		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("ABCD");
		
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}

}
