package automation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket1 {

	
	@Test
	public void clickCheckBoxes()
	{
		List<Integer> multivalues = Arrays.asList(3,5,7,8,30,28,6);
		clickonelement(multivalues);
	}
	
	public void clickonelement(List<Integer> multivalues) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
		driver.get("https://www.bigbasket.com/");
		List<WebElement> addcart=driver.findElements(By.xpath("//button[@type='button' and @qa='add']"));
		
		int size = addcart.size();
		
		int noofvaluespassed = multivalues.size();
		
		System.out.println("total no of check boxes"+size);
		
		
		//using for loop
		for(int i=0; i<noofvaluespassed; i++)
		{
			driver.navigate().refresh();
		
			addcart.get(multivalues.get(i)-1).click();
		}
		
	}

}
