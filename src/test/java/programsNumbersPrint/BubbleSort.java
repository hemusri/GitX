package programsNumbersPrint;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int arr[] = {50,10,60,90,40,30};
		
		System.out.println("Array before sorting :"+Arrays.toString(arr));
		int n=arr.length;
		System.out.println("Array of length :"+n);
		
		int temp=0;
		
		for(int i=0;i<=arr.length-1;i++)  //Number of Passes
		{
			for(int j=i;j<=arr.length-1;j++)  //Iterations in each pass
			{
				if(arr[i]>arr[j])  //50>10
				{
					temp = arr[i];    //50
					arr[i] = arr[j];   //10
					arr[j] = temp;   //50
				}
			}
			//System.out.print(arr[i]+" ");
		}
		System.out.println("Array After sorting :"+Arrays.toString(arr));
		//System.out.println(arr[arr.length-1]);
	}

}
