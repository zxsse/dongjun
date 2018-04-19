package study;

public class main1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      point pt= new point () ;
      pt.printpoint();
      pt.setX(10);
      pt.setY(20);
      pt.printpoint();
      System.out.println("현재 생성된 점의갯수 :" + point.count);
      point pt2=new point(1,1;)
      System.out.println("현재 생성된 점의갯수 :" + point.count);
      pt2.count = 10;
      System.out.println(pt.count);
      System.out.println(Math.PI);
   }
}

/* 2차원 좌표 평면의 점을 나타내기 위한 클래스 */
class point {
   private int x ;
   private int y ;
   
   /**
    * setX : 멤버변수 x의 값을 설정하는 메소드
    * @param _x : 설정하려는 x의 값
    */
   
   public void setX(int _x) {         // X값을 설정
      this.x = _x ;                // 매개변수 x의 값을 매개변수 x에 저장
   }
   public int getX(){
      return x;
   }
   public void setY(int _y) {         // Y값을 설정
      this.y = _y ;                // 매개변수 y의 값을 매개변수 y에 저장
   }
   public int getY(){
      return y;
   }
   public void printpoint() {
      System.out.println(x+", "+y);
   }
   
   /* 생성자
    * 1. 리턴타입이 없다. => void가 아닙니다.
    * 2. 메소드명이 클래스명과 동일하다.
    * 3. 내가 언하는 때에 호출할 수 없고, 객체가 생성될 때 자동으로 호출된다.
    */
   public static int count=0;
   public final static double pi = 3.1415;
  
   public point () {
	   
     count++;
    
   }
   public point (int x, int y) {
      this.x = x;
      this.y = y;                  //생성자 오버로딩
                                   
      count++;                       
   }
   public static void printCount() {
	   System.out.println("현재 생성된 객체 수:"+count);
   }
}