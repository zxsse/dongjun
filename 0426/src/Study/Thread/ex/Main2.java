package Study.Thread.ex;

//Thread Ŭ����������ϴ¹��
//Runnable Ŭ���� �����ϴ¹��
// -run���� �����ϸ�ȴ�.

import java.util.Scanner;



public class Main2 
{
	static boolean data = false; //���ڸ� ���� ����
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread m3 = new Thread(new MyTread4());
		m3.start();
		
		for(int i = 1; i<=5; i++)
		{
			try 
			{
				Thread.sleep(100);
			} catch (InterruptedException e) 
			{
				// TODO �ڵ� ������ catch ����
				e.printStackTrace();
			}
		}
		try 
		{
			m3.join(); // MyThead3 �����ϰ� main
		} catch (InterruptedException e1)
		{
			// TODO �ڵ� ������ catch ����
			e1.printStackTrace();
		}
		System.out.println("main ������ �ٽý���");
		m3 = new Thread(new MyTread4());
		m3.start();
		try 
		{
			m3.join();
		} catch (InterruptedException e)
		{
			// TODO �ڵ� ������ catch ����
			e.printStackTrace();
		}
		System.out.println("main ������ ����");
		
		/*Thread m2 = new Thread(new MyTread3());
		m2.setDaemon(true);
		m2.start();*/
		
		/*for(int i=0; i<20 ; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �ڵ� ������ catch ����
				e.printStackTrace();
			}
			if(i == 9)
				data = true;
		}*/
		
		
		/*data = JOptionPane.showInputDialog("���ڿ��Է�");
		System.out.println("�Է¹������ڿ� ��" + data); //�����Է�  �� �� �ְ� �ϴ� ��*/
		
		
		
		
		
		/*Thread m2 = new Thread(new MyTread2());
		
		
	
		m2.run();*/
		
		
		/*for(int i = 0; i < 10000 ; i++)
		{
			System.out.println("B");
			try 
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
		}*/
	}

}

class MyTread3 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		while(true)
		{
			
			try
			{		
				Thread.sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(Main2.data == true)
			{
				System.out.println("������ �ڵ������մϴ�.");
			}
		}
	}
	
}

class MyTread4 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i= 0 ; i <= 10 ;i++ )
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �ڵ� ������ catch ����
				e.printStackTrace();
			}
		}
		System.out.println("MyThread3 �����մϴ�.");
	}
	
}