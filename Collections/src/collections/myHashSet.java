package collections;
//Cannot have duplicates

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class myHashSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ls = new HashSet<String>();
		ls.add("John");
		ls.add("Wayne");
		ls.add("Wayne");
		
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
