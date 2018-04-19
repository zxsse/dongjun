package study;

//  Static이 붙는 변수는 객체.변수명(x) , 클래스명.변수명(o)
      
public class main2 
{

   public static void main(String[] args)
   {
      Point2 pt = new Point2();
      System.out.println("초기 좌표 위치");
   
      System.out.println("초기 좌표 위치");
      pt.printPoint();
   //   pt.printCount();
      
   //  좌표 이동 후
      System.out.println("좌표(10,10) 이동 후");
      pt.move(10, 10);
      pt.printPoint();
   //   pt.printCount();
      
      Point2 pt1 = new Point2(pt);
      System.out.println("객체 pt의 x = " + pt1.getX());
      System.out.println("객체 pt의 y = " + pt1.getY());
      
   }

}

class Point2
{
   private int x;
   private int y;
   
   public final static double PI = 3.1415;  // final -> 상수로 만듬
    private static int count = 0;  // Class 명으로 호출하라. -> static 변수
   
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
    * @param x : 설정하려는 x의 값
    */
   public void setX(int x)
   {
      this.x = x;  // 매개 변수 x의 값을 Point 클래스의 멤버변수 x에 저장.
   //   x = x;  // 매개변수에 매개변수를 저장하는 형식임. (지역변수 우선)
   }
   public int getX()
   {
      return x;
   }
      
   public void setY(int y)
   {
      this.y = y;  // 매개 변수 y의 값을 Point 클래스의 멤버변수 y에 저장.
      
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
      System.out.println("현재 좌표 평면에 생성된 객체 수 : " + count);
   }
   
   public void move(int x, int y)
   {
      this.setX(x);
      this.setY(y);
   }
}
