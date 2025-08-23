package encapsulation;

class Parent{
	protected String surname="Sharma";
	protected void assets() {
		System.out.println("Parent's properties");
	}
}
class Child extends Parent{
	String name="Nihanth";
	protected void assets() {
		System.out.println(name+" "+surname);
		System.out.println("Child's properties");
	}
}
public class ProtectedExample {

	public static void main(String[] args) {
		Child c=new Child();
		c.assets();
	}

}
