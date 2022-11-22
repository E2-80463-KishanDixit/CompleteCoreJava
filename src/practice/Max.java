package practice;
import java.util.Scanner;
public class Max {
	int a,b,c,d,m1,m2,m3;
	
	public void maxno()
	{
		System.out.println("Enter any four numbers");
		Scanner s = new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		
	}
	
	public void max()
	{
		if(a>b)
		{
			m1=a;
		}
		else
		{
			m1=b;
		}
		
		
		if(c>d)
		{
			m2=c;
		}
		else
		{
			m2=d;
		}
		
		if(m1>m2)
		{
			System.out.println("the max no is:"+m1);
		}
		else
		{
			System.out.println("the max no is:"+m2);
		}
	}
		
		public static void main(String args[])
		{
		   Max m = new Max();
		   m.maxno();
		   m.max();
		}
	
	

}
