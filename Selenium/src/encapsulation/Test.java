package encapsulation;

public class Test {
	void setname(String name) {
		System.out.println(name);
	}
	void getname() {
		this.setname("Sai");
		System.out.println("Welcome to java learning sessions");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.getname();
	}

}
