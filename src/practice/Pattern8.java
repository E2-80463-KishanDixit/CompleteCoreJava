package practice;

public class Pattern8 {
	int i,j,k,l;
	char ch,ch1;
	
	public void ptrn()
	{
		for(i=0;i<=7;i++)
		{
			for(ch=97;ch<104-i;ch++)
			{
				System.out.print(ch);
			}
			
			for(ch1=102;ch1>=97+i;ch1--)
			{
				System.out.print(ch1);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		Pattern8 pt = new Pattern8();
		pt.ptrn();
	}

 }




//for(i=0;i<=7;i++)
//{
//	for(ch=(char)(97);ch<=104-i;ch++)
//	{
//		System.out.print(ch);
//	}
//	System.out.println();
//}