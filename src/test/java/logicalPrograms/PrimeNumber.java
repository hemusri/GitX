package logicalPrograms;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int n=53,temp=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
			
		}
		if(temp==0)
			System.out.println("prime number");
		else
			System.out.println("not prime");
		
	}

}
