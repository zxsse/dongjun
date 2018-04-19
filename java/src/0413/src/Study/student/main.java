package Study.student;

import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{
		/* 1. Student클래스의 객체 s를 new 연산자를 통해 생성 할 때  매개변수로
		 * 		이름,학년,반,번호,국어,영어,수학을 넘겨준다	
		 * 2. 객체 s를통해 만들어놓은 print() 메소드 호출하여 결과를 확인
		 * 3. 객체 s를 통해 만들어놓은  modifyStudent 메소드를  호출하여 정보를 수정하는데
		 * 	    매개변수로 이름,학년,반 ,국어,영어,수학을 넘겨준다.	
		 * 4. 객체s를 통해만들어놓은 print()메소드  호출하여 결과확인
		 */
		
		/*Student s = new Student("김동준", 2, 5, 3, 85.3, 92, 88.3);
		s.printStudent();
		//3	
		s.modifyStudent("박가연", 2, 3, 23, 42, 35, 60);
		System.out.println("정보 수정 후");
		//4
		s.printStudent();
		
		/* 1.StudentManager클래스의 객체(sm)를 생성하는데
		 * 	 학생의 정보를 10개 저장하도록 개게를 생성
		 * 2.학생의 한명의 정보를 객체 sm이 가지고 있는
		 * 	 insert메소드를 이용하여 저장
		 * 3.학생들의 정보를 객체 sm이 가지고있는 print
		 * 	 메소드를저장하여 출력
		 *  4.1학년 1반 10번 겁색했을때 결과를 출력하는 코드 작성
		 * 	 	객체 sm의 searchIndex메소드와 System.out.println 메소드를 이용하여 해당하는 번지출력
		 */
		
		
		/*StudentManager sm = new StudentManager(10);
		sm.insert("박유연", 1, 2, 20, 40, 50, 35);
		System.out.println("정보 추가"); 
		sm.print();
		System.out.println(sm.searchIndex(1, 2, 20)+"번지");  //4
		
		System.out.println("수정후");
		
		sm.modify(1, 2, 20, "박유연" , 90, 68, 70);
		sm.print();
		s.modifyStudent("박가연", 2, 3, 23, 82, 75, 95);
		s.printStudent();*/
		
		/* 1. 메뉴를 출력하는 메소드
		 * 1.1 매개변수 :없다
		 * 1.2 리턴타입 :없다
		 * 1.3 메소드명 :printMenu
		 * 1.4구현: 아래와같이출력 System.out.println()이용
		 * 메뉴
		 * 1.학생정보 추가
		 * 2.학생정보 수정
		 * 3.학생정보출력
		 * 4.종료
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
					sm.insert(name, grade, classNumber, number, kor, eng, math);
					
				}
				else if(menu == 2)
				{
					
					System.out.print("학년 :");
					int grade = scan.nextInt();
					System.out.print("학반 :");
					int classNumber = scan.nextInt();
					System.out.print("번호 :");
					int number = scan.nextInt();
					System.out.print("이름 :");
					String name = scan.next();
					System.out.print("국어 :");
					int kor = scan.nextInt();
					System.out.print("영어 :");
					int eng = scan.nextInt();
					System.out.print("수학 :");
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
		
		scan.close();	
		
	}
	public static void printMenu()
		{
			System.out.println("---------");
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 출력");
			System.out.println("4.종료 ");
			System.out.println("-----------");
			System.out.print("메뉴 선택:");
		}
	
} 
