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
		if(num == 0) //특수한 경우
			return 1;
		else if(num ==1)  //재귀메소드를 빠져나가기 위한 조건
			return 1;
		else 
			return num * facRecursive(num-1);
		
	}
		
}
//재귀 메소드는 메소드안에서  자기 자신을 호출하는 경우