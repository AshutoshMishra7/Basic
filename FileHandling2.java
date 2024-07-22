import java.io.*;
class FileHandling2
{
	public static void main(String args[])
	{
		File f=new File("My Folder1");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}
}
