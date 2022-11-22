package poly;

public class AddFloat extends AddInt {
	
	public void add(float x,float y)
	{
		float z=x+y;
		System.out.println("Addition of float of data is:"+z);
		
	}
	public static void main(String args[])
	{
		AddFloat af = new AddFloat();
		af.getData();
		af.add(a, b);
		af.add(x, y);
	}

}
