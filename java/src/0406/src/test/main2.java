package test;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r= new Rect();
		r.Draw();
		Rect r2 = new Rect(0,0,5,10);
		r2.Draw();
		Shape s = new Shape();
		
		if(s instanceof Rect) // instanceof : 제어자  (Shape)r 가능한지  가능하면 ok 불가 fail
			System.out.println("Ok");
		else
			System.out.println("Fail");
	}

}
