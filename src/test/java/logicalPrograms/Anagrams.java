package logicalPrograms;

import java.util.Arrays;

public class Anagrams 
{

	public static void main(String[] args)
	{
		String str="heart";          //integral
		String reverse="earth";      //triangle
		boolean anagrmstat=false;
		if (str.length() != reverse.length())
		{

			System.out.println(str + " and " + reverse + " not anagrams string");

		}
		else
		{

			char[] anagram1 = str.toCharArray();

			char[] anagram2 = reverse.toCharArray();

			Arrays.sort(anagram1);

			Arrays.sort(anagram2);

			anagrmstat = Arrays.equals(anagram1, anagram2);

		}

		if (anagrmstat == true)
		{

			System.out.println(" anagrams string");

		} 
		else 
		{

			System.out.println(" not anagrams string");

		}

	}

}
