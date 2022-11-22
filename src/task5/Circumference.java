package task5;
import java.util.*;

public class Circumference implements Pi{
	float r,circum ;
	public void getData()
	{
		System.out.println("Enter the value of radius");
		Scanner s = new Scanner(System.in);
		r = s.nextFloat();
	}
	public void circum()
	{
		circum= 2*pi*r;
		System.out.println("the circumference of circle is :"+circum);
	}
	
	
	public static void main(String args[])
	{
		Circumference c = new Circumference();
		c.getData();
		c.circum();
	}

}
