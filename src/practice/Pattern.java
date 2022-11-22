package practice;
import java.util.*;

public class Pattern {
	int i,n,j;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern() 
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.getData();
		p.pattern();
	}
}
