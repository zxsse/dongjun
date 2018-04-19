package test;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ShapeInterface		//추상 클레스 추상 메소드가 1개이상인 클레스
 {						//추상클레스는 추상클레스를 통해 객체를 만들수 없습니다.
	
	public abstract void draw(); //구현이 안되어 있는 메소드 : 추상 메소드(보통 자식 클레스에게 맡김)
	public abstract void resize(int w, int h);
	public abstract void move(int x, int y);
	
 }
interface A
{
	final int num = 10; //인터페이스는 상수,추상메소드가온다 변수는올수없다 
}
interface C
{
	public abstract void Test();
}




 class Shape2 implements ShapeInterface,C
 {
	 public int x;
	 public int y;
	 public int w;
	 public int h;
	@Override
	public void draw() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void resize(int w, int h) {
		this.w = w;
		this.h= h;
		// TODO Auto-generated method stub	
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}
	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}
	 
 }