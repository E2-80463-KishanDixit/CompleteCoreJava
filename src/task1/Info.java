package task1;
import java.util.*;
public class Info {
	String name,email;
	double Mnum;
	public void getData() {
	System.out.println("enter your name:\n email:\nMob.no:");
	Scanner s = new Scanner(System.in);
	name= s.nextLine();
	email =s.nextLine();
	Mnum=s.nextDouble();
	}
	
	public void Display() {
		String s = "Your name:\n"+name+"your email:\n"+email+"your Mob.no:\n"+Mnum;
		System.out.println(s);
	}

}