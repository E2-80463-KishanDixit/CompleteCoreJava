package task.multithread;
import java.util.*;

public class findTable extends Thread {
	int i;
	int num;
    void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number the number to count the table");
		num = s.nextInt();
	}
	
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		
//		System.out.println(num+"*"+i+"="+num*i);
	}
	
	public static void main(String args[])
	{
		findTable ft = new findTable();
		ft.getData();
		ft.start();
	}

}
