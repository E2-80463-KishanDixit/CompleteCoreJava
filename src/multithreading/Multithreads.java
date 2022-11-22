package multithreading;
import java.util.*;

public class Multithreads extends Thread{

	String process;
	int nop;
	Scanner s = new Scanner(System.in);

	public void getData()
	{
		System.out.println("enter name of process and number of pages it wants to print");
		process = s.next();
		nop = s.nextInt();
		
	}
	
	public void run()
	{
		for(int i=1;i<=nop;i++) {
			System.out.println("pages"+i+"process"+process);
			
		}
	}
	
	public static void main(String args[])
	{
		Multithreads mt1 = new Multithreads();
		Multithreads mt2 = new Multithreads();
		mt1.getData();
		mt2.getData();
		mt2.start();
		mt1.start();
		
	}
}
