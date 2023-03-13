package logicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSortAssending 
{

	public static void main(String[] args)
	{
		
			int arr[]={23,6,3,21,32};
			int temp=0;
			System.out.println("array length is:"+arr.length);
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length-1;j++)
				{
					if(arr[j]>arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		//	Arrays.sort(arr);
//			System.out.println(Arrays.toString(arr));
			
			
			

	}

}
