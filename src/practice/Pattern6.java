package practice;

import java.util.Scanner;

public class Pattern6 {
	int i,n,j,k,h,g;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern6() 
	{  
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
				System.out.print(" *");
			}
			System.out.print("\n");
			
			
		}
			
	}
	  
	public static void main(String args[])
	{
		Pattern6 p=new Pattern6();
		p.getData();
		p.pattern6();
		
		

    }

}
