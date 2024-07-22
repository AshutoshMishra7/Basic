import java.io.*;
class FileHandling3
{
	public static void main(String args[])
	{
		File f=new File("C:\\xampp");
		String s[]=f.list();
		int count=0;
		for(String x:s)
		{
			count++;
			System.out.println(x);
		}
		System.out.println("Number of files:"+count);
	}
}
