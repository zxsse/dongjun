package ����;

public class main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("�ʱ� ��ǥ ��ġ");
		square s1 = new square();
		s1.x = 30;
		s1.y = 20;
		int hori = s1.x - s1.y; 
		int vert = s1.x - s1.y;
		
		System.out.println("���� :"+ hori);
	}

}
	class square	
	{
		//�������
		private int x;
		private int y;
		private int legth;
		
	
		
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

	public square()
	{
		
		this.setCenter(0,0);
		this.length(10.0);
	}
	
	


	private void length(double d) 
	{
		
		
	}

	public void setCenter(int x, int y)
	{
		this.setCenter(0, 0);
		this.setRadius(5.0);
	}
	public void squser(int x, int y)
	{
		this.setCenter(0, 0);
		this.setRadius(10, 0);
	} 
	public void square(int z, int a)
	{
		this.setdown(z, a);
	}
	public void 
	
	public void lenhth()
	{
		this.lenhth();
	}
	
	public void setHorizontal(int x , int y)
	{
		this.setCenter(x, y);
		this.setRadius(x, y);
		
	}
	
	public void printSquare()
	{
	System.out.println("�簢���� ����");	
		
		
	
	}
}
	
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