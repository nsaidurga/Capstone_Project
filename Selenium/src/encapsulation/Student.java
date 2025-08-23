package encapsulation;

public class Student {
	private String name="Sai";
	private int age=23;
	public String setName() {
		return name;
	}
	public int setAge() {
		return age;
	}
	public void getNameAge() {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.getNameAge();
	}

}
