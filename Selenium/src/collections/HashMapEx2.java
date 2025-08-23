package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(5, "Orange");
		m.put(2, "Mango");
		m.put(11, "Banana");
		m.put(18, "Watermelon");
		m.put(4, "Muskmelon");
		m.put(7, "Kiwi");
		m.put(null, "Nothing");
		m.put(null, null);
		m.put(9, "CusturdApple");
		m.put(4, "PineApple");
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		//Iterator<Map<Integer,String> map> itr=m
	}

}
