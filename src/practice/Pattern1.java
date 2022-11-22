package practice;

import java.util.Scanner;

public class Pattern1 {
	int i,n,j;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern1() 
	{
		for(i=n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
	
	public static void main(String args[])
	{
		Pattern1 p=new Pattern1();
		p.getData();
		p.pattern1();
	}

}
