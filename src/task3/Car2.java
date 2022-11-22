package task3;

import java.util.Scanner;

public class Car2  extends Car1{
	int spd2,lmt2;
	String Brand2;
    public void getDatac2()
    {
    	System.out.println("Enter car2 details- brand:\n Speed:\nSpeed limit:");
		Scanner s = new Scanner(System.in);
		Brand2 = s.next();
		spd2 = s.nextInt();
		lmt2 = s.nextInt();
    }

}
