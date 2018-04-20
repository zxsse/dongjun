package study.student.collection;

import java.util.HashSet;
import java.util.Scanner;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		sm.insert(new Student( "�赿��", 1, 1, 1,1.0,2.0,3.0));  //�߰�
		sm.print();
		
		System.out.println("-----------");
		sm.deleate(new Student("�赿��",1,1,1,1.0,2.0,3.0)); // �����
		sm.print();
		
		System.out.println("-----------");
		sm.modify(new Student( "�赿��", 1, 1,3,1.0,2.0,3.0)); //����
		sm.print();
		
		Student std = new Student("�赿��", 1,1,1, 0, 0, 0);
		std.setClassNumber(5).setGrade(1).setName("�赿��").setNumber(3).setKor(80).setEng(95).setMath(100);
		//System.out.println(std);
		
		
		Student std1 = new Student("������", 1, 1,2,1, 0, 0);
		std1.setClassNumber(6).setGrade(1).setName("������").setNumber(3).setKor(80).setEng(95).setMath(100);
		//System.out.println(std1);
		
		HashSet<Student> hs = new HashSet();
		hs.add(std);
		hs.add(std1);
		for(Student tmp : hs)
		{
			System.out.println(tmp);
		}
		
		std.printStudent();
	
		StudentManager stdm = new StudentManager();
		
		
		stdm.print();
		while(true)
		{
			Scanner scan = new Scanner(System.in);
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
					stdm.insert(new Student(name, grade, classNumber, number, kor, eng, math));
					
				}
				else if(menu == 2)
				{
					
					System.out.print("�г� :");
					int grade3 = scan.nextInt();
					System.out.print("�й� :");
					int classNumber3 = scan.nextInt();
					System.out.print("��ȣ :");
					int number3 = scan.nextInt();
					System.out.print("�̸� :");
					String name3 = scan.next();
					System.out.print("���� :");
					int kor3 = scan.nextInt();
					System.out.print("���� :");
					int eng3 = scan.nextInt();
					System.out.print("���� :");
					int math3 = scan.nextInt();
					stdm.deleate(new Student(name3, grade3, classNumber3, number3, kor3, eng3, math3));
				}
				
				else if(menu == 3)
				{
					stdm.print();
				}
					
				else if(menu == 4) 
				{
					System.out.print("�г� :");
					int grade4 = scan.nextInt();
					System.out.print("�й� :");
					int classNumber4 = scan.nextInt();
					System.out.print("��ȣ :");
					int number4 = scan.nextInt();
					System.out.print("�̸� :");
					String name4 = scan.next();
					System.out.print("���� :");
					int kor4 = scan.nextInt();
					System.out.print("���� :");
					int eng4 = scan.nextInt();
					System.out.print("���� :");
					int math4 = scan.nextInt();
					stdm.deleate(new Student(name4, grade4, classNumber4, number4, kor4, eng4, math4));
				}
				
				
				
				else if(menu == 5) 
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
		
		
		
	}
	public static void printMenu()
		{
			System.out.println("---------");
			System.out.println("�޴�");
			System.out.println("1.�л����� �߰�");
			System.out.println("2.�л����� ����");
			System.out.println("3.�л����� ���");
			System.out.println("4.���� ");
			System.out.println("5.���� ");
			System.out.println("-----------");
			System.out.print("�޴� ����:");
		}
	

	}