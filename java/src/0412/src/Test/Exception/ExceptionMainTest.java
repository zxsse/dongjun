package Test.Exception;

public class ExceptionMainTest {

	public static void main(String[] args) 
	{
		try 
		{
			Test();
		}
		catch(NumberException ne)
		{
			ne.printConsoleMessage();
		}
		catch(Exception e) {}
		

	}
	public static void Test() throws NumberException
	{
		throw new NumberException("상속 받은 예외");
	}
}
