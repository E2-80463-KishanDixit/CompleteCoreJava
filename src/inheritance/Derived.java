package inheritance;

public class Derived extends Base {
	public void heating() 
	{
		System.out.println("heating property");
	}

	public static void main(String[] args)
	{
		Derived d = new Derived();
		d.cooling();
		d.heating();
		
	}
}
