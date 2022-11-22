package practice;
import java.util.*;

public class ReverseSe {
	
	int i,n;

	public void reverse()
	{
		System.out.println("Enter the value of N ");
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		
		for(i=n;i>0;i--)
		{
			System.out.println(i);
		}
		
	}
	
	public static void main(String args[])
	{
		ReverseSe rs = new ReverseSe();
		rs.reverse();
	}
	

}
