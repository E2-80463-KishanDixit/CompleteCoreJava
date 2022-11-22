package interfac;
import java.util.*;
public class Area implements Pi{ /*we can impliment interfaces more than one*/
	
	float r,area;
	public void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of radius");
		r = s.nextFloat();
	}
	
	public void area()
	{
		area = pi*r*r;
		System.out.println("Area of circle is:"+area);
		
	}
	
	public static void main(String args[])
	{
		Area a = new  Area();
		a.getData();
		a.area();
	}
	

}
