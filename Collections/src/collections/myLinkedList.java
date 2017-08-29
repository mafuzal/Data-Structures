package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class myLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("John");
		ls.add("Wayne");
		ls.add("Bill");
		
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
