package inheritance;
import java.util.Scanner;

public class Details extends Employee {
	int salary;
	String name,email,phone;
	
	public void getDetails()
	{
	    Scanner s = new Scanner(System.in);
		System.out.println("Enter salary ,name,email,phone of employee");
		salary= s.nextInt();
		name = s.next();
		email = s.next();
		phone = s.next();
	}
	

}
