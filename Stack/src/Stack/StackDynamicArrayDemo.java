package Stack;

public class StackDynamicArrayDemo {
	public static void main(String[] args) {
		StackDynamicArray<Integer> st = new StackDynamicArray<Integer>(2);
		st.push(12);
		st.push(10);
		System.out.println("Size Stack:" + st.getSize());
		st.push(19);
		System.out.println("Size Stack:" + st.getSize());
	}

}
