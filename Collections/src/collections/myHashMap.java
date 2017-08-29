package collections;

import java.util.HashMap;
import java.util.Map;

public class myHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(18, "John");
		map.put(40, "Bird");
		map.put(10, "Yen");
		System.out.println(map.get(40));
		for(Map.Entry m:map.entrySet() ) {
			System.out.println("Key:" + m.getKey() +", Value:"+ m.getValue());
		}
		
		map.put(10, "Diana");
		System.out.println(map.get(10));

	}

}
