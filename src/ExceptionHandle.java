
public class ExceptionHandle extends Exception
{
	public ExceptionHandle(String message, String name)
	{
		super(message);
		this.type = ExceptionType.valueOf(name);
	}

	enum ExceptionType 
	{
		INVALID_DATA, CALCULATION_ERROR
	}

	ExceptionType type;

	public ExceptionHandle(String message, ExceptionType type) 
	{
		super(message);
		this.type = type;
	}

}


