import java.io.*;
class BufferedWriter1
{
	public static void main(String args[])throws Exception
	{
		File f=new File("Buffer.txt");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		FileWriter f1=new FileWriter("Buffer.txt");
		BufferedWriter b=new BufferedWriter(f1);
		b.write(65);
		b.newLine();
		b.write("65");
		b.newLine();
		b.write("Happy Raja Primitive Humans");
		b.newLine();
		b.write("Ashu");
		b.newLine();
		b.write("12.69f");
		b.newLine();
		char ch[]={'A','b','C'};
		b.write(ch);
		b.flush();
		b.close();
	}
}
