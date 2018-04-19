package Study.number;

public interface CalculatorInterface 
{
	public double sum(double a, double b);
	public double sub(double a, double b);
	public double mul(double a, double b);
		
	public double div(double a, double b) throws Exception;
	public double mod(double a, double b) throws Exception;
		
	public double calculate(double a, double b, char op) throws Exception;

}

class calculator implements CalculatorInterface
{

	@Override
	public double sum(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) throws Exception 
	{
		if (b == 0) 
		throw new Exception("나누기");
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double mod(double a, double b) throws Exception
	{
		if (b == 0)
			throw new Exception("모드");
		// TODO Auto-generated method stub
		return a%b;
	}

	@Override
	public double calculate(double a, double b, char op) throws Exception 
	{
		try
		{
			switch(op)
			{
				case '+' : 
				return sum(a,b);
			
				case '-' :
					return	sub(a,b);
					
				case '*' :
					return	mul(a,b);
					
				case '/' :
					return div(a,b);
					
				case '%' :
					return mod(a,b);
					
				default :
					throw new Exception("디폴트");
		
		// TODO Auto-generated method stub
		
			}
		}	
		catch(Exception e)
		{
			throw e;
		}
		
	
	}
	public void Test() throws NullPointerException
	{
		throw new NullPointerException();
	}
}



