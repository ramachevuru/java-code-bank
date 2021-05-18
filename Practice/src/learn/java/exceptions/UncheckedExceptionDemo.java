package learn.java.exceptions;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		
		int i=1,j = 1;
		
		try {
			//j=0;
			i = i/j;
			
			//i = Integer.parseInt("Hello");
			
		}
		
		catch(NumberFormatException nfe) {
			System.out.println("Number Format Exception " + nfe.getMessage());
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("divide by zero !!!");
		}
		//System.out.println(i + j);
		
	}
	
}
