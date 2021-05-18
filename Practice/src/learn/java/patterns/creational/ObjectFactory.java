package learn.java.patterns.creational;

public class ObjectFactory {

	public Animal getAnimal(String animal)
	{
		Animal animalObj;
		
		if("Rabbit".equals(animal)) {
			animalObj = new Rabbit();
		}
		else if ("Goat".equals(animal)) {
			animalObj = new Goat();
		}else {
			animalObj = new Cow();
		}
		
		return animalObj;
	}
	
}
