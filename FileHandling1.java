import java.util.*;
import java.io.*;
class FileHandling1
{
	public static void main(String args[])
	{
		File f=new File("hello.txt");
		System.out.println(f.exists());
	}
}
