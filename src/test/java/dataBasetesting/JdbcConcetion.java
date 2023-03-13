package dataBasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JdbcConcetion 
{
	
	public static void main(String[] args) throws SQLException 
	{
		//     jdbc:mysql://"+host":"+port+"/databasename";
		//     jdbc:mysql://"+localhost":"+3306+"/Qadbt";
		
		String host="localhost";
		String port="3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "root");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where Scenario='zevgdhyrd'");
		
		//rs.next();
		while(rs.next())
		{
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("password"));
			
			
//			System.out.println(rs.getString("username"));
//			System.out.println(rs.getString("password"));
			
		}
		
	}

}
