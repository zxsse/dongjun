package study.list.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> alist=new ArrayList();
		alist.add(100);
		alist.add(40);
		alist.add(5);
		alist.add(1000);
		
		for(int i =0; i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		System.out.println("---------");
		
		
		
		
		alist.remove(0);   //0 ��° ������ �׷��� add 100�� ��������.
		
		
		
		
		Iterator it = alist.iterator();
		//������ġ -> 100 , 40 ,5 ,1000 �ݺ��ڸ�������ش�.
		while(it.hasNext())
		{
			int num = (Integer)it.next(); // ��ġ�� ������ġ�� �ٲ�� �ش��ϴ°��� �Ѱ���� 
			System.out.println(num);   // 100 ->40 ,5,1000
			
		}
		System.out.println("-----------");
		for(Integer tmp : alist)  //�������� ���� :���������Ҽ�����.
		{
			System.out.println(tmp);
		}
	}

}
class Student
{
	String name;
	int grade;
	int classNum;
}