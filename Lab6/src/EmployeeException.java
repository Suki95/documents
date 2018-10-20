public class EmployeeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String msg;
	public EmployeeException(String msg)
	{
		super(msg);
	}
	public EmployeeException(String msg, Throwable cause,ErrorCode code)
	{
		super(msg,cause);
	}
}
