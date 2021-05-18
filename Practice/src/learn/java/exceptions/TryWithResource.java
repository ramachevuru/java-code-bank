package learn.java.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		/*BufferedReader br = null;
		String input = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}
		catch(IOException ie) {
			System.out.println("IOException "+ie.getMessage());
		}
		finally {
			br.close();
		}*/
		
		//This works well with any kind of resource like File, Socket etc
		
		String input = null;
		try(BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter something here ");
			input = bufr.readLine();
			System.out.println("--> "+input);
			
		}
		
	}

}
