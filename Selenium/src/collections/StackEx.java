package collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(19);
		s.push(9);
		s.add(0, null);
		s.push(31);
		s.push(5);
		s.push(14);
		//System.out.println(s.hashCode());
		System.out.println(s);
		//s.pop();
		System.out.println(s.pop());
		System.out.println("pop"+s);
		System.out.println(s.peek());
		//In stack last element index=1 so on
		System.out.println(s.search(5));
		System.out.println(s.search(9));
		System.out.println(s.search(81));//-1
		System.out.println(s.lastIndexOf(10));
		System.out.println(s.lastIndexOf(19));
		System.out.println(s.remove(2));//
		System.out.println(s);
		System.out.println(s.lastElement());
		System.out.println(s.reversed());
	}

}
