package interfacePackage;

interface Doctor{
	void operation();
	void OPD();
}

interface Nurse{
	void dailycheck();
	void documentation();
}

interface Accountant{
	void payment();
	void query();
}

class Patient implements Doctor,Nurse{
	public void operation() {
		System.out.println("Patient went for an operation to doctr");
	}
	public void OPD() {
		System.out.println("Patient go for opd");
	}
	public void dailycheck() {
		System.out.println("Patient needs daily checkup by nurse");
	}
	public void documentation() {
		System.out.println("Doctor needs documentation regarding patient condition");
	}
	public void payment() {
		System.out.println("Patient want payment details");
	}
	public void query() {
		System.out.println("Patient asks queries regarding medicines or treatment details");
	}
}



public class HosptalDemo {

	public static void main(String[] args) {
		Patient p=new Patient();
		p.operation();
		p.OPD();
		p.dailycheck();
		p.documentation();
		p.payment();
		p.query();
	}

}
