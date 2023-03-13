package programsNumbersPrint;

public class MissingArray {

	public static void main(String[] args)
	{

		int[] a={1,2,3,5};   
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of the numbers without missing number :"+sum1);
		
		int[] b={1,2,3,4,5};   
		int sum2=0;
		for(int i=0;i<b.length;i++)
		{
			sum2=sum2+b[i];
		}
		System.out.println("Sum of the numbers with missing number :"+sum2);
		System.out.println("Missing number is :"+(sum2-sum1));
	}

}
