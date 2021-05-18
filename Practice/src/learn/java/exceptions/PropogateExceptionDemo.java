package learn.java.exceptions;

public class PropogateExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//callMethod();
		
		try {
			callMethod();
		}catch(Exception e)	{
			System.out.println("Exception is caught in caller method !!!");
			e.getMessage();
		}
	}

	private static void callMethod() throws Exception{
		// TODO Auto-generated method stub
		
		//throw new Exception(); // We cannot just THROW the exception. It should be handled here or in the caller method using 'throws'
		//throw new RuntimeException(); // Not mandatory to handle
		
	}

}
