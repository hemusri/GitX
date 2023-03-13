package logicalPrograms;
public class SwapTwoNumbers 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("before swaping");
		System.out.println(a);
		System.out.println(b);
		System.out.println("after swaping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		int num = 5;
	    System.out.println(++num);
	    System.out.println(num++); 
	    System.out.println(num);
	    
	    int x = 100, y = 200;
	    System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}
}
