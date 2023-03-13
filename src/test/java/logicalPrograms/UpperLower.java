package logicalPrograms;
public class UpperLower
{

	public static void main(String[] args) 
	{
		String s="Welcome To Selenium Class";
		String lower="";
		String upper="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>=65 && c<=90)
			{
				upper=upper+c;
				//upper++;

			}
			else
			{
				lower=lower+c;
				//lower++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);

	}

}
