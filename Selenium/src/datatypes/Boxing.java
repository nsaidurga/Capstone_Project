package datatypes;

public class Boxing {

	public static void main(String[] args) {
		//Autoboxing(Convert primitive to wrapper
		int n=10;
		Integer n1=n;
		System.out.println("Wrap data="+n1);
		
		//Unboxing
		Integer a=20;
		int b=a;
		System.out.println("Primitive data type in="+b);
		
		String str="12345";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String s=Integer.toString(n);
		System.out.println(s);
		
		String r="Sai14";
		int digCount=0;
		int charCount=0;
		for(char c:r.toCharArray()) {
			if(Character.isDigit(c)) {
				System.out.println(c+" is a digit");
				digCount++;
			}
			else {
				System.out.println(c+" is not a digit");
				charCount++;
			}
		}
		System.out.println("Digit count: "+digCount);
		System.out.println("Digit count: "+charCount);
		
		//char c='s';
		//if(Character.isD)
	}

}
