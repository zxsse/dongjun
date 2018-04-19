package test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		Child c2 = new Child(1,2,3);
		
		ChildOther co = new ChildOther();
		ChildOther co2 = new ChildOther(4,3,2,1);
		
		
		System.out.println("Child x: " + c2.x);
		System.out.println("Child x: " + c2.getY());
		System.out.println("Child x: " + c2.getZ());
		
		System.out.println("ChildOther x: " + co2.x);
		System.out.println("ChildOther x: " + co2.getY());
		System.out.println("ChildOther x: " + co2.getZ());
		System.out.println("ChildOther x: " + co2.num);
	}

}
class Parents
{
	public int x;
	protected int y;
	private int z;    // private 는 바로상속 받을 수 없다.
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public void prints()
	{
		System.out.println("부모입니다.");
	}
	public Parents() 
	{
		System.out.println("부모 디폴트 생성자 입니다.");
	}
	public Parents(int x, int y, int z)
	{
		this.setY(y);
		this.setZ(z);
		this.x = x;
		System.out.println("부모 생성자 오버로딩");
	}

}

class Child extends Parents
{
	public void print()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(getZ());
		
	}
	@Override
	public void prints()
	{
		super.prints(); // 부모클래스에잇는 메소드 호출
		System.out.println("자식입니다."); // 오버라이딩
	}
	public Child() 
	{
		System.out.println("자식 디폴트 생성자 입니다."); //super()생략되어있다    <-디폴트 생성자
	}
	public Child(int x, int y, int z)
	{
		super(x,y,z); //상속 (부모 -> 자식)
		System.out.println("자식 생성자 오버로딩");
		//부모 클래스 생성자 호출은 첫줄에
	}
}
class ChildOther extends Parents
{
	public int num;
	public ChildOther()
	{
		System.out.println("다른 자식 디폴트 생성자");
	}
	public ChildOther(int x, int y, int z, int num)
	{
		super(x,y,z);
		this.num = num;
		System.out.println("다른 자식 디폴트 생성자 오버로딩");
	}
	
}

	