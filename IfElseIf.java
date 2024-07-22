import java.util.Scanner;
class Ashu
{
	public void hello()
	{
		char ch;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter Any Alphabet");
		ch=so.next().charAt(0);
		if(ch =='a'||ch=='A')
		{
			System.out.println(ch+" Is a Vowel");
		}
		else if(ch=='e'||ch=='E')
		{
			System.out.println(ch+" Is a Vowel");
		}
		else if(ch=='i'||ch=='I')
		{
			System.out.println(ch+" Is a Vowel");
		}
		else if(ch=='o'||ch=='O')
		{
			System.out.println(ch+" Is a Vowel");
		}
		else if(ch=='u'||ch=='U')
		{
			System.out.println(ch+" Is a Vowel");
		}
		else
		{
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.println(ch+" is a consonant");
			}
			else
			{
				System.out.println("Wrong input...Enter Any Alphabet");
			}
		}
	}
}
class IfElseIf
{
	public static void main(String args[])
	{
		Ashu ao=new Ashu();
		ao.hello();
	}
}

		