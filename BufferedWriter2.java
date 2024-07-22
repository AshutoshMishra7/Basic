import java.io.*;
class BufferedWriter2
{
	public static void main(String args[])throws Exception
	{
		FileWriter f=new FileWriter("Buffer.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write(66);
		b.newLine();
		b.write("66");
		b.newLine();
		b.write("Ok Tested");
		b.newLine();
		b.write("87.98f");
		b.newLine();
		char ch[]={'a','b','c'};
		b.write(ch);
		b.flush();
		b.close();
	}
}
