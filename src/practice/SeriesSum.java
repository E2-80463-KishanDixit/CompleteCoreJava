package practice;
import java.util.*;
public class SeriesSum {

	int i,j,n,t,s=0,p,q=0;
	public void getData()
	{
		System.out.println("Enter the value of n");
	    Scanner s = new Scanner(System.in);
	    n=s.nextInt();
	}
	
	public void printSeries()
	{
	   System.out.println("Enter the value of first term");
	    Scanner s = new Scanner(System.in);
	    t=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	    	for(j=i;j>=1;j--)
	    	{
	    		System.out.print(t);
	    	}
	    	System.out.print("+");
	    }
	}
	
	public void sumS()
	{
	   for(p=1;p<=n;p++)
	   {
		   s=s*10+t;
		   q=q+s;
	   }
	   System.out.print("="+q);
	}
	
	
	public static void main(String args[])
	{
		SeriesSum ss= new SeriesSum();
		ss.getData();
		ss.printSeries();
		ss.sumS();
	}
	
}
