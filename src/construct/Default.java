package construct;

public class Default {
	int a,b;
	
	public Default() { 
		
		a=20;
		b=8;
	}

	public void add() {
		System.out.println("Addition is:"+(a+b));
		
	}
	
	public static void main(String args[])
	{
		Default d = new Default();
		d.add();
	}
}
