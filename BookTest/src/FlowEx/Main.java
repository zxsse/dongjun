package FlowEx;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in); //ȭ���� ���ؼ� �Է¹���  ���ڸ� user�� ����
		
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1; // 1,2,3 �� �ϳ��� com�� �����
		
		System.out.println("����� " + user + "�Դϴ�");
		System.out.println("����" + com + " �Դϴ�"); 
		
		switch(user-com)
		{
			case 2: case -1 :
				System.out.println("����� �����ϴ�");
				break;
			case 1 : case -2 :
				System.out.println("����� �̰���ϴ�");
				break;
			case 0 :
				System.out.println("�����ϴ�.");
				break;
		}
		
		
	}

}
