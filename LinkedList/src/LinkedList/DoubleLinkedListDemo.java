package LinkedList;

public class DoubleLinkedListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList<String> ls  = new DoubleLinkedList<String>();
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
