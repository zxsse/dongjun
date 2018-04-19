package Study.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;



public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		for(int i=0 ; i<al.size();i++)
		{
			System.out.println(al.get(i));  //값가져올때
		}
		int num = al.remove(1); //해당하는값을 제거 할 때
		System.out.println("------------");
		for(int i=0 ; i<al.size();i++)
		{
			System.out.println(al.get(i));  //해당하는 번지의 값지우기
		}
		LinkedList<Integer> ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println("------------");
		for(int i=0 ; i<ll.size();i++)
		{
			System.out.println(ll.get(i));  //해당하는 번지의 값지우기
		}
		
		/*Vector<Integer> v = new Vector();*/
		//v.capacity();  벡터는 capacity값을확인가능
		//v.size(); 실제 배열에들어잇는 값
		Iterator<Integer> it = ll.iterator();
	      while(it.hasNext()) 
	      {
	         int i = (Integer)it.next();
	         System.out.println(i);
	      }
		
		
		
	}
}
	
