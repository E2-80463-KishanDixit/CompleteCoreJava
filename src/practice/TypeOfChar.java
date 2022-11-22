package practice;
import java.util.*;

public class TypeOfChar {
	char ch;
	
	public void takeInPut()
	{
		System.out.println("Press any key from or enter any character ");
		Scanner s= new Scanner(System.in);
		ch=s.next().charAt(0);
	}
	
	public void define() 
	{
		if(ch>=65&&ch<=90)
		{
			System.out.println("Entered character is in Upper Case");
		}
		else if(ch>=97&&ch<=122)
		{
			System.out.println("Entered key is in Lower Case");
		}
		else if(ch>=48&&ch<=57)
		{
			System.out.println("Entered key is digit");
		}
		else if(ch>=32&&ch<=47||ch>=58&&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=126)
		{
			System.out.println("Entered key is in Special character");
		}
	}
	
	public static void main(String args[])
	{
		TypeOfChar tp = new TypeOfChar();
		tp.takeInPut();
		tp.define();
		
	}
	

}
