package logicalPrograms;

public class LargestWithoutIf 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int big=a>b?a:b;
		System.out.println(big);
		
		
		System.out.println(LargestOfTwo(25,35));
	   }
	   static int LargestOfTwo(int a, int b)
	   {
	      return (a>b) ? a:b;
	   }
	
				
				
	}


