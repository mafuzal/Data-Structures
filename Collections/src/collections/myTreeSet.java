package collections;
//Use Tree Set to order alphabetically 
import java.util.TreeSet;
import java.util.Iterator;

public class myTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ls = new TreeSet<String>();
		ls.add("John");
		ls.add("Wayne");
		ls.add("Andy");
		
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
