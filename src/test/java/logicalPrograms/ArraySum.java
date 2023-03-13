package logicalPrograms;

public class ArraySum 
{

	public static void main(String[] args) 
	{
		int[] array = { 1, 2, 3, 4, 5 };

		int sum = 0;

		//for (int i : array)
		for(int i=0;i<array.length;i++)

		    sum =sum+ i;

		System.out.println(sum);

	}

}
