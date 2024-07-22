import java.io.*;
class FileHandling4
{
	public static void main(String args[])
	{
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Core Java");
		String s[]=f.list();
		int count=0;
		for(String x:s)
		{
			count++;
			System.out.println(x);
		}
		System.out.println("Number Of Files:"+count);
	}
}
