package Study.lotto;

import java.util.Scanner;

public class example{

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int [] input = new int[6];//�ڵ� ���� ��ȣ
      int [] ans = new int[6];//��÷��ȣ
      int bonus = 0;//���ʽ� ��ȣ
      int min = 1;
      int max = 9;
      createAnswerArr(ans, min, max);//������ ��÷
      createAnswerArr(input,min, max);//������ �ڵ�
      
      do{
         bonus = randomInt(min,max);
      }while(isDuplicated(ans,bonus));
      
      /* ��÷ ��ȣ Ȯ���ϴ� �κ� */
      for(int i = 0; i < ans.length; i++) {
         System.out.print(ans[i] + " ");
      }
      System.out.print(bonus);
      System.out.println();
      /* �ڵ� ��ȣ Ȯ���ϴ� �κ� */
      for(int i = 0; i < input.length; i++) {
         System.out.print(input[i] + " ");
      }
      System.out.println();
      
      
      
      
      //while(true) 
      {
         
         int rank = duplicatedCount(ans,input);
         if(rank == 6 )
            System.out.println(1);
         else if(rank == 5 
               && isDuplicated(input,bonus)) {
            System.out.println(2);
         }
         else if(rank == 5){
            System.out.println(3);
         }
         else if(rank == 4){
            System.out.println(4);
         }
         else if(rank == 3){
            System.out.println(5);
         }
         else
            System.out.println("��");         
      }
   }
   public static int duplicatedCount(
         int [] ans, int [] input) {
      int cnt = 0;
      for(int i=0; i<ans.length; i++) {
         if(isDuplicated(input,ans[i]))
            cnt++;
      }
      return cnt;
   }
   public static int randomInt(int min, int max) {
      //Ȥ�� �Ű������� ������ �ٲ� �ּҰ���� �ִ���
      //�ִ� ��� �ּڰ��� �Է��� ���
      //ó���ϱ� ���� ���ǹ�
      if(min > max) {
         int tmp = min;
         min = max;
         max = tmp;
      }
      return (int)(Math.random()*
            (max-min+1))+min;
   }
   
   public static boolean isDuplicated(int []arr
         , int num) {
      for(int i = 0; i<arr.length; i++) {
         if(arr[i] == num)
            return true;
      }
      return false;
   }
   public static void createAnswerArr(
         int [] ans, int min, int max) {
      for(int i =0; i<ans.length;) {
         int tmp = randomInt(min,max);
         if(!isDuplicated(ans,tmp)) {
            ans[i] = tmp;
            i++;
         }
      }
   }
   public static int strikeCnt(int [] ans,
         int [] input) {
      int strike = 0;
      for(int i = 0;i<ans.length; i++) {
         if(ans[i] == input[i])
            strike++;
      }
      return strike;
   }
   
   public static int ballCnt(int [] ans,
         int [] input) {
      int ball = 0;
      for(int i = 0; i<ans.length; i++) {
         for(int j = 0; j<input.length; j++) {
            if(i == j)
               continue;
            if(ans[i] == input[j])
               ball++;
         }
      }
      return ball;
   }

}