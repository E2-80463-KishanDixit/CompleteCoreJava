package practice;
import java.util.*;

public class Fabnaci {
	int a=0,b=1,c=0,i,n;
	
	public void getData()
	{
		System.out.println("Enter the value of n");
		 
		 Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		 System.out.println(a +"\n" +b);
	}
	
	public void fab()
	{
		for(i=0;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	public static void main(String args[])
	{
		Fabnaci f =new Fabnaci();
		f.getData();
		f.fab();
	}

}
