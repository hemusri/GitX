package logicalPrograms;

public class DuplicateCharacterCount
{

	public static void main(String[] args) 
	{
		String s="this is polaboina naresh";
		char c;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
					if(c=='a')
						count++;
		}
		System.out.println("a appears "+count+" times");
		int coun=0;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
					if(c=='i')
						coun++;
		}
		System.out.println("i appears "+coun+" times");
		int cou=0;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
					if(c=='s')
						cou++;
		}
		System.out.println("s appears "+cou+" times");

	}

}
