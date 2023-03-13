package Practies;

import java.util.jar.Manifest;

public class Practies
{
	int x,y;
	
	void funA()
	{
		x=x+1;
		Practies d1 = new Practies();
		d1.x = x+2;
	}
	
	public static void main(String[] args) 
	{
		
		Practies d1 = new Practies();
		d1.funA();
		System.out.println(d1.x);
	}


	
	
}
