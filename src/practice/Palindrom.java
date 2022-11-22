package practice;
import java.util.*;

public class Palindrom {
	int num,rev=0,r,i,cpy;
	
	public void getData()
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		
		num= s.nextInt();
		cpy=num;
	}
	
	public void reverse()
	{
		do {
			    r = num%10;
			    rev = rev*10+r;
			    num = num/10;
		}while(num>0);
	     
	}
	
	public void check()
	{
		if(rev==cpy)
		{
			System.out.println("Given Number is a Magic number");
		}else
		{
			System.out.println("Given Number is not a 1Magic number");
		}
	}
	
	public static void main(String args[])
	{
		Palindrom p=new Palindrom();
		p.getData();
		p.reverse();
		p.check();
	}
	

}
