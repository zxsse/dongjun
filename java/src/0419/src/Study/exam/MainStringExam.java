package Study.exam;

import java.util.Scanner;

public class MainStringExam 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i ;
		String s = "�ȳ��ϼ���. ���� �赿�� �Դϴ�. �ߺ�Ź�帳�ϴ�.";
		String[] sp = s.split("\\."); 
		for( i =0; i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		System.out.println("�����ǰ���: " + i);
		
		
		
		
		
		
		
		
		
		/*String s = "example.mp4";
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		
		if(s.endsWith("mp4") || s.endsWith("wmv") || s.endsWith("avi"))
		{
			System.out.println("������ �����̴�.");
		}
		else 
		{
			System.out.println("�������̾ƴϴ�");
		}*/
		
		
		
		
		/*System.out.println(s.endsWith("mp4"));
		System.out.println(s.endsWith("wmv"));
		System.out.println(s.endsWith("avi"));
		
		System.out.println(s.indexOf("mp4"));
		System.out.println(s.indexOf("wmv"));
		System.out.println(s.indexOf("avi"));
		*/
	}

}