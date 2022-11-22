package encap;

public class Encapsulation {
	int a=10,b=30;
	public void add()
	{
		System.out.println("Addition is:"+(a+b));
	}
	public static void main(String args[])
	{
		Encapsulation e = new Encapsulation();
		e.add();
		System.out.println("back to main");
		
	}

}
