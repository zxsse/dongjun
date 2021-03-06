package study.set.ex1;

import java.util.HashSet;



public class SetMain 
{

	/*  Set에서는 중복 검사를 하는데
	 *  1. hashcode가 같으지 확인하여 다르면 다른객체로 저장
	 *  2. hashcode가 같으면 equals메소드의 결과가 같은지를 확인하여 같으면 죽복으로 처리,다르면 다른객체로 저장
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
    	if(obj != null && obj instanceof Number) //instanceof 형변환이가능한지
		{										 //Null 값이면 형변환해도 볼값이없어서 null이아니여야함
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
