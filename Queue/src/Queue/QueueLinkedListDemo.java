package Queue;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		QueueLinkedList<String> q = new QueueLinkedList<String>();
		q.Queue("Hoque");
		q.Queue("Nader");
		q.Queue("Borlain");

		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());


	}

}
