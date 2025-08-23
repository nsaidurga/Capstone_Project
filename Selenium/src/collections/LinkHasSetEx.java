package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHasSetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lin=new LinkedHashSet<String>();
		lin.add("Maggi");
		lin.add("Pasta");
		lin.add("Water");
		lin.add("Chocolate");
		lin.add("Water");
		lin.add(null);
		lin.add(null);
		System.out.println(lin);
		System.out.println(lin.clone());
		System.out.println(lin.contains("Pasta"));
		System.out.println(lin.isEmpty());
		System.out.println(lin.getFirst());
		System.out.println(lin.getLast());
		Iterator<String> itr=lin.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
