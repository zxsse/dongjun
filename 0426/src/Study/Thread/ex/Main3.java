package Study.Thread.ex;            //���� 667������

//Thread Ŭ����������ϴ¹��
//Runnable Ŭ���� �����ϴ¹��
// -run���� �����ϸ�ȴ�.

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
		Thread th1 = new Thread(new Thread(r));  //Runnable���� ���� �޴´� 
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
		// TODO �ڵ� ������ �޼ҵ� ����
		while(balance > 0)
		{
			synchronized(this) //����ȭ (���� �� �� �ش� �����尡 ó�����ؾ� ����������ȴ� )
					  // ���ܰ������� �ֱ� ������ ��ü�ϳ��� ����ȭ
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
		// TODO �ڵ� ������ �޼ҵ� ����
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
	synchronized void withdraw()  // �ش�޼ҵ忡 ����ȭ
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
	
	synchronized void withdraw(int money)  // �ش�޼ҵ忡 ����ȭ
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
		System.out.println("��ݾ� : " + money +"�ܾ� :" + balance);
	}
		
	
	synchronized void deposit(int money)
	{
		balance += money;
		System.out.println("�Աݾ� : " + money +"�ܾ� :" + balance);
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
		// TODO �ڵ� ������ �޼ҵ� ����
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


