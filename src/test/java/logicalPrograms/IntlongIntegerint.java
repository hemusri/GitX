package logicalPrograms;
public class IntlongIntegerint 
{
	//int,long,Integer,int...(short),(byte)
	public static void main(String[] args)
	{
		IntlongIntegerint a=new IntlongIntegerint();
		a.print(10);
//		a.print((short)10);
//		a.print((byte)10);
	}

	void print(byte i)
	{
		System.out.println("byte");
		
	}
	void print(short i)
	{
		System.out.println("short");
		
	}
//	void print(int i)
//	{
//		System.out.println("int");
//		
//	}
//	void print(long i)
//	{
//		System.out.println("long");
//		
//	}
	void print(int... i)
	{
		System.out.println("int...");
		
	}
	                              
	  
}  







