package multithreading;

public class ThreadDemo extends Thread {

	public void run()
	{
		System.out.println("this is a thred class example");
	}
	
	public static void main(String args[])
	{
		ThreadDemo td = new ThreadDemo();
		td.start();
	}
}
