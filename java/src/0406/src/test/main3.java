package test;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ShapeInterface		//�߻� Ŭ���� �߻� �޼ҵ尡 1���̻��� Ŭ����
 {						//�߻�Ŭ������ �߻�Ŭ������ ���� ��ü�� ����� �����ϴ�.
	
	public abstract void draw(); //������ �ȵǾ� �ִ� �޼ҵ� : �߻� �޼ҵ�(���� �ڽ� Ŭ�������� �ñ�)
	public abstract void resize(int w, int h);
	public abstract void move(int x, int y);
	
 }
interface A
{
	final int num = 10; //�������̽��� ���,�߻�޼ҵ尡�´� �����¿ü����� 
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