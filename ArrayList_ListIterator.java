import java.util.*;
class ArrayList_ListIterator
{
	public static void main(String args[])
	{
		ArrayList<Double>al=new ArrayList<Double>();
		al.add(12.55657d);
		al.add(89.987);
		al.add(12.00);
		al.add(1.2354);
		ListIterator itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("=================");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
