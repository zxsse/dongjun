package Study.collection.ex;

import java.util.HashSet;
import java.util.Iterator;

public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println((Integer)it.next());
		}
	}
}
