package demo;

public class ForEach {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length; i++)
		{
			System.out.println("Normal array"+arr[i]);
		}
			
	
	for(int a : arr)
	{
		System.out.println("For each loop"+a);
	}

}
}
