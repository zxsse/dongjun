package score;

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		int mode = 0;
		
	
		Scanner scan = new Scanner(System.in);
		manager mana = new manager();
		do
		{
			menu();
			mode = scan.nextInt();
			
			switch(mode)
			{
				case 1 :// �л����� �߰� 
					//����
					System.out.print("�л� �̸��� �Է��ϼ���");
					String name = scan.next();
					System.out.print("�л� �г��� �Է��ϼ���");
					int grade = scan.nextInt();
					System.out.print("�л� �й��� �Է��ϼ���");
					int classNumber = scan.nextInt();
					System.out.print("�л� �й��� �Է��ϼ���");
					int number = scan.nextInt();
					System.out.print("�л� ������ �Է��ϼ���");
					int kor = scan.nextInt();
					System.out.print("�л� ������ �Է��ϼ���");
					int eng = scan.nextInt();
					System.out.print("�л� ������ �Է��ϼ���");
					int math= scan.nextInt();
					
					mana.addstudent(name,grade,classNumber,number,kor,eng,math);
									
					break;
				case 2 :// �л���������
					System.out.println("�л� �г��� �Է� :");
					int searchGrade = scan.nextInt();
					System.out.println("�л� �й��� �Է� :");
					int searchClassNumber = scan.nextInt();
					System.out.println("�л� ��ȣ�� �Է� :");
					int searchNumber = scan.nextInt();
					System.out.println("������ �л� �̸� : ");
					String modifyName = scan.next();
					System.out.println("������ �л� ����: ");
					int modifyKor = scan.nextInt();
					System.out.println("������ �л� ����: ");
					int modifyEng = scan.nextInt();
					System.out.println("������ �л� ����: ");
					int modifyMath = scan.nextInt();
					
			
					
					//����
					break;
				case 3 : //�л����� ���
					mana.printstudent();
					//����
					break;
				case 4 ://����
					System.out.println("���α׷� ����");
					break;
				default:
					System.out.println("���� �޴��Դϴ�.");
				
			}
			
		}
		while(mode != 4);
	}
	public static void menu()
	{
		System.out.println("------�޴�-----");
		System.out.println("1.�л� ���� �߰�");
		System.out.println("2.�л� ���� ����");
		System.out.println("3.�л����� ���");
		System.out.println("4.����");
		System.out.println("�޴��� �����ϼ���");
	}
	
	
	
	
}
