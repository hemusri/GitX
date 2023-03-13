package automation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket2 {
	
	public static void main(String[] args) throws InterruptedException 
	{
//		String ProjectPath = System.getProperty("user.dir");
//		System.out.println(ProjectPath);
//
//		//	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",ProjectPath+"\\webDrivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		String[] itemsNeeded= {"Capsicum","Cauliflower","Carrot"};
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.close();

	}

	public static  void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;

		//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));  //tagname.attributevalue
		List<WebElement> products = driver.findElements(By.xpath("//div[@qa='product_name']"));

		for(int i=0;i<products.size();i++)
		{
			//Brocolli - 1 Kg
			//Brocolli,    1 kg
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();

			//format it to get actual vegetable name
			//convert array into array list for easy search
			//  check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//click on Add to cart
				driver.findElements(By.xpath("//button[@qa='add']")).get(i).click();

				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}

}
