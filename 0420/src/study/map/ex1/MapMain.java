package study.map.ex1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapMain 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1, "김동준");
		tm.put(2, "김동준");
		tm.put(3, "김동준");
		tm.put(4, "임정윤");  //key값에 따라 나오고 겹치면 안됨
		
		Iterator<Map.Entry<Integer, String>> it = tm.entrySet().iterator(); //map은 컬렉션이 아니기때문에 set으로 형태를 변환해준것이다 
		
		while(it.hasNext())
		{
			
			Map.Entry<Integer, String>
			tmp = it.next(); //처리
			System.out.print("key :"+tmp.getKey());
			System.out.println(", value : "+ tmp.getValue());
		}
		System.out.println("-----------");
		for(Integer tmp : tm.keySet())  //향상된 for문으로 keyset으로 가져오기 (key값으로 이루어진 set)
		{
			System.out.print("key :"+tmp);
			System.out.println(", value : "+ tm.get(tmp));
		}
	}

}
