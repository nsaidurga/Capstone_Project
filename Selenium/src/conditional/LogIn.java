package conditional;

public class LogIn {

	public static void main(String[] args) {
		float sal=0;
		int credScore=0;
		if(sal>25000 && credScore>=700) {
			System.out.println("Loan is Approved");
		}
		else {
			System.out.println("Not approved");
		}
	}

}
