package logicalPrograms;


public class StringReverse 
{
	public static void main(String[] args)
	{
		String x="abc";
		String y="abc";
		x.concat(y);
		System.out.println(x);
		System.out.println(y);
		x=x.concat(y);
		System.out.println(x);

		String s1="polaboina naresh";
//		String s2=" ";
//		System.out.println(s1.length());
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2=s2+s1.charAt(i);
//
//		}
//		System.out.println(s2);
		
		StringBuilder s3=new StringBuilder(); 
		s3.append(s1);
		s3=s3.reverse();
		System.out.println(s3);
		

//			StringBuffer s1=new StringBuffer("polaboina naresh");
//			s1.reverse();
//			System.out.println(s1);


			String test="this is selenium class";
			System.out.println(test);
			System.out.println(test.length());
			String[] result=test.split(" "); 
			System.out.println("result array length:"+result.length);
			for(int i=result.length-1;i>=0;i--)
			{
				System.out.println(result[i]);
			}
//					for(String str:result)
//					{
//						System.out.println(str+" ");
//					}
			
			
		}
	}



	


