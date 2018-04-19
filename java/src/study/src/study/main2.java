package study;

//  Static�� �ٴ� ������ ��ü.������(x) , Ŭ������.������(o)
      
public class main2 
{

   public static void main(String[] args)
   {
      Point2 pt = new Point2();
      System.out.println("�ʱ� ��ǥ ��ġ");
   
      System.out.println("�ʱ� ��ǥ ��ġ");
      pt.printPoint();
   //   pt.printCount();
      
   //  ��ǥ �̵� ��
      System.out.println("��ǥ(10,10) �̵� ��");
      pt.move(10, 10);
      pt.printPoint();
   //   pt.printCount();
      
      Point2 pt1 = new Point2(pt);
      System.out.println("��ü pt�� x = " + pt1.getX());
      System.out.println("��ü pt�� y = " + pt1.getY());
      
   }

}

class Point2
{
   private int x;
   private int y;
   
   public final static double PI = 3.1415;  // final -> ����� ����
    private static int count = 0;  // Class ������ ȣ���϶�. -> static ����
   
   public Point2() { count++; }
   public Point2(Point2 pt)
   {
      x = pt.x;
      y = pt.y;
   }
   public Point2(int x, int y)
   {
      this.x = x;
      this.y = y;
      count++;
   }
   
   /**
    * @param x : �����Ϸ��� x�� ��
    */
   public void setX(int x)
   {
      this.x = x;  // �Ű� ���� x�� ���� Point Ŭ������ ������� x�� ����.
   //   x = x;  // �Ű������� �Ű������� �����ϴ� ������. (�������� �켱)
   }
   public int getX()
   {
      return x;
   }
      
   public void setY(int y)
   {
      this.y = y;  // �Ű� ���� y�� ���� Point Ŭ������ ������� y�� ����.
      
   }
   public int getY()
   {
      return y;
   }
      
   public void printPoint()
   {
      System.out.println(x + "," + y);
   }
   
   public static void printCount()
   {
      System.out.println("���� ��ǥ ��鿡 ������ ��ü �� : " + count);
   }
   
   public void move(int x, int y)
   {
      this.setX(x);
      this.setY(y);
   }
}
