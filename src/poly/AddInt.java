package poly;
import java.util.*;

public class AddInt {

		static int a,b;
		static float x,y;
		
		public void getData()
		{
			Scanner s =new Scanner(System.in);
			System.out.println("Enter values of a & b");
			a = s.nextInt();
			b =s.nextInt();
			System.out.println("Enter values of x & y");
			x=s.nextFloat();
			y=s.nextFloat();
			
		}

		public void add(int a,int b)
		{
			int c = a+b;
			System.out.println("Addition of integer type of data is "+c);
		}

	}


