package task4;

public class FloatLine extends IntLine{
	public void line(float p1,float p2,float q1,float q2,float c2)
	{
		m2=(q2-q1)/(p2-p1);
		
		System.out.println("y="+m2+"x+"+c2);
	}
	
	public static void main(String args[])
	{
		FloatLine fl= new FloatLine();
		fl.getData();
		
		fl.line(x1, x2, y1, y2, c1);
		
		fl.line(p1, p2, q1, q2, c2);
	}
	

}
