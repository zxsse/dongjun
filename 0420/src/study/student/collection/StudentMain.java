package study.student.collection;

import java.util.HashSet;
import java.util.Scanner;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudentManager sm = new StudentManager();
		sm.insert(new Student( "김동준", 1, 1, 1,1.0,2.0,3.0));  //추가
		sm.print();
		
		System.out.println("-----------");
		sm.deleate(new Student("김동준",1,1,1,1.0,2.0,3.0)); // 지우기
		sm.print();
		
		System.out.println("-----------");
		sm.modify(new Student( "김동준", 1, 1,3,1.0,2.0,3.0)); //수정
		sm.print();
		
		Student std = new Student("김동준", 1,1,1, 0, 0, 0);
		std.setClassNumber(5).setGrade(1).setName("김동준").setNumber(3).setKor(80).setEng(95).setMath(100);
		//System.out.println(std);
		
		
		Student std1 = new Student("임정윤", 1, 1,2,1, 0, 0);
		std1.setClassNumber(6).setGrade(1).setName("임정윤").setNumber(3).setKor(80).setEng(95).setMath(100);
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
					System.out.print("이름 :");
					String name = scan.next();
					System.out.print("학년 :");
					int grade = scan.nextInt();
					System.out.print("학반 :");
					int classNumber = scan.nextInt();
					System.out.print("번호 :");
					int number = scan.nextInt();
					System.out.print("국어 :");
					int kor = scan.nextInt();
					System.out.print("영어 :");
					int eng = scan.nextInt();
					System.out.print("수학 :");
					int math = scan.nextInt();
					stdm.insert(new Student(name, grade, classNumber, number, kor, eng, math));
					
				}
				else if(menu == 2)
				{
					
					System.out.print("학년 :");
					int grade3 = scan.nextInt();
					System.out.print("학반 :");
					int classNumber3 = scan.nextInt();
					System.out.print("번호 :");
					int number3 = scan.nextInt();
					System.out.print("이름 :");
					String name3 = scan.next();
					System.out.print("국어 :");
					int kor3 = scan.nextInt();
					System.out.print("영어 :");
					int eng3 = scan.nextInt();
					System.out.print("수학 :");
					int math3 = scan.nextInt();
					stdm.deleate(new Student(name3, grade3, classNumber3, number3, kor3, eng3, math3));
				}
				
				else if(menu == 3)
				{
					stdm.print();
				}
					
				else if(menu == 4) 
				{
					System.out.print("학년 :");
					int grade4 = scan.nextInt();
					System.out.print("학반 :");
					int classNumber4 = scan.nextInt();
					System.out.print("번호 :");
					int number4 = scan.nextInt();
					System.out.print("이름 :");
					String name4 = scan.next();
					System.out.print("국어 :");
					int kor4 = scan.nextInt();
					System.out.print("영어 :");
					int eng4 = scan.nextInt();
					System.out.print("수학 :");
					int math4 = scan.nextInt();
					stdm.deleate(new Student(name4, grade4, classNumber4, number4, kor4, eng4, math4));
				}
				
				
				
				else if(menu == 5) 
				{
					System.out.println("----------");
					System.out.println("프로그램 종료");
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
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 출력");
			System.out.println("4.삭제 ");
			System.out.println("5.종료 ");
			System.out.println("-----------");
			System.out.print("메뉴 선택:");
		}
	

	}
