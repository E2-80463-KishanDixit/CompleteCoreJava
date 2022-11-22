package task2;
import java.util.*;

public class Display extends Student {
	String name,email,s;
	double phone;
	
	public void getData() {
	System.out.println("enter your name,email,phone no.");
	Scanner s = new Scanner(System.in);
	name= s.nextLine();
	email= s.nextLine();
	phone = s.nextDouble();
	}
	
	public void show()
	{
		System.out.println("your name\n="+name+"\nyour email\n="+email+"\nyour rollno:\n"+Rollno+"\nyour phone no:\n"+phone);
		
	}
	
	public static void main(String args[])
	{
		Display d = new Display();
		d.getRollno();
		d.getData();
		d.show();
	
 }
}
