package logicalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScrollDown 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
		j.executeScript("arguments[0].value='naresh'", userName);
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		j.executeScript("arguments[0].value='1234'",password );
		
		//j.executeScript("alert('welcome to selenium')");
		
		//scroll down a page using JavaScript
		//((JavascriptExecutor) driver).executeScript(�window.scrollBy(0,500�);
		//js.executeScript("window.scrollBy(0,1000)");
		
		
		//j.executeScript("window.scrollBy(120,250)","");
		
		WebElement forgottenpassword=driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
	    j.executeScript("arguments[0].click()",forgottenpassword);
	    
	    WebElement title=driver.findElement(By.xpath("//input[@id='identify_email']"));
		j.executeScript("arguments[0].scrollIntoView()", title);
		System.out.println(title.getText());

	}

}
