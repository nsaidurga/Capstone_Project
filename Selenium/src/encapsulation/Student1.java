package encapsulation;

class School {
	String name;
	int rno;

	School(String name, int rno) {
		this.name = name;
		this.rno = rno;
	}

	School() {
		this("Sai", 123);
	}

	void displaydetails(School sc) {
		System.out.println("Name= " + name);
		System.out.println("Rollno= " + rno);
	}

	void show() {
		displaydetails(this);
		System.out.println("Student details");
	}
}

public class Student1 extends School {

	Student1() {
		super();
	}

	public static void main(String[] args) {
		System.out.println("............");
		School s = new School();
		s.show();
		Student1 a = new Student1();
	}

}
