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
		{ //예외가 발생할 수 있는 코드
			div(1,1);
			int cnt = count(arr,6,0);
		}
		catch(ArithmeticException ae/*생성된 예외 객체*/ /* ArithmeticException 은 나누기 0되는애들만 받음*/)
		{//예외 메세지 출력
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("배열 번지 접근 에러 : " + ie.getMessage());
		}
		catch(NullPointerException ne)
		{
			System.out.println("Nullpointer 예외 : ");
		}
		catch(Exception e)
		{
			System.out.println("모든 예외를 처리 :" + e.getMessage());
		}
		finally
		{ //예외 처리가 끝난 후 무조건 실행되는 코드
			System.out.println("무조건 출력");
		}
	}	
	public static int div(int a, int b)	throws ArithmeticException //무슨예외인지알려주는문장
		{
			if(b == 0)
				throw new ArithmeticException("0으로 나눌수 없습니다."); //문자열을 멤버변수에저장 (생성자를 통해서) 예외가 발생하면 try,catch문으로 가라
			return a/b;
		}
	public static int count(int []arr, int size , int num)
	{
		int cnt = 0;
		for(int i = 0; i<size ; i++)
		{
			if(i>= arr.length)
				throw new ArrayIndexOutOfBoundsException("배열의 크기 이상인 번지에 접근불가");
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