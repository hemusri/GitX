package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMANADH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		WebElement desktopmenu = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement macmenu= driver.findElement(By.xpath("//a[text()='Mac (1)']"));

		Actions act = new Actions(driver);
		act.moveToElement(desktopmenu).moveToElement(macmenu).click().perform();


	}

}
