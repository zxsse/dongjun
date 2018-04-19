package Study.Memo;

import java.util.PriorityQueue;

public class memo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = String.valueOf(100);
		int a = Integer.parseInt(s);
		PriorityQueue pq =new PriorityQueue
				( 
						new Comparator 
						{
							@Override
							public int compare(Object o1,Object o2)
							{
								if(o1 instanceof Integer && o2 instanceof)
								return 0;
							}
						}
				)
	}

}
/*  자료형--> 클래스가 되는것 래퍼클래스
 * 	int > Integer
 * 	byte> Byte
 * ?        
 */
class A
{
	Object Test(Object obj)
	{
		return obj;
	}
	int Test(int obj)
	{
		return obj;
	}
}