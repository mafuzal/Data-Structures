package com.datastructures;

import java.util.Arrays;

//Define Generic
public class DynamicArray<T> {
	//Size is flexible for dynamic arrays 
Object[] data;
int size;
	public DynamicArray() {
		size = 0;
		data = new Object[1];
		
	}
	public int getSize() {
		return data.length;
	}
	
	public T get(int index) {
		return (T) data[index];
	}
	public void put(Object element) {
		ensureCapacity(size+1);
		data[size++] = element;
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity*2;
			if(newCapacity<minCapacity)
				newCapacity = minCapacity;
			data = Arrays.copyOf(data,newCapacity);
			
		}
	}


}
