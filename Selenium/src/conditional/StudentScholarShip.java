package conditional;

public class StudentScholarShip {

	public static void main(String[] args) {
		int studentScore=18;
		boolean reserved=false;
		
		if(studentScore>80 && !reserved) {
			System.out.println("Scholarship is granted for student");
		}
		else {
			System.out.println("Student is not eligible for scholarship");
		}
	}

}
