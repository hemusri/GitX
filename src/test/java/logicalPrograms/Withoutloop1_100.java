package logicalPrograms;
public class Withoutloop1_100
{

	public static void main(String[] args)
	{
		int n=1;
		printnumbers(n);
	}
	static void printnumbers(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			printnumbers(n+1);
		}
		
	}
}

