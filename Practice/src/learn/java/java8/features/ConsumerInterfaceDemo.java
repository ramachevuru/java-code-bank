package learn.java.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}*/

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		/*Consumer<Integer> con = new ConsImpl();
		list.forEach(con);*/
		
		/*Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};*/
		
		/*Consumer<Integer> con = (Integer i) -> 
		    {
				System.out.println(i);
			};
		*/
		
		Consumer<Integer> c = i -> System.out.println(i);
	
		//list.forEach(i -> System.out.println(i));
		
		list.forEach(c);
	}
	
}
