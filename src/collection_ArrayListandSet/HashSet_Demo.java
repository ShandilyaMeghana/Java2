package collection_ArrayListandSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		/*
		 * HashSet. TreeSet, LinkedSet implements Set cannot have duplicate
		 * values. The order of elements is random in nature
		 */

		HashSet<String> hs = new HashSet<String>();
		hs.add("UK");
		hs.add("India");
		hs.add("Bhutan");
		hs.add("India");
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs.size() + "\n" + hs);

		// Iterator Example
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
