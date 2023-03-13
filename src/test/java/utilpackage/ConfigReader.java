package utilpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static Properties getProperyObject() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AutomationProject\\Configration\\config.properties");
		
		Properties pro = new Properties();
		pro.load(file);
		return pro;
		
	}
	
	public static String getUrl() throws IOException
	{
		return getProperyObject().getProperty("url");
	}

	public static String getUsername() throws IOException
	{
		return getProperyObject().getProperty("username");
	}
	
	public static String getPasword() throws IOException
	{
		return getProperyObject().getProperty("password");
	}
}
