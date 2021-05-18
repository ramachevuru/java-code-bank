package learn.java.exceptions;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		int age = 16;
		
		try {
			if(age < 18) 
				 throw new CustomAgeException("Minimum age should be 18");
		}
		catch(CustomAgeException cae) {
			System.out.println(cae.getMessage());
		}
		
	}
}

class CustomAgeException extends RuntimeException{
	
	public CustomAgeException(String msg) {
		super(msg);
	}
	
	//Below are the valid constructors of type RuntimeException
	/*public CustomAgeException() {
		
	}
	public CustomAgeException(String msg, Throwable cause) {
		super(msg, cause);
	}
	public CustomAgeException(Throwable cause) {
		super(cause);
		
	//since jdk 1.7
	protected CustomAgeException(String msg, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
	}*/
	
}