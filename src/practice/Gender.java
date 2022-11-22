package practice;
import java.util.*;

public class Gender {
	char gnd;
	
	
	public void gender()
	{
		System.out.println("Enter your gender:M/F");
		Scanner s = new Scanner(System.in);
		gnd=s.next().charAt(0);
		System.out.println("Enter your gender:"+gnd);
		if(gnd=='M')
		{
			System.out.println("you are a male");
		}
		else if(gnd=='F')
		{
			System.out.println("you are a femail");
		}
	}

	
	public static void main(String args[])
	{
		Gender g = new Gender();
		g.gender();
	}
}
