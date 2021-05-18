package learn.java.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Stream API - filter() for even numbers and count");
		
		List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		long count = list.stream().filter(i -> i%2==0).count();
		
		System.out.println("Count --> "+count);
		
		evenList.forEach(i -> System.out.println(i));
		
		List<Integer> unsortedList = Arrays.asList(10,2,13,42,5);
		
		List<Integer> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted list  --> "+sortedList);
		
		
		System.out.println("Stream API - map() to increment the values by 1");
		
		List<Integer> mappedList = list.stream().map(i -> i+1).collect(Collectors.toList());
		
		//mappedList.forEach(i -> System.out.println(i));
		
		System.out.println(mappedList);
		
		/*List<String> names = Arrays.asList("Ab", "Ac", "Bb", "Bc");
		
		List<String> processedNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		
		processedNames.forEach(name -> System.out.println(name));*/
	}

}
