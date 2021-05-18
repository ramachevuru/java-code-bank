package learn.java.java8.features;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(1,2,3,4);
		
		values.forEach(i -> System.out.println(i));
		
	}

}
