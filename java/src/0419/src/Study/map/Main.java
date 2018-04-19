package Study.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap=new TreeMap();
		tmap.put(1, "HI");
		tmap.put(2, "Hello");
		tmap.put(3, "Hello");
		
		Iterator it = tmap.entrySet().iterator(); //hashset 이나 array일 때 사용 collection프레임워크
		while(it.hasNext())
		{
			Map.Entry<Integer, String>
			map = (Map.Entry<Integer, String>)
			it.next();
			String value = map.getValue();
			int key = map.getKey();
			System.out.print("key : " + key);
			System.out.println(", value :" + value);
			
		}
			Stack<Integer> stack =new Stack();
			for(int i =0; i<10 ; i++)
			{
				stack.push(i);
			}
			while(!stack.isEmpty())
			{
				System.out.println(stack.pop()+" ");
			}
	}

}
