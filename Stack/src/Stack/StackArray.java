package Stack;

public class StackArray <T> {
	Object[] ArrayStack;
	int size;
	int top;
	public StackArray(int size) {
		this.size = size;
		ArrayStack = new Object[this.size];
		top = -1;
		
	}
	
	//Push element in the stack
		
	public void push(Object newItem) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		top = top +1;
		ArrayStack[top] = newItem;
	}
	
	public Boolean isFull() {
		return(top == size-1);
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		T item = (T) ArrayStack[top];
		top = top -1;
		return item;
		
	}
	public Boolean isEmpty() {
		return(top == -1);
	}

}
