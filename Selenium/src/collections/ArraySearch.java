package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(34);
		a.add(27);
		a.add(76);
		a.add(12);
		a.add(8);
		if(a.contains(27)) {
		System.out.println("it is in list at "+ a.indexOf(27));
		}
		else {
			System.out.println("Not in list");
		}
		
		//convert 
		int arr[]=new int[6];
		int i=0;
		for(int n:a) {
			arr[i]=n;
			i++;
		}
		for(int j:arr) {
		System.out.print(j+" ");
		}
		System.out.println();
		;
		System.out.println(Arrays.toString(arr));
		//Merge 
		
		ArrayList<String> st=new ArrayList<>();
		st.add("apple");
		st.add("babana");
		st.add("grape");
		ArrayList<String> st1=new ArrayList<>();
		st.add("pinapple");
		st.add("guava");
		st.add("apple");
		
		for(String s:st1) {
			if(!st.contains(s)) {
				st.add(s);
			}
		}
		for(String s:st) {
			System.out.println(s);
		}
	}

}
