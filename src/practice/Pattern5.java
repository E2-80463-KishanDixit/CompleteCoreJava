package practice;

import java.util.Scanner;

public class Pattern5 {
	
	int i,n,j,k;
	public void getData()
	{
		System.out.println("enter the value of num:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}

	public void pattern5() 
	{  
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			for(k=n-i;k>=1;k--)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
	}
		
	    
	public static void main(String args[])
	{
		Pattern5 p=new Pattern5();
		p.getData();
		p.pattern5();
		

    }
}
