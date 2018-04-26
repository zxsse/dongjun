package Study.Thread.ex;            //교제 667페이지

//Thread 클래스를상속하는방법
//Runnable 클래스 구현하는방법
// -run에서 구현하면된다.

import java.util.Scanner;



public class Main3 
{
	
	public static void main(String[] args) 
	{
		Account acc = new Account();
		Thread th = new Thread(new MyTread7(acc));
		th.start();
		
		while(true)
		{
			acc.deposit(100);
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
		
		
		/*Runnable r = new MyTread5();
		Thread th1 = new Thread(new Thread(r));  //Runnable값을 공유 받는다 
		Thread th2 = new Thread(new Thread(r));
		th1.start();  
		th2.start();*/ 
		
		
	}

}


class MyTread5 implements Runnable
{
	Integer balance = new Integer(3000);
	@Override
	public void run() 
	{
		// TODO 자동 생성된 메소드 스텁
		while(balance > 0)
		{
			synchronized(this) //동기화 (실행 될 때 해당 쓰레드가 처리를해야 다음이진행된다 )
					  // 예외가있을수 있기 때문에 객체하나에 동기화
			{
				if(balance > 0)
				{
					balance -= 1000;
					System.out.println(balance);
				}
				try 
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
				
					e.printStackTrace();
				}
			}
			
			
		}
	}
	
}
class MyTread6 implements Runnable
{
	Integer balance = new Integer(3000);
	@Override
	public void run() 
	{
		// TODO 자동 생성된 메소드 스텁
		while(balance > 0)
		{
			
			withdraw();
			
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
			
				e.printStackTrace();
			}
		
			
			
		}
	}
	synchronized void withdraw()  // 해당메소드에 동기화
	{
		if(balance>= 1000)
		{
			balance -= 1000;
			System.out.println(balance);
		}
	}
	
}

class Account
{
	
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
		System.out.println("출금액 : " + money +"잔액 :" + balance);
	}
		
	
	synchronized void deposit(int money)
	{
		balance += money;
		System.out.println("입금액 : " + money +"잔액 :" + balance);
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
			
			acc.withdraw(1000);
			
			
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


