package utilpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethods
{
	public static	WebDriver driver;
	public static	WebElement element;

	public void openBrowser(String browserName)

	{
		if(browserName.equals("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\Do Not Disturb\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Edge"))
		{
			//System.setProperty("webdriver.edge.driver", "D:\\Do Not Disturb\\edge\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

	}

	public void enterURL(String url)
	{

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}


	public void enterData(String locatorType ,String locatorValue,String data)
	{ 

		if(locatorType.equals("xpath"))
		{
			By locatorType1 = By.xpath(locatorValue); 
			element =driver.findElement(locatorType1);
			element.sendKeys(data);

		}
		else if(locatorType.equals("cssSelector"))
		{
			By locatorType1 = By.cssSelector(locatorValue); 
			element =driver.findElement(locatorType1);
			element.sendKeys(data);

		}
		else if(locatorType.equals("id"))
		{
			By locatorType1 = By.id(locatorValue); 
			element =driver.findElement(locatorType1);
			element.sendKeys(data);
		}
		else if(locatorType.equals("name"))
		{
			By locatorType1 = By.name(locatorValue); 
			element =driver.findElement(locatorType1);
			element.sendKeys(data);
		}
		else if(locatorType.equals("linkText"))
		{
			By locatorType1 = By.linkText(locatorValue); 
			element =driver.findElement(locatorType1);
			element.sendKeys(data);
		}
		else if(locatorType.equals("partialLinkText"))
		{
			By locatorType1 = By.partialLinkText(locatorValue); 
			element =driver.findElement(locatorType1);
			element.sendKeys(data);
		}
	}

	public void clickOnElement(String locatorType,String locatorValue)
	{



		if(locatorType.equals("xpath"))
		{
			By locatorType1 = By.xpath(locatorValue); 
			element =driver.findElement(locatorType1);
			element.click();

		}
		else if(locatorType.equals("cssSelector"))
		{
			By locatorType1 = By.cssSelector(locatorValue); 
			element =driver.findElement(locatorType1);
			element.click();

		}
		else if(locatorType.equals("id"))
		{
			By locatorType1 = By.id(locatorValue); 
			element =driver.findElement(locatorType1);
			element.click();
		}
		else if(locatorType.equals("name"))
		{
			By locatorType1 = By.name(locatorValue); 
			element =driver.findElement(locatorType1);
			element.click();
		}
		else if(locatorType.equals("linkText"))
		{
			By locatorType1 = By.linkText(locatorValue); 
			element =driver.findElement(locatorType1);
			element.click();
		}
		else if(locatorType.equals("partialLinkText"))
		{
			By locatorType1 = By.partialLinkText(locatorValue); 
			element =driver.findElement(locatorType1);
			element.click();
		}

	}

	public void select(String data)
	{
		Select select=new Select(element);

		String s=data;
		String sub = s.substring(0,3);
		String remainder = s.substring(3);
		if(sub.equals("TXT"))
		{
			select.selectByVisibleText(remainder);
		}
		else if(sub.equals("VAL"))
		{
			select.selectByValue(remainder);
		}
		else if(sub.equals("IND"))
		{
			int index=Integer.parseInt(remainder);
			select.selectByIndex(index);
		}

	}

	public void selectDropDown(String locatorType ,String locatorValue,String data)
	{




		if(locatorType.equals("xpath"))
		{
			By locatorType1 = By.xpath(locatorValue); 
			element =driver.findElement(locatorType1);

			select(data);

		}
		else if(locatorType.equals("cssSelector"))
		{
			By locatorType1 = By.cssSelector(locatorValue); 
			element =driver.findElement(locatorType1);
			select(data);

		}

		else if(locatorType.equals("id"))
		{
			By locatorType1 = By.id(locatorValue); 
			element =driver.findElement(locatorType1);
			select(data);

		}
		else if(locatorType.equals("name"))
		{
			By locatorType1 = By.name(locatorValue); 
			element =driver.findElement(locatorType1);
			select(data);

		}
		else if(locatorType.equals("linkText"))
		{
			By locatorType1 = By.linkText(locatorValue); 
			element =driver.findElement(locatorType1);
			select(data);

		}
		else if(locatorType.equals("partialLinkText"))
		{
			By locatorType1 = By.partialLinkText(locatorValue); 
			element =driver.findElement(locatorType1);
			select(data);

		}

	}

}
