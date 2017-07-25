package com.datastructures;

public class OneDimensionalArray {
	public static void main(String[] args) {
		int [] numbers = new int[5];
		numbers[0] = 20;
		numbers[1] = 5;
		numbers[2] = 10;
		numbers[3] = 11;
		numbers[4] = 11;
	
	
	for (int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}
	//array of objects 
	Student [] students = new Student[4];
	students[0] = new Student("Jake",24);
	students[1] = new Student("Wayne",23);
	students[2] = new Student("Sam",28);
	students[3] = new Student("Ethan",27);
	
	
	for (Student student:students) {
		System.out.println("Name:" + student.name+ "--Age:"+student.age );
	}
}
}