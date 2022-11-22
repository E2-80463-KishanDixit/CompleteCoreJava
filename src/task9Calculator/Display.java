package task9Calculator;
import java.util.*;
import java.io.*;
import java.nio.Buffer;

public class Display extends Calculator{
		static int rslt;
		private char[] execution;
		static String myString;
	 
		
		public void execution()
		{
			Display d = new Display();
			System.out.println("Choose anyone Operation given below:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			Scanner s = new Scanner(System.in);
			rslt = s.nextInt();
			if(rslt==5)
			{
				myString=d.exit();
				System.out.println("");
			}
			else if(rslt<=0 || rslt>4)
			{
				System.out.println("Enter right choice");
				myString = "Enter right choice";
				System.out.println("");
				
			}
			else
			{
				d.getData();
				
				switch(rslt)
				{
				case 1:myString=d.sum();
				break;
				
				case 2:myString=d.sub();
				break;
				
				case 3:myString=d.multi();
				break;
				
				case 4:myString=d.div();
				break;
				
//				case 5:d.exit();
//				break;
				
				default:myString="Enter right valid choice";
				System.out.println("Enter right valid choice");
				}  
				
			}
		}
		
		public static void appendStrToFile() {
			try
			{
				BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\calc.txt",true));
				fw.write(myString);
				fw.write("\n");
				fw.close();
				System.out.println("File written Successfully");
			}
			catch (IOException e)
			{
				System.out.println("Exception occure"+e);
			}
			
		}
		
		
		
//		public String check()
//		{
//			check = "hii I want to check ";
//			return check;
//
//			
//		}
		public static void main(String args[])
		
		{ 
			Display d = new Display();
			do {
				d.execution();
//				d.writeFile();
				d.appendStrToFile();
				System.out.println("");
				
			}
			while(rslt!=5);
		}
		
	}


