package collections;

import java.util.Map;
import java.util.TreeMap;
//no duplicates allowed
//Tree map does not allow a single null , follows alphabetical dictionary order
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<String,String> m=new TreeMap<>();
		m.put("One", "Orange");
		m.put("Four", "Mango");
		m.put("Three", "Banana");
		m.put("Five", "Watermelon");
		m.put("Ten", "Muskmelon");
		m.put("Nine", "Kiwi");
		//m.put(null, "Nothing");
		//m.put(null, null);
		m.put("Nine", "CustApple");
		System.out.println(m);
		
		System.out.println(m.get("Five"));
		m.replace("Nine", "CusterdApple");
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println(m.containsValue("Mango"));
		
		System.out.println(m.ceilingKey("Nines"));
		System.out.println(m.floorKey("Nines"));
		System.out.println(m.lowerKey("Nines"));
		System.out.println(m.higherKey("Nines"));
		System.out.println(m.getOrDefault("Nine", "CusturdApple"));
		
	}

}
