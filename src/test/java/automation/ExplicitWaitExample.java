package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(200));

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));

		element.click();

	}

}
