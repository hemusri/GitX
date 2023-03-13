package TestNGPracties;

public class ExcelDataProvider 
{
	
	public static void main(String[] args) 
	{
		String excelPath = "C:\\Users\\PC\\eclipse-workspace\\AutomationProject\\excel\\data.xlsx";
		testData(excelPath,"Sheet1");
	}
	
	public static void testData(String excelPath,String sheetName)
	{
		ExcelUtils3 excel = new ExcelUtils3(excelPath, sheetName);
		
		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();
	
		for(int i=1; i<rowcount; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				String celldata = excel.getCellDataString(i, j);
				System.out.println(celldata);
			}
		}
		
	}



}
