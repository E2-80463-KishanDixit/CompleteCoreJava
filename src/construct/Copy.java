package construct;

public class Copy {

	int id;
	String name;
	Copy(int i,String s)
	{
		id =i;
		name=s;
	}
	Copy(Copy c)
	{
		id = c.id;
		name = c.name;
	}
	
	public  void display()
	{
		System.out.println(id+""+name);
	}
	
	public static void main(String args[])
	{
		Copy c1 = new Copy(1,"Ravi");
		Copy c2 = new Copy(c1);
		c1.display();
		c2.display();
	}
}

