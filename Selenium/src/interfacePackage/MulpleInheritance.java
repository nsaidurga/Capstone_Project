package interfacePackage;

interface Parent1{
	void flat();
	void car();
}
interface Parent2{
	void flat();
	void bike();
}
class Child implements Parent1,Parent2{
	public void bike() {
		System.out.println("Sports bike");
	}
	public void flat() {
		System.out.println("2BHK flat");
	}
	public void car() {
		System.out.println("Sports car");
	}
}
public class MulpleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.flat();
		c.car();
		c.bike();
	}

}
