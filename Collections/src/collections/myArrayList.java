package collections;

import java.util.ArrayList;
import java.util.List;

public class myArrayList {
	public static void main(String[]args) {
		//Good to only use for fetching data
		//If Data is removed, then the index changes 
		//Therefore, there will be lots of updates.
		ArrayList<String> a = new ArrayList<String>();
		a.add("Developer");
		a.add("Tester");
		a.add("Manager");
		
		for(String st:a) {
			System.out.println(st);
		}
		
		ArrayList<employee> emp = new ArrayList<employee>();
		emp.add(new employee("John",25));
		emp.add(new employee("Bryan",30));
		emp.add(new employee("Jill",35));
		
		for(employee st:emp ) {
			System.out.println(st.age);
		}
	}


static class employee {
	String name;
	int age;

	public employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
}
