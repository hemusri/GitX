package logicalPrograms;

import java.util.Scanner;

public class CapitaliseFirstLetter
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string Data");
		String str=sc.nextLine();
		String uppercase=" ";
		Scanner scanner=new Scanner(str);
		while(scanner.hasNext())
		{
			String word=scanner.next();
			uppercase+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
		}
		System.out.println(uppercase.trim());

	}

}
