package Study.Gener.ex2;

import javax.swing.JOptionPane;




/* main 쓰레드를 포함하여 2개의 쓰레드를이용 하여 입출금하는 코드작성
 * 마지막 소스를 참고
 * -main 쓰레드에서는 100원씩 무한대로 입금하고
 * -다른 쓰레드 에서는 다이얼로그에서 입력한 금액으로 출금한다.
 */

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO 자동 생성된 메소드 스텁
		
		Account acc = new Account();
		Thread th = new Thread(new MyTread7(acc));
		th.start();
				
		
		
		
		
		
		
		while(true)
		{
			if(acc.mode != null && acc.mode.compareTo("q") ==0 ) {
				System.out.println(" 입금종료 ");
				return;
			}
			
			acc.deposit(100);
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
	
	}

}
class Account
{	
	String mode;
	synchronized void withdraw(int money)  // 해당메소드에 동기화
	{
		while(balance < money)
		
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		balance -= money;
		System.out.printf("출금액 :%5d , 잔약 : %5d원  \n ", money , balance);
	}
		
	
	synchronized void deposit(int money)
	{
		balance += money;
		System.out.printf("입금액 :%5d , 잔약 : %5d원 \n" , money , balance);
		notify();
	}int balance =0;
}
class MyTread7 implements Runnable
{
	Account acc;
	public MyTread7(Account acc)
	{
		this.acc = acc;
	}
	@Override
	public void run() 
	{
		// TODO 자동 생성된 메소드 스텁
		while(true)
		{
			 acc.mode= JOptionPane.showInputDialog("출금할 금액 (만원이하) : ");
			if(acc.mode != null)
			{
				if(acc.mode.compareTo("q") == 0)
					return;
				acc.withdraw(Integer.parseInt(acc.mode));   //다이얼로그 멈추기
			}
			
			
		
			
			
		}
	}
	
}


