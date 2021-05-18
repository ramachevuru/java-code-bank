package learn.java.java8.features;

interface Sayable {
	void say();
	
	//void display(String str); Need to look into this
	
	default String show() {
		return "default show";
	}

	default String display() {
		return "default display";
	}
}

public class StaticMethodReference {

	public static void saySomething() {
		System.out.println("Hello, say()");
	}
	
	/*public static String saySomething() {
		System.out.println("Hello, say()");
		return "";
	}*/
	
	/*public static void displayThis(String s) {
		System.out.println("display() "); 
	}*/
	
	public static String showThis() {
		System.out.println("Hello, show() ");
		return "Hello";
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = StaticMethodReference::saySomething;
		sayable.say();
		
		/*Sayable sayable2 = StaticMethodReference::displayThis;
		sayable2.display("hello");*/
		
		Sayable sayable1 = StaticMethodReference::showThis;
		System.out.println(sayable1.show());
	}

}
