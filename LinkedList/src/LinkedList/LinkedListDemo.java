package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls  = new LinkedList<String>();
		ls.add("Hicks");
		ls.add("Wayne");
		ls.add("Rayan");
		System.out.println("Before:");
		ls.display();
		ls.delete();
		System.out.println("After: ");
		ls.display();
		
		

	}

}