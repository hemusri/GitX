package programsNumbersPrint;

public class DuplicateCharacter {

	public static void main(String[] args)
	{
		String s="KrishnaaK";
		char dup[]=s.toCharArray();
		System.out.println("Duplicate characters in the given String is : ");

		
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(dup[i]==dup[j])
					count++;
			}
			if(count>1)
				System.out.println(dup[i]);
		}
	}

}
