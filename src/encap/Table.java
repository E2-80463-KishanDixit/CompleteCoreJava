package encap;
import java.util.*;

public class Table {
	int t;
	public void getDeta()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		t=s.nextInt();
		
	}
	public void table()
	{
		String s;
		for(int i=1;i<=10;i++)
		{
			s=t+"*"+i+"="+(t*i);
			System.out.println(s);
		}
	}

}
