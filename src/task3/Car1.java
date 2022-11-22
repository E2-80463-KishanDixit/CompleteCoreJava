package task3;
import java.util.*;

public class Car1 {
	int spd1,lmt1;
	String Brand1;
	public void getDatac1()
	{
		System.out.println("Enter car1 details- brand:\n Speed:\nSpeed limit:");
		Scanner s = new Scanner(System.in);
		Brand1 = s.next();
		spd1 = s.nextInt();
		lmt1 = s.nextInt();
		
	}

}
