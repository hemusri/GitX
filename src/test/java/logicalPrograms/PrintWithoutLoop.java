package logicalPrograms;
public class PrintWithoutLoop 
{
	void fun(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			fun(a+1);
		}
		
		
	}

	public static void main(String[] args) 
	{
		PrintWithoutLoop p=new PrintWithoutLoop();
		 p.fun(1);

	}

}

