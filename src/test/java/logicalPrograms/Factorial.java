package logicalPrograms;

public class Factorial
{

	public static void main(String[] args)
	{

		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	} 
 
//How do you find the factorial of an integer?
//A factorial is a function that multiplies a number by every number below it. For example, 5!= 5*4*3*2*1=120.
//Recursive function multiples the numbers until it reaches 1.
public static long factorial(long n)
{

	if (n == 1)

		return 1;

	else

		return (n * factorial(n - 1));

}
}



