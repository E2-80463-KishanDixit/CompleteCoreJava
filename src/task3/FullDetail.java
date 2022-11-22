package task3;

public class FullDetail extends Car3{
	public void Display()
	{
		System.out.println("Car1 Detail:\nBrand: "+Brand1+"\nSpeed:"+spd1+"\nSpeed limit:"+lmt1+"\n\nCar2 Detail:\nBrand: "+Brand2+"\nSpeed:"+spd2+"\nSpeed limit:"+lmt2
				+"\n\nCar3 Detail:\nBrand: "+Brand3+"\nSpeed:"+spd3+"\nSpeed limit:"+lmt3);
	}

	public static void main(String args[])
	{
		FullDetail f = new FullDetail();
		f.getDatac1();
		f.getDatac2();
		f.getDatac3();
		f.Display();
	
	}
}
