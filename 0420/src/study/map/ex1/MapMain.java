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
		tm.put(1, "�赿��");
		tm.put(2, "�赿��");
		tm.put(3, "�赿��");
		tm.put(4, "������");  //key���� ���� ������ ��ġ�� �ȵ�
		
		Iterator<Map.Entry<Integer, String>> it = tm.entrySet().iterator(); //map�� �÷����� �ƴϱ⶧���� set���� ���¸� ��ȯ���ذ��̴� 
		
		while(it.hasNext())
		{
			
			Map.Entry<Integer, String>
			tmp = it.next(); //ó��
			System.out.print("key :"+tmp.getKey());
			System.out.println(", value : "+ tmp.getValue());
		}
		System.out.println("-----------");
		for(Integer tmp : tm.keySet())  //���� for������ keyset���� �������� (key������ �̷���� set)
		{
			System.out.print("key :"+tmp);
			System.out.println(", value : "+ tm.get(tmp));
		}
	}

}