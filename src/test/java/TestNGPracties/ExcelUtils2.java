package TestNGPracties;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils2 {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;

	public ExcelUtils2(String excelPath,String sheetName)
	{
		try 
		{
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static void getRowCount()
	{
		try
		{
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No Of count "+rowcount);
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
	}

	public static void getCellDataString(int rowNum,int colNum)
	{
		try {
			String celldate = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldate);  //username
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
	}

	public static void getCellDataNumber(int rowNum,int colNum)
	{
		try {
			double celldate = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldate);  //username
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
	}
}
