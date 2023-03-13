package logicalPrograms;
import java.util.ArrayList;
import java.util.List;

public class ToArray
{

	public static void main(String[] args)
	{
		List l=new ArrayList();
		l.add(10);
		l.add("naresh");
		l.add(10.4);
		l.add('c');
		Object[] arr=l.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		List<String> l2=new ArrayList<>();
		l2.add("Naresh");
		List<String> l1=new ArrayList<>();
		l1.add(" Polaboina");
		String s1=l2.get(0);
		String s2=l1.get(0);
		System.out.println(s1+s2);
	}

}
