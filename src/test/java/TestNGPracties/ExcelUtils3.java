package TestNGPracties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils3 {


	static XSSFWorkbook workbook;
	static XSSFSheet sheet ;

	public ExcelUtils3(String excelPath,String sheetName)
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
		//		getCellDataString(0,0);
		//		getCellDataNumber(1,1);
	}


	public static int getRowCount()
	{
		int rowcount=0;
		try
		{
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No Of count "+rowcount);
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
		return rowcount;
	}


	public static int getColCount()
	{
		int colcount =0;
		try
		{
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No Of count "+colcount);
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
		return colcount;
	}


	public static String getCellDataString(int rowNum,int colNum)
	{
		String celldate = null;
		try {
			celldate = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldate);  //username
		}
		catch (Exception exe)
		{
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}
		return celldate;
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
