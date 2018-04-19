package study;

public class main1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      point pt= new point () ;
      pt.printpoint();
      pt.setX(10);
      pt.setY(20);
      pt.printpoint();
      System.out.println("���� ������ ���ǰ��� :" + point.count);
      point pt2=new point(1,1;)
      System.out.println("���� ������ ���ǰ��� :" + point.count);
      pt2.count = 10;
      System.out.println(pt.count);
      System.out.println(Math.PI);
   }
}

/* 2���� ��ǥ ����� ���� ��Ÿ���� ���� Ŭ���� */
class point {
   private int x ;
   private int y ;
   
   /**
    * setX : ������� x�� ���� �����ϴ� �޼ҵ�
    * @param _x : �����Ϸ��� x�� ��
    */
   
   public void setX(int _x) {         // X���� ����
      this.x = _x ;                // �Ű����� x�� ���� �Ű����� x�� ����
   }
   public int getX(){
      return x;
   }
   public void setY(int _y) {         // Y���� ����
      this.y = _y ;                // �Ű����� y�� ���� �Ű����� y�� ����
   }
   public int getY(){
      return y;
   }
   public void printpoint() {
      System.out.println(x+", "+y);
   }
   
   /* ������
    * 1. ����Ÿ���� ����. => void�� �ƴմϴ�.
    * 2. �޼ҵ���� Ŭ������� �����ϴ�.
    * 3. ���� ���ϴ� ���� ȣ���� �� ����, ��ü�� ������ �� �ڵ����� ȣ��ȴ�.
    */
   public static int count=0;
   public final static double pi = 3.1415;
  
   public point () {
	   
     count++;
    
   }
   public point (int x, int y) {
      this.x = x;
      this.y = y;                  //������ �����ε�
                                   
      count++;                       
   }
   public static void printCount() {
	   System.out.println("���� ������ ��ü ��:"+count);
   }
}