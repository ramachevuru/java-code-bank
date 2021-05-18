package learn.java.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		
		/*integers.forEach(i -> {
		    try {
		        System.out.println(50 / i);
		    } catch (ArithmeticException e) {
		        System.err.println(
		          "Arithmetic Exception occured : " + e.getMessage());
		    }
		});*/
		
		integers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));

	}
	
	static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
	    return i -> {
	        try {
	            consumer.accept(i);
	        } catch (ArithmeticException e) {
	            System.err.println(
	              "Arithmetic Exception occured : " + e.getMessage());
	        }
	    };
	}

}
