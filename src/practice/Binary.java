package practice;
import java.util.*;

public class Binary {
	int i,j,k,num,bin=0,rem,fin;
	String b="";
	public void getValue()
	{
		System.out.println("Enter decimal number");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
	}
	
	public void change()
	{
		i=0;
		do
		{
			fin = num%2;
//			bin = bin*10+fin;
			b=bin+b;
			rem = num/2;
			num = rem;
			
			i++;
		}
		while(rem>0);
		
		System.out.print(b);
	}
	

	public static void main(String args[]) 
	{
		Binary b = new Binary();
		b.getValue();
		b.change();
	}
}
