package test.objectTest;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(5));
	}
		public static int fac(int num)
		 {
			 if(num ==0 )
			 return 1;
			 else 
			 {
				 int res = 1;
				 for (int i =2; i<num; i++)
					 res *= i;
				 return res;
			 }
		 }
	public static int facRecursive(int num)
	{
		if(num == 0) //Ư���� ���
			return 1;
		else if(num ==1)  //��͸޼ҵ带 ���������� ���� ����
			return 1;
		else 
			return num * facRecursive(num-1);
		
	}
		
}
//��� �޼ҵ�� �޼ҵ�ȿ���  �ڱ� �ڽ��� ȣ���ϴ� ���