package learn.java.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		//Checked Exception is thrown at compile time and hence we should handle it
		//Other examples: SQLException, ClassNotFoundException ...
		
		try {
			 str = (String)reader.readLine();
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println(str);
	}

}
