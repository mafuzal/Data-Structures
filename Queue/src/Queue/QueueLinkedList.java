package Queue;

import java.util.Arrays;

public class QueueLinkedList<T> {
	DoubleLLNode Rear;
	DoubleLLNode Front;
	
	public QueueLinkedList() {
		Rear = null;
		Front = null;
	}

	public void Queue(Object value) {
		DoubleLLNode newNode = new DoubleLLNode(value, null, null);
		if (Rear == null || Front == null) {
			Rear = newNode;
			Front = newNode;
		} else {
			newNode.next = null;
			newNode.previous = Rear;
			Rear.next = newNode;
			Rear = newNode;
		}
	}

	public T DeQueue() {
		if (Rear == null || Front == null) {
			System.out.println("Queue is Empty");
			return null;

		}
		T value = (T) Front.value;
		Front = Front.next;
		if (Front != null) {
			Front.previous = null;
		}
		return value;
	}

}
