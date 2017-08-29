package Stack;

public class StackArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray<Integer> st = new StackArray<Integer>(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		st.pop();
	

	}

}
