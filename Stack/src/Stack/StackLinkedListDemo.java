package Stack;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLinkedList<String> st = new StackLinkedList<String>();
		st.pop();
		st.push("Bruce");
		st.push("Wicks");
		st.push("John");
		st.push("Aaron");
		st.push("Edris");
		st.push("Hicks");
		st.push("Vicks");
		st.push("Jason");
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
