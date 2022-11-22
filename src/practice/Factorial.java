package practice;
import java.util.*;

public class Factorial {
	int i,n,c=1,p;
	
	
	public void getData()
	{
		System.out.println("enter the number to know factorial");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Factoril of "+n+"is:");
	}
	
	public void fac()
	{
		for(i=n;i>0;i--)
		{
			c=c*i;
			
		}
		
		for(i=n;i>0;p=i--)
		{
			/*p=i--;*/
			String s = i+"*";
			System.out.print(s);
			
		}
		
		System.out.println("="+c);
	}

	public static void main(String args[])
	{
		Factorial f= new Factorial();
		f.getData();
		f.fac();
	}
}
