package learn.java.patterns.creational;

public class ObjectCreationFactory {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ObjectFactory factory = new ObjectFactory();
		Animal animal = factory.getAnimal("Rabbit");
		
		System.out.println(animal.getClass().getName());
		
		//animal.helloThere();
	}

}
