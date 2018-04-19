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
				case 1 :// 학생정보 추가 
					//구현
					System.out.print("학생 이름을 입력하세요");
					String name = scan.next();
					System.out.print("학생 학년을 입력하세요");
					int grade = scan.nextInt();
					System.out.print("학생 학반을 입력하세요");
					int classNumber = scan.nextInt();
					System.out.print("학생 학번을 입력하세요");
					int number = scan.nextInt();
					System.out.print("학생 국어을 입력하세요");
					int kor = scan.nextInt();
					System.out.print("학생 영어을 입력하세요");
					int eng = scan.nextInt();
					System.out.print("학생 수학을 입력하세요");
					int math= scan.nextInt();
					
					mana.addstudent(name,grade,classNumber,number,kor,eng,math);
									
					break;
				case 2 :// 학생정보수정
					System.out.println("학생 학년을 입력 :");
					int searchGrade = scan.nextInt();
					System.out.println("학생 학반을 입력 :");
					int searchClassNumber = scan.nextInt();
					System.out.println("학생 번호을 입력 :");
					int searchNumber = scan.nextInt();
					System.out.println("수정할 학생 이름 : ");
					String modifyName = scan.next();
					System.out.println("수정할 학생 국어: ");
					int modifyKor = scan.nextInt();
					System.out.println("수정할 학생 영어: ");
					int modifyEng = scan.nextInt();
					System.out.println("수정할 학생 수학: ");
					int modifyMath = scan.nextInt();
					
			
					
					//구현
					break;
				case 3 : //학생정보 출력
					mana.printstudent();
					//구현
					break;
				case 4 ://종료
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("없는 메뉴입니다.");
				
			}
			
		}
		while(mode != 4);
	}
	public static void menu()
	{
		System.out.println("------메뉴-----");
		System.out.println("1.학생 정보 추가");
		System.out.println("2.학생 정보 수정");
		System.out.println("3.학생정보 출력");
		System.out.println("4.종료");
		System.out.println("메뉴를 선택하세요");
	}
	
	
	
	
}
