package inheritance;

import java.util.*;

public class Employee {
	int id;
	public void getId()
	{
		System.out.println("enter employee id");
		Scanner s =new Scanner(System.in);
	
		id = s.nextInt();
	}

}
