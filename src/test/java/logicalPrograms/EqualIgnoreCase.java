package logicalPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EqualIgnoreCase 
{

	public static void main(String[] args) 
	{
		String s1="Polaboina Naresh";  
		String s2=s1.toLowerCase();
		System.out.println(s2);
		String s3=s1.toUpperCase();
		System.out.println(s3);
		String s4="polaboina naresh";  
		if(s2.equals(s4))
			System.out.println("address are same");
		else
			System.out.println("address are not same");
		if(s2.equalsIgnoreCase(s3))
			System.out.println("address are same");
		else
			System.out.println("address are not same");
	}

}
