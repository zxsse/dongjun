package Calculator;

import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		char mod = scan.next().charAt(0);
		int y = scan.nextInt();
		calculator c1 = new calculator(mod,x,y,0);
		switch(mod)
		{
		case '+' : 
			double cnt = x + y;
			System.out.println("" + x + mod + y + "=" + cnt);
			break;
		case '-' :
			cnt = x - y;
			System.out.println("" + x + mod + y + "=" + cnt);
			break;
		case '*' : 
			cnt = x * y;
			System.out.println("" + x + mod + y + "=" + cnt);
			break;
		case '/' :
			cnt = x / y;
			System.out.println("" + x + mod + y + "=" + cnt);
			break;
		default :
			System.out.println(" 계산 할 수 없습니다");
		}
	}
		

}
