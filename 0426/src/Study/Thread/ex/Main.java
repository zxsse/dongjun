package Study.Thread.ex;

//Thread Ŭ����������ϴ¹��
//Runnable Ŭ���� �����ϴ¹��
// -run���� �����ϸ�ȴ�.

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main 
{
	static boolean data = false; //���ڸ� ���� ����
	
	//public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyTread  m1 = new MyTread();
		Thread m2 = new Thread(new MyTread2());
		m1.setPriority(10); //******�켱����********
		m2.setPriority(1);
		
		m1.start();  //start�� �Ѵٽ���  
		 			 //run�� run ����  ���ϰ� main ���� 
		m2.start();
		
		
		
		
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

class MyTread extends Thread
{
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i= 0; i <1000 ; i++)
		{
			
			System.out.print("-");
		
			/*try 
			{
				if(Main.data.compareTo("q")==0) //q�̸� ����� static�̶� (Main.data�̷������� �ҷ��ش�)
				break;
				
				
				
				Thread.sleep(10);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}*/
		}
	}
}
class MyTread2 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i= 0; i <1000 ; i++)
		{
			System.out.print("|");
			/*try 
			{
				
				
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}*/
		}
	}
	
}