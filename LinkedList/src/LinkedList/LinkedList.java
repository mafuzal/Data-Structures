package LinkedList;

public class LinkedList<T> {
	Node head;

	public LinkedList() {
		head = null;
	}

	// Adding a Node
	public void add(Object value) {
		// Make a new and empty node
		Node newNode = new Node(value, null);
		// if it is the the first node, set the head to null
		if (head == null) {
			head = newNode;
		} else {
			// make the new head refer to the head
			newNode.next = head;
			head = newNode;

		}

	}
	
	public void delete() {
		head = head.next;
	}
	public void display() {
		Node n = head;
		while(n!=null) {
			System.out.println((T)n.value);
			n = n.next;
		}
	}
}
