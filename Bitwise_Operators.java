class Omm
{
	private int x,y;
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	public void hello()
	{
		int z=x&y;
		System.out.println("Bitwise and"+ z);
	}
	public void hello2()
	{
		int z=x|y;
		System.out.println("Bitwise or"+z);
	}
	public void hello3()
	{
		int z=x^y;
		System.out.println("Bitwise Exclusive OR XOR"+ z);
	}
}
class Bitwise_Operators
{
	public static void main(String args[])
	{
		Omm op=new Omm();
		op.setx(24);
		op.getx();
		op.sety(33);
		op.gety();
		op.hello();
		op.hello2();
		op.hello3();
	}
}
