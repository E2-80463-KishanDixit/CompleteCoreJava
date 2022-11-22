package construct;
import java.util.*;

public class Paramiterized {

	public Paramiterized(int num)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(num+"*"+"="+i+(num*i));
			
		}
		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();
		Paramiterized p = new Paramiterized(num);
		
	}
}
