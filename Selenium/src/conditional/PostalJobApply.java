package conditional;

public class PostalJobApply {

	public static void main(String[] args) {
		int age=19;
		boolean pass_10th=false;
		
		if(age>=18 && pass_10th) {
			System.out.println("You are eligible for apply");
		}
		else {
			System.out.println("You are not eligible for apply");
		}
	}

}
