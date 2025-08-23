package Basic_module;

public class StudentDetails {
	int rno,age;
	float per;
	String name;
	static String collegename="JVM";
	void details(int rno1,int age1,String name1,float per1) {
		rno=rno1;
		age=age1;
		name=name1;
		per=per1;
		
		System.out.println("Rollno="+rno);
		System.out.println("Age="+age);
		System.out.println("Percentage="+per);
		System.out.println("Name="+name);
		System.out.println("Collegename="+collegename);
	}
	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.details(112,21,"Sai",87.04f);
		s.details(123,22,"Nikil",81.04f);
		s.details(312, 21, "Vinay", 91.04f);
	}

}
