package logicalPrograms;

public class Cone 
{

	public static void main(String[] args) 
	{
		int k=1;
		for(int i=0;i<4;i++)
		{
			//for(int j=0;j<1+i;j++)
			for(int j=0;j<4-i;j++)
			{
			System.out.print(k);	
			System.out.print("\t");
			k++;
			}
			System.out.println(" ");
		}

	}

}
