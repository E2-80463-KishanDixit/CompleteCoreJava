package multithreading;

public class RunnableDemo implements Runnable{

	
	public void run() 
	{
		System.out.println("This is Runnable demo");
		
	}
	
	public static void main(String args[])
	{
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();
	}
	
}
