import java.io.*;
class FileWriter1
{
	public static void main(String args[])throws Exception
	{
		FileWriter f=new FileWriter("hello.txt");
		f.write(65);
		String s[]={"65","67","899","24.65"};
		f.write(s);
		f.write("Ashu");
		f.write("India");
		char ch[]={'t','u','v'};
		f.write(ch);
		f.flush();
		f.close();
	}
}

		