package exception;
import java.util.*;
public class ArrayException {

	Scanner s = new Scanner(System.in);
	int arr[],size,sum;
	public void getArray()
	{
		System.out.println("enter the size of the array");
		size = s.nextInt();
		arr = new int[size];
		System.out.println("enter array element");
		for(int i=0;i<size;i++)
		{
			arr[i]= s.nextInt();
		}
	}
	
	public void getSum()
	{
		for(int i=0;i<size+1;i++)
		{
			try
			{
				sum= sum+arr[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("error");
				e.printStackTrace();
			}
		
			finally
			{
				System.out.println("print me everytime");
			}
		}
		
		System.out.println("sum is"+sum);
	}
	
	public static void main(String args[])
	{
		ArrayException ae = new ArrayException();
		ae.getArray();
		ae.getSum();
	}
}

