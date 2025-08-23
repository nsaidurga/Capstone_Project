package strings;

public class Conversions {

	public static void main(String[] args) {
		String str="Hello";
		
		//convert String to stringbuffer or builder
		StringBuffer sb=new StringBuffer(str);
		sb.append(" Dear");
		System.out.println(sb);
		sb.append(" Students");
		System.out.println(sb);
		
		//convert stringbuffer/builder to string
		StringBuffer sbb=new StringBuffer("Banglore");
		String str1=new String(sbb);
		System.out.println(str1);
		
		StringBuffer sbr=new StringBuffer("Welcome ");
		System.out.println(sbr.delete(0, 1));
		System.out.println(sbr.deleteCharAt(4));
	}

}
