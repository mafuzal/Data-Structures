package collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class myQueue {
//Elements with priority is removed 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Basic Queue");
		Queue<Integer> q = new LinkedList<Integer>();
		 q.add(12);
		 q.add(13);
		 q.add(14);
		 q.add(15);
		 System.out.println(q.poll());
		 PriorityQueue<Student> pStudents = new PriorityQueue<Student>();
		 pStudents.add(new Student("Adam",26));
		 pStudents.add(new Student("Phil",29));
		 pStudents.add(new Student("Wayne",30));
		 System.out.println(pStudents.poll().name);

	}

}
