package files;
import java.util.*;
import java.io.*;
public class FileDemo {

	public void creatFile()
	{
		File myFile = new File("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\Demo.txt");
		
		try {
			if(myFile.createNewFile())
			{
				System.out.println("your file is created");
			}
			else
			{
				System.out.println("File can't be created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeFile()
	{
		try {
			FileWriter fw = new FileWriter("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\Demo.txt");
			fw.write("hello kishan");
			fw.close();
			System.out.println("File wrintten successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readFile()
	{
		File fr = new File("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\Demo.txt");
		try {
			Scanner s = new Scanner(fr);
			while(s.hasNextLine())
			{
				String str = s.nextLine();
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteFile()
	{
		File file = new File("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\Demo.txt");
		if(file.delete())
		{
			System.out.println("File deleted Successfully");
		}
		else
		{
			System.out.println("File not deleted");
		}
	}
	public static void main(String args[])
	{
		FileDemo fd = new FileDemo();
//		fd.creatFile();
//		fd.writeFile();
//		fd.readFile();
		fd.deleteFile();
	}
}
