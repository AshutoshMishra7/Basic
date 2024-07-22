import java.util.*;
class HashSet1
{
	public static void main(String args[])
	{
		HashSet h=new HashSet();
		h.add(1);
		h.add(2);
		h.add(7);
		h.add("Thala");
		for(Object y:h)
		{
			System.out.println(y);
		}
	}
}
