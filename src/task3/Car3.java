package task3;

import java.util.Scanner;

public class Car3 extends Car2 {
	int spd3,lmt3;
	String Brand3;
    public void getDatac3()
    {
    	System.out.println("Enter car3 details- brand:\n Speed:\nSpeed limit:");
		Scanner s = new Scanner(System.in);
		Brand3 = s.next();
		spd3= s.nextInt();
		lmt3 = s.nextInt();

}
}