package FlowEx;

import java.util.Scanner;

public class main5 {

	   public static void main(String[] args) {

	   /*"����� �ֹι�ȣ 7�ڸ��� �Է��ϼ���(930727-2) : "
	    * 7�ڸ� �Է� ��
	    * "����� �����Դϴ�."
	    * */
	   
	   String num;   
	      
	   Scanner scan = new Scanner(System.in);
	   System.out.print("����� �ֹι�ȣ 7�ڸ��� �Է��ϼ���(930727-2) : ");
	   
	   num=scan.nextLine();
	   int gender = num.charAt(7);   // �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����
	   
	   switch(gender) {
	      case '1':
	         System.out.println("�����Դϴ�.");
	         break;
	      case '2': 
	         System.out.println("�����Դϴ�.");
	         break;
	      default:
	         System.out.println("��ȿ�������� �ֹε�Ϲ�ȣ�Դϴ�.");
	   }
	            
	   }

	}