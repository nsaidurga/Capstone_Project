package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Maggi");
		set.add("Pasta");
		set.add("Water");
		set.add("Chocolate");
		set.add("Water");
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		set.remove("Water");
		System.out.println(set);
		set.add("Oil");
		System.out.println(set);
		//set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//System.out.println(set);
	}

}
