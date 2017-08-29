package Queue;

public class QueueArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray<Integer> q = new QueueArray<Integer>(5);
		q.Queue(5);
		q.Queue(4);
		q.Queue(3);
		q.Queue(2);
		q.Queue(37);
		q.Queue(22);
		
		System.out.println("Dequeue:" + q.DeQueue());
		System.out.println("Dequeue:" + q.DeQueue());
		
	}

}
