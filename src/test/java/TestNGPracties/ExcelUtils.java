package TestNGPracties;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;

	public static void main(String[] args) 
	{
		//getRowCount();
		getCellDataString();
		getCellDataNumber();
	}

	public static void getRowCount()
	{
		try
		{
			projectPath = System.getProperty("user.dir");
			workbook    = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			sheet       = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No Of Row count "+rowcount);
		}
		catch (IOException exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}

	}

	public static void getCellDataString()
	{
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String celldate = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("No Of Cell count"+celldate);  //username

		}
		catch (IOException exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
	}

	public static void getCellDataNumber()
	{
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double celldate = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(celldate);  //username
		}
		catch (IOException exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}

	}
}
