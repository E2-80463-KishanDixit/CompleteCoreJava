package practice;

import java.util.Scanner;

public class Pattern7 {
	int i,n,j,k,h,g;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern7() 
	{  
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			
			for(h=2;h<=i;h++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}
	  
	public static void main(String args[])
	{
		Pattern7 p=new Pattern7();
		p.getData();
		p.pattern7();
    }
}
