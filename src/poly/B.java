package poly;

public class B extends A{
	public void display()
	{
		System.out.println("Display of B class");
	}
	
	public static void main(String args[])
	{
		B b= new B();
		b.display();
		A a = new A();
		a.display();
	}

}
