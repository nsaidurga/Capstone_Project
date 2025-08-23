package conditional;

public class IF_Else {

	public static void main(String[] args) {
		int age=17;
		boolean hasId=true;
		boolean isStudent=true;
		
		if(age>=18 && hasId) {
			System.out.println("the person is allowed");
		}
		else {
			System.out.println("not allowed");
		}
	}

}
