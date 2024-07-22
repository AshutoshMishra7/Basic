import java.util.*;
class ArrayList_Iterator
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(7);
		al.add("Thala");
		al.add('a');
		al.add(null);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
