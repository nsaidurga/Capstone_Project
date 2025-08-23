package OtherPrograms;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(56);
		numbers.add(45);
		numbers.add(98);
		numbers.add(24);
		numbers.forEach((n) -> {
			System.out.println(n);
		});
		
		System.out.println("Using Consumer..:");
		
		Consumer<Integer> myMethod=(n)->{
			System.out.println(n);
		};
		numbers.forEach(myMethod);
	}

}
