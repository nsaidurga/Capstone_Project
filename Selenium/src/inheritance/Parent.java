package inheritance;
class Sai{
	void surname() {
		System.out.println("ABC");
	}
	void flat() {
		System.out.println("2BHK flat");
	}
}
class Nikhil extends Sai{
	void job() {
		System.out.println("Officier");
	}
}
public class Parent {

	public static void main(String[] args) {
		Nikhil son=new Nikhil();
		son.surname();
		son.flat();
		son.job();
	}

}
