package practice;
import java.util.Scanner;

public class SecondMax {
	
	int a,b,c,g,l;
	
	public void max3()
	{
		System.out.println("Enter any three numbers");
		Scanner s = new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	}
	
	public void Max()
	{
		if(a>b&&a>c)
		{
			g=a;
		}
		else if(b>a&&b>c)
		{
			g=b;
		}
		else if(c>a&&c>b)
		{
			g=c;
		}
		System.out.println("Greater num is :"+g);
	 }
	
	public void less()
	{
		if(a<b&&a<c)
		{
			l=a;
		}
		
		else if(b<a&&b<c)
		{
			l=b;
		}
		
		else if(c<a&&c<b)
		{
			l=c;
		}
		System.out.println("lesser num is :"+l);
	}
	
	public void secondMax()
	{
		if(g!=a && l!=a)
		{
			System.out.println(a+"is a second largest number");
		}
		
		else if(g!=b&&l!=b)
		{
			System.out.println(b+"is a second largest number");
		}
		
		else if(g!=c&&l!=c)
		{
			System.out.println(c+"is a second largest number");
		}
	}
	
	public static void main(String args[])
	{
		SecondMax sm=new SecondMax();
		sm.max3();
		sm.Max();
		sm.less();
		sm.secondMax();
	}
	

}
