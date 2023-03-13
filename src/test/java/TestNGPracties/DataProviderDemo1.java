package TestNGPracties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 
{

	@Test(dataProvider ="setData")
	public void funA(int a)
	{
		System.out.println("funA of DataProviderDemo1");
		System.out.println(a);
	}

	@DataProvider
	public Object [][]setData()
	{
		Object[][]o1= new Object[3][1];

		o1[0][0]=10;
		o1[1][0]=20;
		o1[2][0]=30;

		return o1;
	}
	
	@Test(dataProvider = "setData1")
	public void funB(int a,int b)
	{
		System.out.println("funA of DataProviderDemo1");
		System.out.println(a);
		System.out.println(b);
	}

	@DataProvider
	public Object [][] setData1()
	{
		Object[][]o2 = new Object[3][2];

		o2[0][0] =10;
		o2[1][0] =20;
		o2[2][0] =30;
		
		o2[0][1] =40;
		o2[1][1] =50;
		o2[2][1] =60;
		
		return o2;
	
	
	}
}
