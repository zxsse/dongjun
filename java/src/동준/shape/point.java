package ����.shape;



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
	  public point(point p)
	  {
		  this.setX(p.x);
		  this.setY(p.y);
	  }
	public void move(int i, int j) {
		// TODO Auto-generated method stub
		
	}
		
	}