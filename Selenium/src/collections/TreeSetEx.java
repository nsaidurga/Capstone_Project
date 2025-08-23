package collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Maggi");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		set.add("Water");
		set.add("Yippi");
		//set.add(null);
		System.out.println(set);
		
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		//set.remove("Water");
		System.out.println(set);
		
		System.out.println(set.ceiling("Waters"));
		System.out.println(set.floor("Waters"));
		System.out.println(set.higher("Salt"));
		System.out.println(set.lower("Salt"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.ceiling("P"));
		System.out.println(set.ceiling("Q"));
		System.out.println(set.floor("N"));
		System.out.println(set);
	}

}
