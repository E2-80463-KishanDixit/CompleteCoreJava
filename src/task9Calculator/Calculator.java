package task9Calculator;
import java.util.*;

public class Calculator {
	
	Scanner s = new Scanner(System.in);
	int a,b,sum,sub,multi,percent;
	float div;
	String check;
	public void getData()
	{
		System.out.println("Enter numbers to perform Operation");
		a=s.nextInt();
		b=s.nextInt();
	}
	
	public String sum()
	{
		sum=a+b;
//		System.out.println("Sum of  "+a+" and"+b+" is: "+sum);
		System.out.println(a+"+"+b+"="+sum);
		System.out.println("");
		 check = a+"+"+b+"="+sum;
//		 System.out.println(check);
		 return check;
	}
	
	public String sub()
	{
		sub = a-b;
//		System.out.println("Subtraction of  "+a+" and "+b+" is: "+sub);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println("");
		 check = a+"-"+b+"="+sub;
//		 System.out.println(check);
		 return check;
	}
	
	public String multi()
	{
		multi = a*b;
//		System.out.println("Multiplication of  "+a+" and "+b+" is: "+multi);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println("");
		 check = a+"*"+b+"="+multi;
//		 System.out.println(check);
		 return check;
	}
	
	public String div()
	{
		if(b==0)
		{
			System.out.println("Enter none zero value of 2nd number");
		}
		else
		{
			div=(float)a/b;
//			System.out.println("division of  "+a+" and "+b+" is: "+div);
			System.out.println(a+"/"+b+"="+div);
			System.out.println("");
			 check = a+"/"+b+"="+div;
//			 System.out.println(check);
		}
		
		return check;
	}
	
	public String exit()
	{
		System.out.println("Thanks for using this service");
		check="Operation End!\nThanks for using this service";
		return check;
	}
}
