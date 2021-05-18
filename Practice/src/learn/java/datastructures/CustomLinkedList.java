package learn.java.datastructures;

import java.util.HashSet;
import java.util.Set;

public class CustomLinkedList {

	Node head;
	
	public void insert(String data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}	
	}
		
	public void insertAtStart(String data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		
		head = node;
		
		/*System.out.println("insertAtStart");
		show();*/
	}
	
	public void insertAt(int index, String data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node current = head;
		Node prev = null;
		Node next = null;
		
	    int counter = 0;
		
		while(counter < index) {
			
			next = current.next;
			prev = current;
			current = next;
			
			counter++;
			
		}
		
		node.next = current;
		prev.next = node;
		
		/*System.out.println("insertAt");
		show();*/
	}
	
	public void insertLast(String data) {
		
		insert(data);
		
	}
	
	public void removeDups() {
		
		Set<String> set = new HashSet<String>();
		Node prev = null;
		Node node = head;
		
		while(node.next != null) {
			if(set.contains(node.data)) {
				prev.next = node.next;
			}else {
				set.add(node.data);
				prev = node;
			}
			node = node.next;
		}
		
		//show();
	}
	
	public void reverseLinkedList() {
		
		Node rest = reverse(head); 
		
		while(rest.next != null) {
			System.out.println(rest.data);
			rest = rest.next;
		}
		System.out.println(rest.data);
		
		/*Node prev = null;
		Node current = head;
		Node next = null;
		
		//Node node = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;*/
		
	        
	}
	
	private Node reverse(Node head) {
		// TODO Auto-generated method stub
		
		if (head == null || head.next == null) 
            return head; 
		
		Node rest = reverse(head.next); 

		head.next.next = head;

		head.next = null; 
 
        return rest; 
	}

	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}
