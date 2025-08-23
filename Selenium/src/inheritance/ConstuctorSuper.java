package inheritance;
class PrivateSchool{
	PrivateSchool(){
		System.out.println("One particular format uniform");
		System.out.println("Fixed syllabus");
		System.out.println("Follow timing between 8 and 5");
	}
}
class GovernmentSchool extends PrivateSchool{
	GovernmentSchool(){
		super();
		System.out.println("pattern of Study like 70% study and 30% sports oriented");
	}
}
public class ConstuctorSuper {

	public static void main(String[] args) {
		GovernmentSchool r=new GovernmentSchool();
	}

}
