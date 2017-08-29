package Stack;

public class StackLinkedList<T> {
	Node top;

	public StackLinkedList() {
		top = null;
	}

	// Adding a Node
	public void push(Object value) {
		// Make a new and empty node
		Node newNode = new Node(value, null);
		// if it is the the first node, set the head to null
		if (top == null) {
			top = newNode;
		} else {
			// make the new head refer to the head
			newNode.next = top;
			top = newNode;

		}

	}
	
	public T  pop() {
		if(top == null) {
			System.out.println("Stack is Empty");
			return null;
		}
		T value = (T)top.value;
		top = top.next;
		return value;
	}
	
	

}
