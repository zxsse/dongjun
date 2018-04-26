package Study.Thread.ex;

//Thread 클래스를상속하는방법
//Runnable 클래스 구현하는방법
// -run에서 구현하면된다.

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main 
{
	static String data=""; //문자를 받을 변수
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyTread  m1 = new MyTread();
		m1.start();  //start는 둘다실행  
		 			 //run은 run 실행  다하고 main 실행 
		
		
		data = JOptionPane.showInputDialog("문자열입력");
		System.out.println("입력받은문자열 ㅣ" + data); //문자입력  할 수 있게 하는 것
		
		
		
		
		
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
		for(int i= 0; i <10 ; i++)
		{
			try 
			{
				if(Main.data.compareTo("q")==0) //q이면 멈춘다 static이라서 (Main.data이런식으로 불러준다)
				break;
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class MyTread2 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i= 0; i <10000 ; i++)
		{
			try 
			{
				
				System.out.println("a");
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}