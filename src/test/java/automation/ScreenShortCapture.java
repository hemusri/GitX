package automation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShortCapture {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		//Full page screenshot

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".//ScreenShort//homepage.png");
		FileUtils.copyFile(src, trg);




		//Screenshort of the Section/portion of the page

		/*		WebElement section = driver.findElement(By.xpath("//div[contains(@class,'product-grid home-page-produ')]"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File(".//ScreenShort//homepage.png");
        FileUtils.copyFile(src, trg);
		 */

		//Screenshort of section/portion of the page
//
//		WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		File src1 = ele.getScreenshotAs(OutputType.FILE);
//		File trg1 = new File(".//ScreenShort//log.png");
//		FileUtils.copyFile(src1, trg1);
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Search']"));
		File src2 = ele1.getScreenshotAs(OutputType.FILE);
		File trg2 = new File(".//test-output//search.png");
		FileUtils.copyFile(src2, trg2);

		driver.close();

	}

}
