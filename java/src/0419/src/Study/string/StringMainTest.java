package Study.string;

import java.util.Scanner;

public class StringMainTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s= "Hello World";
		System.out.println(s.charAt(0));//원하는번지의 값을 확인하고싶을 때
		
		/*
		Scanner scan = new Scanner(System.in); //문자 입력받을 때
		char op = scan.next().charAt(0); //문자열 하나받을때(주로 Scanner를 사용했을 때)
		*/
		
		s = s + "!"; //concat()메소드와 동일한동작함 (이어붙이기)
		System.out.println(s);
		
		System.out.println(s.contains("Hello")); //contains란 문자열이 포함되어있는지 확인  true또는 false
		
		s= "Hello.txt";
		System.out.println(s);
		System.out.println(s.endsWith("txt")); //해당문자열로 끝나는지 확인 true 또는 false
		System.out.println(s.equals("Hello.txt")); //자동적으로 해당하는 문자열의 값을 비교 같으면 같은걸로 다르면 다른거로 취급
		System.out.println(s.indexOf('H'));
		System.out.println(s.indexOf('A'));//해당하는 문자가존재하는지확인후 없으면 -1 
		int [] arr = new int[4];
		int a = arr.length; //배열에선 변수
		 a = s.length();//메소드 문자의길이 
		s = "https://search.naver.com/search.naver?where=nexearch&query=%C7%C1%B8%AE%B9%CC%BE%EE%B8%AE%B1%D7&sm=tab_etc";
		String[] sp = s.split("/"); //토큰기준이로 문자열 추출 (그래서 배열)문자열 짜르고 싶을 때
		for(int i =0; i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		s = "Hello";
		System.out.println(s.substring(0,2)); //0번지에서 2번지까지짤라서 넣어라 그래서 He이렇게나옴
		s = String.valueOf(100);
		s = String.valueOf('a');
		A a1 = new A();
		s = String.valueOf(a1);
		System.out.println(s); //객체를넘겨주면 해당하는 클레스에 toString 메서드가 생성됨
		StringBuffer sb= new StringBuffer("012345");
		System.out.println(sb.length()); //길이
		System.out.println(sb.capacity()); //버퍼크기
		System.out.println(sb.delete(0, 2)); // 문자열 지우는거 
		System.out.println(sb.insert(4, "a")); 
		
		System.out.println(sb.reverse()); //거꾸로 출력
		
	}

}
class A{}
