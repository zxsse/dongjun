package study.set.ex1;

import java.util.HashSet;



public class SetMain 
{

	/*  Set������ �ߺ� �˻縦 �ϴµ�
	 *  1. hashcode�� ������ Ȯ���Ͽ� �ٸ��� �ٸ���ü�� ����
	 *  2. hashcode�� ������ equals�޼ҵ��� ����� �������� Ȯ���Ͽ� ������ �׺����� ó��,�ٸ��� �ٸ���ü�� ����
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(10);
		for(Integer tmp : hs)
		{
			System.out.println(tmp);
		}
		System.out.println("------------");
		hs.add(new Integer(10));
		hs.add(new Integer(10));
		hs.add(new Integer(10));
		for(Integer tmp : hs)
		{
			System.out.println(tmp);
		}
		HashSet<Number> nhs = new HashSet<Number>();
		nhs.add(new Number(10,10));
		nhs.add(new Number(10,10));
		nhs.add(new Number(10,10));
		for(Number tmp : nhs)
		{
			System.out.println(tmp);
		}
	}

}

class Number
{
	int num1;
	int num2;
    Number(int num1, int num2)
	{
		this.num1 =num1;
		this.num2 =num2;
	}
    @Override
    public int hashCode()
    {
    	return (num1+num2)%3;
    }
    @Override
    public boolean equals(Object obj)
    {
    	if(obj != null && obj instanceof Number) //instanceof ����ȯ�̰�������
		{										 //Null ���̸� ����ȯ�ص� �����̾�� null�̾ƴϿ�����
		    Number tmp = (Number)obj; 
	          if(this.num1 == tmp.num1 && this.num2 == tmp.num2)
	      	return true;
    	
		}
    	return false;
    }	
    @Override
    public String toString()
    {
    	super.toString();
    	return "[ num1 :"+ num1 + ", num2 :" + num2 + "]";
    }
}