package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<>();
		m.put("One", "Orange");
		m.put("Four", "Mango");
		m.put("Three", "Banana");
		m.put("Five", "Watermelon");
		m.put("Ten", "Muskmelon");
		m.put("Nine", "Kiwi");
		m.put(null, "Nothing");
		m.put(null, null);
		m.put("Nine", "CusturdApple");
		System.out.println(m);
		m.put("Nine","CusturdApple");
		System.out.println(m);
		System.out.println(m.get("Five"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println(m.containsValue("Mango"));
		//System.out.println(m.compute(null,null));
		System.out.println(m.replace("Ten", "Musk"));
	}

}
