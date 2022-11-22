package practice;
import java.util.Scanner;

public class GrossSalary {
	int Salary,gSalary,sda,hra;
	public void grossSalary()
	{
		System.out.println("Enter your basic salary");
		Scanner s = new Scanner(System.in);
		Salary = s.nextInt();
		sda = (Salary*40)/100;
		hra = (Salary*20)/100;
		gSalary = Salary-sda-hra;
        System.out.println("Your gross Salarty is:"+gSalary);
	}
	public static void main(String args[])
	{
		GrossSalary gs = new GrossSalary();
		gs.grossSalary();
	}
	

}
