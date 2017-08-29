package Queue;

public class QueueDynamicDemo {

	public static void main(String[] args) {
		QueueDynamicArray<Integer> q = new QueueDynamicArray<Integer>(2);
		q.Queue(5);
		q.Queue(4);
	
		System.out.println("Size:" + q.getSize());
		q.Queue(14);
		
		System.out.println("Size:" + q.getSize());
	

	}

}
