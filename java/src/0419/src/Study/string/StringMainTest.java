package Study.string;

import java.util.Scanner;

public class StringMainTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s= "Hello World";
		System.out.println(s.charAt(0));//���ϴ¹����� ���� Ȯ���ϰ����� ��
		
		/*
		Scanner scan = new Scanner(System.in); //���� �Է¹��� ��
		char op = scan.next().charAt(0); //���ڿ� �ϳ�������(�ַ� Scanner�� ������� ��)
		*/
		
		s = s + "!"; //concat()�޼ҵ�� �����ѵ����� (�̾���̱�)
		System.out.println(s);
		
		System.out.println(s.contains("Hello")); //contains�� ���ڿ��� ���ԵǾ��ִ��� Ȯ��  true�Ǵ� false
		
		s= "Hello.txt";
		System.out.println(s);
		System.out.println(s.endsWith("txt")); //�ش繮�ڿ��� �������� Ȯ�� true �Ǵ� false
		System.out.println(s.equals("Hello.txt")); //�ڵ������� �ش��ϴ� ���ڿ��� ���� �� ������ �����ɷ� �ٸ��� �ٸ��ŷ� ���
		System.out.println(s.indexOf('H'));
		System.out.println(s.indexOf('A'));//�ش��ϴ� ���ڰ������ϴ���Ȯ���� ������ -1 
		int [] arr = new int[4];
		int a = arr.length; //�迭���� ����
		 a = s.length();//�޼ҵ� �����Ǳ��� 
		s = "https://search.naver.com/search.naver?where=nexearch&query=%C7%C1%B8%AE%B9%CC%BE%EE%B8%AE%B1%D7&sm=tab_etc";
		String[] sp = s.split("/"); //��ū�����̷� ���ڿ� ���� (�׷��� �迭)���ڿ� ¥���� ���� ��
		for(int i =0; i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		s = "Hello";
		System.out.println(s.substring(0,2)); //0�������� 2��������©�� �־�� �׷��� He�̷��Գ���
		s = String.valueOf(100);
		s = String.valueOf('a');
		A a1 = new A();
		s = String.valueOf(a1);
		System.out.println(s); //��ü���Ѱ��ָ� �ش��ϴ� Ŭ������ toString �޼��尡 ������
		StringBuffer sb= new StringBuffer("012345");
		System.out.println(sb.length()); //����
		System.out.println(sb.capacity()); //����ũ��
		System.out.println(sb.delete(0, 2)); // ���ڿ� ����°� 
		System.out.println(sb.insert(4, "a")); 
		
		System.out.println(sb.reverse()); //�Ųٷ� ���
		
	}

}
class A{}