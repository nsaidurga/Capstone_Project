package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("sai","swapna","srinu","durga","ravi");
		names.stream().filter(n->n.startsWith("s")).forEach(System.out::println);
		
		names.stream().map(n->n.toLowerCase()).forEach(System.out::println);
		
		
		List<Integer> lists=Arrays.asList(23,12,6,10,17);
		List<Integer> even=lists.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> a=Arrays.asList(26,12,31,11,54);
		List<Integer> r=a.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(r);
		
		List<String> cap=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(cap);
	}
}
