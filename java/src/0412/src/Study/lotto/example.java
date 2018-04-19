package Study.lotto;

import java.util.Scanner;

public class example{

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int [] input = new int[6];//자동 생성 번호
      int [] ans = new int[6];//당첨번호
      int bonus = 0;//보너스 번호
      int min = 1;
      int max = 9;
      createAnswerArr(ans, min, max);//생성된 당첨
      createAnswerArr(input,min, max);//생성된 자동
      
      do{
         bonus = randomInt(min,max);
      }while(isDuplicated(ans,bonus));
      
      /* 당첨 번호 확인하는 부분 */
      for(int i = 0; i < ans.length; i++) {
         System.out.print(ans[i] + " ");
      }
      System.out.print(bonus);
      System.out.println();
      /* 자동 번호 확인하는 부분 */
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
            System.out.println("꽝");         
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
      //혹시 매개변수로 순서를 바꿔 최소값대신 최댓값을
      //최댓값 대신 최솟값을 입력할 경우
      //처리하기 위한 조건문
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