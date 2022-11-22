package task4;
import java.util.Scanner;

public class IntLine {
	static int y1,y2,x1,x2,c1,m1;
	static float p1,p2,q1,q2,c2,m2;
	
	public void getData()
	{
		System.out.println("Enter the values of int points (x1,x2),(y1,y2)");
		Scanner s = new Scanner(System.in);
		x1=s.nextInt();
	    x2=s.nextInt();
	    y1=s.nextInt();
	    y2=s.nextInt();
	    System.out.println("Enter the vlue of c1");
	    c1= s.nextInt();
	    
	    System.out.println("Enter the values of float points (p1,p2),(q1,q2)");
		p1=s.nextFloat();
	    p2=s.nextFloat();
	    q1=s.nextFloat();
	    q2=s.nextFloat();
	    System.out.println("Enter the vlue of c2");
	    c2=s.nextFloat();
		
	}
	
	public void line(int x1,int x2,int y1,int y2,int c1)
	{
		m1=(y2-y1)/(x2-x1);
		
		System.out.println("y="+m1+"x+"+c1);
	}
	
}
