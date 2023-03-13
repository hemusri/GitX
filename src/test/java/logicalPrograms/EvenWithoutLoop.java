package logicalPrograms;

public class EvenWithoutLoop 
{
	void funA(int a)
	{
		if(a<=30)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			funA(a+1);
		}
	}

	public static void main(String[] args) 
	{
		EvenWithoutLoop a=new EvenWithoutLoop();
		a.funA(1);
		
	}

}
