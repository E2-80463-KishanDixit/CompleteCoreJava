package practice;

import java.util.Scanner;

public class Pattern2 {
	int i,n,j,p,q;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern2() 
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
	}
	public void patternrev()
	{
		for(p=n;p>=1;p--)
		{
			for(q=p-1;q>=1;q--)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String args[])
	{
		Pattern2 p=new Pattern2();
		p.getData();
		p.pattern2();
		p.patternrev();
	}

}
