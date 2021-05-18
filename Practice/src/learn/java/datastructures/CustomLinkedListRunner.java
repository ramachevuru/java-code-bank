package learn.java.datastructures;

public class CustomLinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomLinkedList cList = new CustomLinkedList();
		
		cList.insert("A");
		cList.insert("B");
		//cList.insert("B");
		//cList.insert("A");
		cList.insert("D");
		
		System.out.println("Original LinkedList --> "); 
		cList.show();
		
		System.out.println("Reversed LinkedList --> "); 
		cList.reverseLinkedList();
		
		//cList.removeDups();
		/*cList.insertAtStart("AA");
		cList.insertLast("Z");
		
		cList.insertAt(1, "P");
		cList.insertAt(1, "Q");*/
		//cList.insertAt(2, "P");
		
		//cList.show();
		
	}

}
