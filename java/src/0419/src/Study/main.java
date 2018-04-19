package Study;

public class main
{

	public static void main(String[] args) 
	{
			A a = new A(10,20);
			A a1 = (A)a.clone(); // A�� Object�⶧���� ����ȯ�� �ؾ��Ѵ�.
			//Ŭ����A�� ��� a : 0~ 10000���� ����
			//���� Ŭ���� A�� ������ ��ü�� 10������  
			System.out.println(a.equals(a1));
			a.hashCode();
			a1.a =30;
			System.out.println(a);
			System.out.println(a.toString()); //ȣ���Ҵ� �̷��� ȣ��
			
			
	}	
}
class A implements Cloneable   //clone�� �����Ű���� �������̽��� �߰����Ѿ��Ѵ�.
{
	int a;
	int b;
	A(int a, int b)
	{
		this.a =a;
		this.b =b;

	
	

	}

	@Override
	public boolean equals(Object obj) //���ڿ� ��
	{	
		if(obj != null && obj instanceof A) //instanceof ����ȯ�̰�������
		{	//����ȯ (A)���ؾ�����Ѵ�. ()�� .���� �켱������ ����
		    A tmp = (A)obj;
	          if(this.a == tmp.a && this.b == tmp.b);
	      	return true;
		}
		return false;
	}	
	@Override
	public int hashCode()   // �ؽ��±װ�������(������)
	{	//a : 0~10000���� ����
		return a%100;
	}
	public String toString()
	{
		return this.getClass().getName()+"@"+Integer.toHexString(this.hashCode());
	}
	
	public Object clone() //�����ϴ� �޼���
	{
		Object obj = null;
		try 
		{
			obj=super.clone();  //���ܰ� �߻� �� �� �־ 
		} catch (CloneNotSupportedException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return obj;
	}
}