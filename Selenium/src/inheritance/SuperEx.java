package inheritance;
class SoftwareTesting{
	void Sysllabus() {
		System.out.println("Software testing course details");
		System.out.println("Manual testing,Core Java , Selenium Webdriver,Jira(Project Management),Mysql(db)");
		System.out.println("Fees 50000");
	}
}
class Manual extends SoftwareTesting{
	void manualTesting() {
		super.Sysllabus();
		System.out.println("If it is manual testing only \n then it includes Manual testing concepts,jira,mysql,postman and ");
	}
}
class Automation extends SoftwareTesting{
	void automationTesting() {
		super.Sysllabus();
		System.out.println("If it is manual testing only \n then it includes Manual testing concepts,jira,mysql,postman and ");
	}
}
public class SuperEx {

	public static void main(String[] args) {
		System.out.println("ManualTesting");
		Manual mn=new Manual();
		mn.manualTesting();
		System.out.println("AutomationTesting");
		Automation auto=new Automation();
		auto.automationTesting();
	}

}
