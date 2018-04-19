package 동준.shape;

public class rect {
	private point leftup;
	private point rightdown;
	private int width;
	private int height;
	public point getLeftup() {
		return leftup;
	}
	public void setLeftup(point leftup) {
		this.leftup = leftup;
	}
	public point getRightDown() {
		return rightdown;
	}
	public void setRightDown(point rightDown) {
		this.rightdown = rightDown;
	}
	public int getWidht() {
		return width;
	}
	public void setWidht(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	private void calwidth()
	{
		width = Math.abs(rightdown.getX()
				-leftup.getX());
	}
	private void calheight()
	{
		height = Math.abs(rightdown.getX()
				-leftup.getX());
	}
	
	
	
	public rect()
	{
		this.leftup = new point(0,10);
		this.rightdown = new point(10,0);
		this.calwidth();
		this.calheight();
	}			
	public rect(int left, int up, int right, int down)
	{
		this.leftup = new point(left,up);
		this.rightdown = new point(right,down);
		this.calwidth();
		this.calheight();
	}
	public rect(point leftup,point rightdown)
	{
		this.leftup = new point(leftup);
		this.rightdown = new point(rightdown);
		this.calwidth();
		this.calheight();
	}
					
	public void print()
	{
		System.out.println("사각형의정보");
		System.out.print("좌상의 점:");
		leftup.printCount();
		System.out.println("우하의 점:");
		rightdown.printCount();
		String wight = null;
		System.out.println("가로 : " + wight);
		
		
		
		
	}
	
	public void resize (int width, int height)
	{                                            //크기조정
		this.width = width;
		this.height = height;
		this.rightdown.move(
				this.leftup.getX()+width,
				this.leftup.getY()-height);
	}			
	public void move(int x, int y) 
	{ 	this.leftup.move(							//위치 조정
				this.leftup.getX()+x,					//x좌표로 매개변수 x픽셀만큼 이동
				this.leftup.getY()+y); 					//y좌표로 매개변수 y픽셀만큼 이동
		this.rightdown.move(
				this.rightdown.getX()+x,
				this.rightdown.getY()+y);
	
	}
	
	
	
	
}
