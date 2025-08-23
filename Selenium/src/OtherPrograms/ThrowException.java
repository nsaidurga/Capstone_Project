package OtherPrograms;

public class ThrowException {

	public static void main(String[] args) {
		try {
			int age=-5;
			if(age<0) {
				throw new IllegalArgumentException("Age can not be negative");
			}
			System.out.println("Your Age is "+age);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
	}

}
