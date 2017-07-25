package com.datastructures;

public class DynamicArrayDemo {
	public static void main(String[] args) {
		DynamicArray<Integer> a = new DynamicArray<Integer>();
		a.put(20);
		System.out.println("Size:" + a.getSize());
		a.put(15);
		System.out.println("Size:" + a.getSize());
		a.put(10);
		System.out.println("Size:" + a.getSize());
		a.put(5);
		System.out.println("Size:" + a.getSize());
		a.put(55);
		System.out.println("Size:" + a.getSize());
			System.out.println("Element Saved is:");
		for(int i=0;i<a.getSize();i++) {
			System.out.println(a.get(i));
		}
	}
	

}
