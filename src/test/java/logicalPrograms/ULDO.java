package logicalPrograms;
public class ULDO
{


	public static void main(String[] args)
	{
		String str="Naresh Polaboina 100*&^^";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
//			else if(Character.isLowerCase(str.charAt(i)))
//			{
//				System.out.println(str.charAt(i));
//			}
			else if(Character.isDigit(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
//			else if(Character.isSpaceChar(str.charAt(i)))
//			{
//				System.out.println(str.charAt(i));
//			}
//			else if(Character.isWhitespace(str.charAt(i)))
//			{
//				System.out.println(str.charAt(i));
//			}
			
			
			
				
			

		}


	}

}
