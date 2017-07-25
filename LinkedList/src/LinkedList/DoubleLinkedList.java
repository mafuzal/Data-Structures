package LinkedList;

public class DoubleLinkedList<T> {
	DoubleLLNode head;

	public DoubleLinkedList() {
		head = null;
	}

	// Adding a Node
	public void add(Object value) {
		// Make a new and empty node
		DoubleLLNode newNode = new DoubleLLNode(value, null,null);
		// if it is the the first node, set the head to null
		if (head == null) {
			head = newNode;
		} else {
			// make the new head refer to the head
			newNode.next = head;
			head.previous = newNode;
			head = newNode;

		}

	}
	
	public void delete() {
		head = head.next;
	}
	public void display() {
		DoubleLLNode n = head;
		while(n!=null) {
			System.out.println((T)n.value);
			n = n.next;
		}
	}

}
