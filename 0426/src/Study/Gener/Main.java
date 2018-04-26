package Study.Gener;

public class Main
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GenericEx<Integer> ge = new GenericEx();
		ge.data = 10;
		System.out.println(ge);
	}

}
class GenericEx <T>
{
		T data;
		public GenericEx() {}
		
		public String toString()
		{
			
			return this.getClass().getName() + " : Gerneric Å¬·¡½º : " ;
		}
}