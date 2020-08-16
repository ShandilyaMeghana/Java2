package collection_ArrayListandSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "India");
		hm.put(1, "KING");
		hm.put(2, "August");
		hm.put(3, "Rani");
		hm.put(34, "Mouse");
		System.out.println(hm.get(34));
		hm.remove(34);
		System.out.println(hm.get(34));

		// Important
		// Get a set of the entries
		Set i = hm.entrySet();// entrySet-returns a set view of the hash map
		
		System.out.println("This is the view "+hm.entrySet());
		// Get an iterator
		Iterator it = i.iterator();
		
		while (it.hasNext()) {
			
			 // Display elements 
			Map.Entry mp = (Map.Entry) it.next();// to store key and value
			System.out.println(mp.getKey() + ":" + mp.getValue());
		}
	}

}
