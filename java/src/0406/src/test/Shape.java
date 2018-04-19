package test;

public class Shape 
{
	private int x;
	private int y;
	private int w;
	private int h;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	
	public void Draw()    //그리기
	{
		System.out.println("도형입니다");
	}
	public void move(int x, int y)    //이동
	{
		this.setX(x);  //this.x = x;
		this.setY(y);  //this.y = y;
	}
	public void resize(int w, int h)   //크기조절
	{
		this.setW(w); //this.w =w;
		this.setH(h); //this.h =h;
	}
	
	public Shape() {}
	public Shape(int x,int y, int w,int h)
	{
		this.move(x, y);
		this.resize(w, h);   //만들어놓은 메소드 사용
	}
}

class Rect extends Shape
{
	public Rect() 
	{
		super();
	}
	public Rect(int x, int y,int w,int h) 
	{
		super(x,y,w,h);
	}
	@Override
	public void Draw()
	{
		System.out.println("사각형");
		System.out.println("왼쪽 위의 점:"+getX()+","+getY());
		System.out.println("가로 :" + getW());
		System.out.println("세로 :" + getH());
	}
	
}




