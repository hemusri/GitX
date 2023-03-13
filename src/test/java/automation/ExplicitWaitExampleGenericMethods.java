package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExampleGenericMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();


		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		By ellocator = By.xpath("//h3[text()='Selenium']");
		
		WaitForElementPresent(driver, ellocator, 10).click();

	}

	public static WebElement WaitForElementPresent(WebDriver driver,By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		return driver.findElement(locator);

	}

}
