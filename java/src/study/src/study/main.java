package study;


import java.util.Scanner;


public class main

{


    public static void main(String[] args)

    {

        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        

        

        int [] input = new int[6];//�Է��� �� 6��

        int [] ans = new int[6];//��÷��ȣ ���ʽ�����

        int min = 1;   //�������� �ּ�

        int max = 45;  //�������� �ִ�

        int i=0;       //����

        int bonus = randomInt(1,45);

        

        

        createAnswerArr(ans,min,max);       //�ߺ� �ȵǰ�

        

        

        for(i =0; i<ans.length;i++) 

        {

            System.out.println(ans[i]+" ");

        }    

        System.out.println();    

        

        System.out.println("��ȣ 6���� �Է��ϼ���");

        for(i=1 ; i <6 ; i++) {

            input[i] =scan.nextInt();
        }
            

        

        ans[i] = (int)(Math.random()*(max-min+1))+min;

        

     }

    public static boolean isDuplicated(int []arr, int num)      

    {

        for(int i=0;i<arr.length;i++) 

        {

        if (arr[i] == num)    

            return true;

        }

        return false;

    }
    public static void createAnswerArr(int [] ans, int min, int max)

    {

        for(int i=0; i<6;) 

        {

            int tmp = randomInt(min,max);

            if(!isDuplicated(ans,tmp)) 

            {

                ans[i]=tmp;

                i++;

            }


        }

    }


    

    

    

    

    

    public static int randomInt(int min, int max) {

        int random=1;

        random = (int)(Math.random()*max-min+1)+min;

        // TODO Auto-generated method stub

        return random;

    }

    

    public static int bonus(int [] ans, int [] input) 

    {

        int bonus = 0;

        int i = 0;

        for (i= 0; i<ans.length; i++ ) 

        {

            if(ans[i] != bonus);

            System.out.println("���ʽ� ��ȣ" + bonus);

        }return bonus;

    }       

    

    


    

    public static int correctNum(int []ans, int [] input) 

    {

        int correct=0;

        for(int i = 0 ;i<6 ; i++) 

        {

        for (int j = 0;j<6 ; j++) 

        {

        if(i == j)

            continue;

        if(ans[i] == input[j])

            correct++;

    }

    }

        return correct;

    }

}

