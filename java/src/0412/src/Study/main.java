package Study;

public class main 
{

	public static void main(String[] args) 
	{	
		int [] arr = new int [5];
		int res = 0; 
		
		A a = new A();
		
	
		// TODO Auto-generated method stub
		try 
		{ //���ܰ� �߻��� �� �ִ� �ڵ�
			div(1,1);
			int cnt = count(arr,6,0);
		}
		catch(ArithmeticException ae/*������ ���� ��ü*/ /* ArithmeticException �� ������ 0�Ǵ¾ֵ鸸 ����*/)
		{//���� �޼��� ���
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("�迭 ���� ���� ���� : " + ie.getMessage());
		}
		catch(NullPointerException ne)
		{
			System.out.println("Nullpointer ���� : ");
		}
		catch(Exception e)
		{
			System.out.println("��� ���ܸ� ó�� :" + e.getMessage());
		}
		finally
		{ //���� ó���� ���� �� ������ ����Ǵ� �ڵ�
			System.out.println("������ ���");
		}
	}	
	public static int div(int a, int b)	throws ArithmeticException //�������������˷��ִ¹���
		{
			if(b == 0)
				throw new ArithmeticException("0���� ������ �����ϴ�."); //���ڿ��� ������������� (�����ڸ� ���ؼ�) ���ܰ� �߻��ϸ� try,catch������ ����
			return a/b;
		}
	public static int count(int []arr, int size , int num)
	{
		int cnt = 0;
		for(int i = 0; i<size ; i++)
		{
			if(i>= arr.length)
				throw new ArrayIndexOutOfBoundsException("�迭�� ũ�� �̻��� ������ ���ٺҰ�");
			if(arr[i] == num)
				cnt++;
		}
		return cnt;
	}
}
class A
{
	int[] arr;
	void count()
	{
		arr[0] = 10;
	}
}