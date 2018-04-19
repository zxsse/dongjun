package Study.lotto;

import java.util.Scanner;

public class LottoMainTest {

   public static void main(String[] args) {

      int[] win = new int[7];            // 1-1
      int[] arr = new int[6];               // 1-2
      
      lotto l = new lotto();               // 2
      char isContinue = 'y';
      Scanner scan = new Scanner(System.in);
      while((isContinue == 'y' || isContinue =='Y'))
      {
      try {
         l.createLotto(win, 1, 9);      // 3-1
         l.createLotto(arr, 1, 9);         // 3-2
         int rank = l.rank(win, arr);
         l.printArr(arr);
         l.printArr(win);
            System.out.println(rank);
      }catch (Exception e) {	
         System.out.println(e.getMessage());
      }   
      System.out.print("더 하시겠습니까 ??(y/n)");
      isContinue = scan.next().charAt(0);
   }

}
}