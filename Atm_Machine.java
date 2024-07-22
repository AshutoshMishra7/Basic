import java.util.Scanner;
class Atm
{
	public void hello()
	{
		double balance=50000.67d;
		double withdrawl,rem;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter withdrawl amount...");
		withdrawl=so.nextDouble();
		
		try
		{
			if(balance<rem)
			throw new Exception("Insufficient Balance..Don't be oversmart");
		rem=balance-withdrawl;
			System.out.println(" Remaining Blance:"+"\n"+balance+"-"+withdrawl+"="+rem);
			System.out.println("Transaction Completed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Have a good day");
	}
}
class Atm_Machine
{
	public static void main(String args[])
	{
		Atm ao=new Atm();
		ao.hello();
	}
}

	
			
				