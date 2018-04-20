package study.chainnig;

public class ChainningMain 
{
	/* 일반적으로 클래스의 멤버 변수들을 설정할 때 사용하고 형태는
	 * biild.setNum1(100).setNum2(200).setNum3(300)
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Number num = new Number();
		num.setNum1(100).setNum2(200).setNum3(300);
		System.out.println(num.getNum1());
		System.out.println(num.getNum2());
		System.out.println(num.getNum3());
		
		num.printNums();
		
		System.out.println(num);
	}

}

class Number
{
	int num1;
	int num2;
	int num3;
	Number setNum1(int num1)
	{
		this.num1 = num1;
		return this;  //자기자신
	}
	Number setNum2(int num2)
	{
		this.num2 = num2;
		return this;
	}
	Number setNum3(int num3)
	{
		this.num3 = num3;
		return this;
	}

	int getNum1()
	{
		return num1;
	}
	int getNum2()
	{
		return num2;
	}
	int getNum3()
	{
		return num3;
	}
	
	void printNums()
	{
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}
	
	@Override
	public String toString()
	{
		return "[num1 : "+ num1 + ", num2 : "+ num2 +", num3 :" + num3 +"]";
	}
	
}