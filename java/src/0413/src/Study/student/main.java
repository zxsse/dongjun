package Study.student;

import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{
		/* 1. StudentŬ������ ��ü s�� new �����ڸ� ���� ���� �� ��  �Ű�������
		 * 		�̸�,�г�,��,��ȣ,����,����,������ �Ѱ��ش�	
		 * 2. ��ü s������ �������� print() �޼ҵ� ȣ���Ͽ� ����� Ȯ��
		 * 3. ��ü s�� ���� ��������  modifyStudent �޼ҵ带  ȣ���Ͽ� ������ �����ϴµ�
		 * 	    �Ű������� �̸�,�г�,�� ,����,����,������ �Ѱ��ش�.	
		 * 4. ��üs�� ���ظ������� print()�޼ҵ�  ȣ���Ͽ� ���Ȯ��
		 */
		
		/*Student s = new Student("�赿��", 2, 5, 3, 85.3, 92, 88.3);
		s.printStudent();
		//3	
		s.modifyStudent("�ڰ���", 2, 3, 23, 42, 35, 60);
		System.out.println("���� ���� ��");
		//4
		s.printStudent();
		
		/* 1.StudentManagerŬ������ ��ü(sm)�� �����ϴµ�
		 * 	 �л��� ������ 10�� �����ϵ��� ���Ը� ����
		 * 2.�л��� �Ѹ��� ������ ��ü sm�� ������ �ִ�
		 * 	 insert�޼ҵ带 �̿��Ͽ� ����
		 * 3.�л����� ������ ��ü sm�� �������ִ� print
		 * 	 �޼ҵ带�����Ͽ� ���
		 *  4.1�г� 1�� 10�� �̻������� ����� ����ϴ� �ڵ� �ۼ�
		 * 	 	��ü sm�� searchIndex�޼ҵ�� System.out.println �޼ҵ带 �̿��Ͽ� �ش��ϴ� �������
		 */
		
		
		/*StudentManager sm = new StudentManager(10);
		sm.insert("������", 1, 2, 20, 40, 50, 35);
		System.out.println("���� �߰�"); 
		sm.print();
		System.out.println(sm.searchIndex(1, 2, 20)+"����");  //4
		
		System.out.println("������");
		
		sm.modify(1, 2, 20, "������" , 90, 68, 70);
		sm.print();
		s.modifyStudent("�ڰ���", 2, 3, 23, 82, 75, 95);
		s.printStudent();*/
		
		/* 1. �޴��� ����ϴ� �޼ҵ�
		 * 1.1 �Ű����� :����
		 * 1.2 ����Ÿ�� :����
		 * 1.3 �޼ҵ�� :printMenu
		 * 1.4����: �Ʒ��Ͱ������ System.out.println()�̿�
		 * �޴�
		 * 1.�л����� �߰�
		 * 2.�л����� ����
		 * 3.�л��������
		 * 4.����
		 */
		
		Scanner scan = new Scanner(System.in);
		StudentManager sm = new StudentManager(10);
		
		while(true)
		{
			
			printMenu();
			int menu = scan.nextInt();
			try 
			{
				if(menu ==1) 
				{
					System.out.print("�̸� :");
					String name = scan.next();
					System.out.print("�г� :");
					int grade = scan.nextInt();
					System.out.print("�й� :");
					int classNumber = scan.nextInt();
					System.out.print("��ȣ :");
					int number = scan.nextInt();
					System.out.print("���� :");
					int kor = scan.nextInt();
					System.out.print("���� :");
					int eng = scan.nextInt();
					System.out.print("���� :");
					int math = scan.nextInt();
					sm.insert(name, grade, classNumber, number, kor, eng, math);
					
				}
				else if(menu == 2)
				{
					
					System.out.print("�г� :");
					int grade = scan.nextInt();
					System.out.print("�й� :");
					int classNumber = scan.nextInt();
					System.out.print("��ȣ :");
					int number = scan.nextInt();
					System.out.print("�̸� :");
					String name = scan.next();
					System.out.print("���� :");
					int kor = scan.nextInt();
					System.out.print("���� :");
					int eng = scan.nextInt();
					System.out.print("���� :");
					int math = scan.nextInt();
					sm.modify(grade, classNumber, number, name, kor, eng, math);
				}
				
				else if(menu == 3)
				{
					sm.print();
				}
					
				else if(menu == 4) 
				{
					System.out.println("----------");
					System.out.println("���α׷� ����");
					System.out.println("---------");
					break;
			
				}
			}
			catch(Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		
		scan.close();	
		
	}
	public static void printMenu()
		{
			System.out.println("---------");
			System.out.println("�޴�");
			System.out.println("1.�л����� �߰�");
			System.out.println("2.�л����� ����");
			System.out.println("3.�л����� ���");
			System.out.println("4.���� ");
			System.out.println("-----------");
			System.out.print("�޴� ����:");
		}
	
} 
