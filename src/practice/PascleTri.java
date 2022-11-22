package practice;
import java.util.*;

public class PascleTri {         //dont know
	int i,j,n,s,num;
	public void getInfo()
	{
		System.out.println("enter the value of n");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
	}
	
	public void tri()
	{ 
		
		for(i=0;i<=n;i++)
		{
			num =1;
			for(j=i;j>=1;j--) 
			{
				num=num*(i-j)/j+1;
				System.out.print(num);
			
			}
			
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String args[])
	{
		PascleTri pt = new PascleTri();
		pt.getInfo();
		pt.tri();
	}

}
