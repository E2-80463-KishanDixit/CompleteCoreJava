package task8;
import java.util.*;
import java.io.*;
public class PracticeFile {

	public void creatFile()
	{
		File f = new File("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\PracticeFile.txt");
	    
		try {
			if(f.createNewFile())
			{
				System.out.println("file is created Successfully");
			}
			else
			{
				System.out.println("File is not crated");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void writeFile()
	{
			FileWriter ft=null;
			try {
				ft = new FileWriter("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\PracticeFile.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ft.write("Hello World!I am a Developer so hows going on");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ft.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File written Successfully");
		
	}
	
	public void readFile()
	{
		File fr = new File("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\PracticeFile.txt");
		Scanner s = null;
		try {
			s = new Scanner(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(s.hasNextLine())
		{
			String str = s.nextLine();
			System.out.println(str);
		}
		
	}
	
	public void deleteFile()
	{
		File df = new File("C:\\Users\\kishan dixit\\OneDrive\\Desktop\\PracticeFile.txt");
		if(df.delete())
		{
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File is not deleted");
		}
	}
	
	public static void main(String args[])
	{
		PracticeFile pf = new PracticeFile();
//		pf.creatFile();
//		pf.writeFile();
//		pf.readFile();
		pf.deleteFile();
	}
}
