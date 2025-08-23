package strings;

public class StringMethods {

	public static void main(String[] args) {
		String s="Java";
		String str=new String("Javaa");
		char[] a= {'s','D','k'};
		String name="";
		
		System.out.println(s.charAt(3));
		System.out.println(s.copyValueOf(a));
		System.out.println(s.compareTo(str));
		System.out.println(s.equals(str));
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(2));
		System.out.println(s.codePointCount(0, 3));
		
	}

}
