package automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {

//	public void clickCheckBoxes()
//	{
//		List<Integer> multivalues = Arrays.asList(3,5,7,8,30,28,38,45,56,67,87,6,97);
//		clickCheckBoxes1(multivalues);
//	}
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://www.bigbasket.com/");

//		driver.findElement(By.xpath("(//button[@type='button' and @qa='add'])[1]")).click();
//		Thread.sleep(6000);
//		driver.navigate().refresh();
		driver.findElement(By.xpath("(//button[@type='button' and @qa='add'])[2]")).click();
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//button[@type='button' and @qa='add'])[3]")).click();
	
	
		
		
	}

}
