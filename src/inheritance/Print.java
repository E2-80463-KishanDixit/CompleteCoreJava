package inheritance;

public class Print extends Details {
	public void print() { 
		System.out.println("Employee details: "+ "\n Id: "+id+"\n Name: "+name+"\n Email: "+email+"\n Salary: "+salary);
	}
 public static void main(String args[])
 {
	 
	 Print p = new Print();
	 p.getId();
	 p.getDetails();
	 p.print();
			 
 }
}
