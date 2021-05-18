package learn.java.exceptions;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = getSomething();
		
		System.out.println(str);
		
	}

	@SuppressWarnings("finally")
	private static String getSomething() {
		// TODO Auto-generated method stub
		
		int i=1,j=0;
		
		try {
			i = i/j;
			return "try";
		}
		catch(ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			try {
				int k = Integer.parseInt("int");
			}
			catch(NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
				return "nested try-catch";
			}
			
			return "catch";
		}
		finally {
			//System.out.println("");
			return "finally";
		}
		
		//return null;
	}

}
