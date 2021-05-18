package learn.java.java8.features;

interface I{
	
	//void show();
	void show(String str);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		I obj, obj1;
		
		//obj = () -> System.out.println("Hello");
		
		obj1 = str -> System.out.println("Hello " +str);
		
		//obj.show();
		obj1.show("there!");
		
	}

}
