package utilpackage;

public class GenericMethodTest {
	
	public static void main(String[] args)
	{
		GenericMethods key = new GenericMethods();
		
		key.openBrowser("Edge");
		key.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		key.enterData("name", "username", "Admin");
	    key.enterData("xpath", "//input[@name='password']", "admin123");
		key.clickOnElement("xpath", "//button[text()=' Login ']");
	//	key.selectDropDown("xpath", locatorValue, data);
	}


}
