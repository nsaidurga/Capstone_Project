package conditional;

public class GradeTest {

	public static void main(String[] args) {
		int per=36;
		
		if(per>=90) {
			System.out.println("student passed with A grade");
		}
		else if((per>=80) && (per<90)) {
			System.out.println("student passed with B grade");
		}
		else if((per>=60) && (per<80)) {
			System.out.println("student passed with C grade");
		}
		else if((per>=45) && (per<60)) {
			System.out.println("student passed with D grade");
		}
		else if((per>=35) && (per<45)) {
			System.out.println("student passed with E grade");
		}
		else if(per<35){
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
