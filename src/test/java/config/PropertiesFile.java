package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath= System.getProperty("user.dir");
	
	public static void main(String[] args) throws Throwable
	{

		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() throws Throwable
	{
		try {	
			
			InputStream input = new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
		}
		
	}
	public static void setProperties() throws Throwable
	{
		try
		{
			
		OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		
		prop.setProperty("browser", "chrome");
		
		prop.store(output, null);
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
	}

	
	
}
