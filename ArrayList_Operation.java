import java.util.*;
class ArrayList_Operation
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(786);
		al.add(678);
		al.add("Ram");
		al.add(null);
		for(Object y:al)
		{
			System.out.println(y);
		}
		al.add(1,"Jay");
		System.out.println(al);
		System.out.println("Size:"+al.size());
		al.remove(0);
		al.remove(null);
		ListIterator itr=al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==============");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}

		