package Study.number;



public class Calculatortest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		calculator c = new calculator();
		double res = 0;
		try
		{
			res = c.calculate(1,0 , '%');
			System.out.println(res);		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
