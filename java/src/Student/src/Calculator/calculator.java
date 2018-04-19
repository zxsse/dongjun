package Calculator;

	public class calculator 
	{ //멤버
	private char mod;
	private int x;
	private int y;
	private int cnt;
	
	
	public calculator() {}
	public calculator(char mod)
	{
		this(mod,0,0,0);
	}
	public calculator(char mod, int x, int y, int cnt)
	{
		this.mod = mod;
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
	
	public void printinfo()
	{
		System.out.println(""+ x + mod + y +"="+ cnt );
	}
	public boolean cal()
	{
		switch(mod)
		{
		 	case '+' :
		 		sum();
		 		break;
		 	case '-' :
		 		sub();
		 		break;
		 	case '*' :
		 		mul();
		 		break;
		 	case '/' :
		 		if(div())
		 			return true;
		 			else return false;
		}
		return false;
	}
	
	
	
	
	
	public char getMod() {
		return mod;
	}
	public void setMod(char mod) {
		this.mod = mod;
	}
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public void setcal(int x, int y, char mod) 
	{
		setX(x);
		setY(y);
		setMod(mod);
	}
	//예외 처리
	public void sum() //멤버변수를 가지고있기 때문에 매개변수를 넘겨줄필요가없다.
	{
		cnt= x + y;
	}
	public void sub()
	{
		cnt = x - y;
	}
	public void mul()
	{
		cnt = x * y;
	}
	public boolean div()
	{
		if(y == 0)
			return false;
	
		else
		{
			cnt = x / y;
			return true;
		}
	}	
}
