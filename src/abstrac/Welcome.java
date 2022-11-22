package abstrac;

import java.util.Scanner;

public class Welcome extends Login {
	
	public void login() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter usrename and pasword");
		String uname = s.next();
		String pass = s.next();
		
		if(uname.equals(username)&&pass.equals(password))
		{
			System.out.println("welcome");
			
		}
		else
		{
			System.out.println("invalid");
		}
		
					
		}
	
	public static void main(String args[])
	{
		Welcome w = new Welcome();
		w.login();
	}

}
