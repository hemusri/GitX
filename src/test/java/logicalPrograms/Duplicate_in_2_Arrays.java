package logicalPrograms;

public class Duplicate_in_2_Arrays
{

	public static void main(String[] args) 
	{
		int a[]={12,34,34,67,56,89};
		int b[]={12,43,56,87,90,62};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					System.out.println(a[i]);
			}
		}

	}

}
