package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class ActionVSActions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement feature = driver.findElement(By.xpath("//a[@title='Women']"));
		//Action a = new Action();
		
		
		Actions act = new Actions(driver);
		act.moveToElement(feature).perform();
		//act.moveToElement(feature).build().perform();

	}

}
