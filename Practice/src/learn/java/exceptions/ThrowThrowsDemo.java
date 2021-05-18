package learn.java.exceptions;

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,j=1;
		/*try {
			if(i-j <= 0) {
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException ae) {
			System.out.println("Diff should be > 0");
		}*/
		
		if(i-j <= 0) {
			throw new ArithmeticException();
		}
		
		/*String s = "hi";
		try {
			int k = getValue(s);
			System.out.println(k);
		}catch(NumberFormatException nfe) {
			System.out.println("String -hi- cannot be converted to a number");
		}*/
		
	}

	private static int getValue(String s) throws NumberFormatException{
		// TODO Auto-generated method stub
		int i = Integer.parseInt(s);
		return i;
	}

}
