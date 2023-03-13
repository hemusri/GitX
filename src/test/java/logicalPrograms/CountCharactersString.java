package logicalPrograms;

public class CountCharactersString 
{

	public static void main(String[] args) 
	{
		
			String str = "This is selenium class";

	        int stringLength = str.length();

	        
		int count = 0;

		char search = 'i';

		for (int i = 0; i < stringLength; i++) {

		    if (str.charAt(i) == search) {

		        count++;

		    }

		}

		System.out.println(count);
	        
	    }

	}


