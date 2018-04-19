package test;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths();
	
	
		System.out.println(m.randomInt(100, 111));
		System.out.println(m.getAreaCircle(5));
		
		Test t1 = new Test();
		t1.num=10;
		Test t2 = new Test();
		t2.num=20;
		if(t1.equal(t1, t1))
			System.out.println("두 객체가 같음");
		else
			System.out.println("두 객체가 다름");
		
	}

}
interface MathInterface
{
	public final double pi = Math.PI;
	public int abs(int num); //정수 num의 절대값
	public double abs(double num); //실수 num의 절대값
	public int pow(int a, int b); //a의 b제곱
	public int randomInt(int a,int b); //a보다 크거나같고 b보다 작은 랜덤한 숫자를 생성
	public double getAreaCircle(int radius); //원의 넓이를 구하는 메소드
}

class Maths implements MathInterface
{

	@Override
	public int abs(int num) 
	{
		if(num > 0)
		{  
			num = -num;
		}
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public double abs(double num) 
	{
		if(num > 0)
		{  
			System.out.println(num);
		}
		else
			System.out.println(-num);
		return num;
	}

	@Override
	public int pow(int a, int b) 
	{
		int result = 1;
		for(int i = 1 ; i  < b ; i++)
			result = result *2;
		
		return result;
	}

	@Override
	public int randomInt(int a, int b) 
	{
		// TODO Auto-generated method stub
		return (int)(Math.random()*(b-a+1)+a);
		// 0*(b-a+1)<= r*(b-a+1)<(b-a+1)*1
		// 0<= r*(b-a+1)<(b-a+1)
		// a<= r*(b-a+1)+a < b-a+1+a
		// a<= r*(b-a+1)+a < b+1
	}

	@Override
	public double getAreaCircle(int radius) {
		// TODO Auto-generated method stub
		return radius * radius * pi;
	}
}





interface Basic
{
	public boolean equal(Object obj, Object ovj1);
	
}
class Test implements Basic
{

	Object num;
	@Override
	public boolean equal(Object obj, Object ovj1)
	{
		// TODO Auto-generated method stub
		if(((Test)obj).num == ((Test)obj).num)
		
			return true;
			else
				return false;
		}
		public Test( ) {}
		
		public boolean equal(Object obj)
		{
			// TODO Auto-generated method stub
			if(((Test)obj).num == this.num)
			
				return true;
				else
					return false;
		}

	
}