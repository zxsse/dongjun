package Test.Exception;

public class NumberException extends Exception
{
	public NumberException() {}
	public NumberException(String s)
	{
		super(s);
	}
	public void printConsoleMessage()
	{
		System.out.println(super.getMessage());
	}
}
