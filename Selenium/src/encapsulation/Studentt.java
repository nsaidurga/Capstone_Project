package encapsulation;

public class Studentt {
	int rollno,age;
	String name,collegename,address;
	float per;
	void details(int rollno,String name,float per) {
		this.rollno=rollno;
		this.name=name;
		this.per=per;
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("Percentage="+per);
	}
	void details(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
	}
	public static void main(String[] args) {
		Studentt s=new Studentt();
		s.details(121, "Kumar", 88.04f);
		System.out.println();
		s.details(101, "Ravi");
	}

}
