package Study.LottoHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main
{

	public static void main(String[] args)
	{	
		int min = 1;
		int max = 6;
	
		
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() < 6)
		{
			int num = (int)(Math.random()*(max-min+1)+min);
			hs.add(num);
		}
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println((Integer)it.next());
		}
	}

}
