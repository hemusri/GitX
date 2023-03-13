package logicalPrograms;

class A
{
	public static void main(String[] args)
	{
		int n=371,r=0,sum=0;
		int number=n;
		while(n!=0)
		{
			r=n%10;
			sum+=Math.pow(3, r);
			n=n/10;
			
		}
		if(sum==number)
		{
			System.out.println("given number is amstrong");
		}
		else
			System.out.println("not amstrong");
		
	}
}








