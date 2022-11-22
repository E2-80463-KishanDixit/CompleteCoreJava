package exception;
import java.util.*;

public class ExpectionDemo {
 int a,b;
 Scanner s = new Scanner(System.in);
	public void getData()
	{
		System.out.println("enter values of a & b:");
		a= s.nextInt();
		b=s.nextInt();
		
	}
	
	public void div()
	{
		int c =a/b;
		System.out.println("division is "+c);
		
}

	public static void main(String args[])
	{
		ExpectionDemo ed = new ExpectionDemo();
		ed.getData();
		ed.div();
	}
}
