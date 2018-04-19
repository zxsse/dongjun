package Study.exam;

import java.util.Scanner;

public class MainStringExam 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i ;
		String s = "안녕하세요. 저는 김동준 입니다. 잘부탁드립니다.";
		String[] sp = s.split("\\."); 
		for( i =0; i<sp.length;i++)
		{
			System.out.println(sp[i]);
		}
		System.out.println("문장의갯수: " + i);
		
		
		
		
		
		
		
		
		
		/*String s = "example.mp4";
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		
		if(s.endsWith("mp4") || s.endsWith("wmv") || s.endsWith("avi"))
		{
			System.out.println("동영상 파일이다.");
		}
		else 
		{
			System.out.println("동영상이아니다");
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
