package practice;

import java.util.Scanner;

public class Pattern3 {
	int i,n,j,k;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern3() 
	{
		for(i=1;i<=n;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
		        System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		
	}
	
	public static void main(String args[])
	{
		Pattern3 p=new Pattern3();
		p.getData();
		p.pattern3();
		
	}


}
