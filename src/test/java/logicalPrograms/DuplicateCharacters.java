package logicalPrograms;

public class DuplicateCharacters 
{

	
		public static void main(String[] args)
		{
			String str = "Polaboina naresh";
			char[] dup = str.toCharArray();
			Naresh:
			System.out.println("The string is:" + dup);
	//		System.out.println("The string is:" + str);
	//		System.out.println("String length:"+str.length());
			System.out.println("Duplicate Characters in above string are: ");
			Outerloop:
			for (int i = 0; i < str.length(); i++) 
			{
				Innerloop:
				for (int j = i + 1; j < str.length(); j++)
				{
					if (dup[i] == dup[j]) 
					{
						System.out.println(dup[j]);
						
					}
				}
			}
		}
	
	}


