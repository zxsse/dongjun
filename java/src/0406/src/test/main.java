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
	private int z;    // private �� �ٷλ�� ���� �� ����.
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
		System.out.println("�θ��Դϴ�.");
	}
	public Parents() 
	{
		System.out.println("�θ� ����Ʈ ������ �Դϴ�.");
	}
	public Parents(int x, int y, int z)
	{
		this.setY(y);
		this.setZ(z);
		this.x = x;
		System.out.println("�θ� ������ �����ε�");
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
		super.prints(); // �θ�Ŭ�������մ� �޼ҵ� ȣ��
		System.out.println("�ڽ��Դϴ�."); // �������̵�
	}
	public Child() 
	{
		System.out.println("�ڽ� ����Ʈ ������ �Դϴ�."); //super()�����Ǿ��ִ�    <-����Ʈ ������
	}
	public Child(int x, int y, int z)
	{
		super(x,y,z); //��� (�θ� -> �ڽ�)
		System.out.println("�ڽ� ������ �����ε�");
		//�θ� Ŭ���� ������ ȣ���� ù�ٿ�
	}
}
class ChildOther extends Parents
{
	public int num;
	public ChildOther()
	{
		System.out.println("�ٸ� �ڽ� ����Ʈ ������");
	}
	public ChildOther(int x, int y, int z, int num)
	{
		super(x,y,z);
		this.num = num;
		System.out.println("�ٸ� �ڽ� ����Ʈ ������ �����ε�");
	}
	
}

	