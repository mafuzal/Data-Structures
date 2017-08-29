package HashTable;

public class HashTableArrayDemo {
	public static void main(String[] args) {
		HashTableArray<String> ls = new HashTableArray<String>(10);
		ls.put(11, "Hicks");
		ls.put(12, "Wayne");
		ls.put(13, "Rayan");

		System.out.println(ls.get(12));
	}

}
