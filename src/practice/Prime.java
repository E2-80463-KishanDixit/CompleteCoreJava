package practice;
import java.util.*;
public class Prime {

	int num,chk,i,cpy;
	public void prime()
	{
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
	}
	
	public void check()
	{
		for(i=1;i<=num;i++)
		{
			chk = num%i;

			if(chk==0) 
			{
			    cpy++;
			}
			
		}
		
		if(cpy==2) 
		{
			System.out.println("given number is   a prime number");
		}
		else
		{
			System.out.println("given number is not a prime number");
		}
	}
	
  public static void main(String args[])
   {
	Prime p = new Prime();
	p.prime();
	p.check();
   }
}