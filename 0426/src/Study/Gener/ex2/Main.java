package Study.Gener.ex2;

import javax.swing.JOptionPane;




/* main �����带 �����Ͽ� 2���� �����带�̿� �Ͽ� ������ϴ� �ڵ��ۼ�
 * ������ �ҽ��� ����
 * -main �����忡���� 100���� ���Ѵ�� �Ա��ϰ�
 * -�ٸ� ������ ������ ���̾�α׿��� �Է��� �ݾ����� ����Ѵ�.
 */

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO �ڵ� ������ �޼ҵ� ����
		
		Account acc = new Account();
		Thread th = new Thread(new MyTread7(acc));
		th.start();
				
		
		
		
		
		
		
		while(true)
		{
			if(acc.mode != null && acc.mode.compareTo("q") ==0 ) {
				System.out.println(" �Ա����� ");
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
		System.out.printf("��ݾ� :%5d , �ܾ� : %5d��  \n ", money , balance);
	}
		
	
	synchronized void deposit(int money)
	{
		balance += money;
		System.out.printf("�Աݾ� :%5d , �ܾ� : %5d�� \n" , money , balance);
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
			 acc.mode= JOptionPane.showInputDialog("����� �ݾ� (��������) : ");
			if(acc.mode != null)
			{
				if(acc.mode.compareTo("q") == 0)
					return;
				acc.withdraw(Integer.parseInt(acc.mode));   //���̾�α� ���߱�
			}
			
			
		
			
			
		}
	}
	
}

