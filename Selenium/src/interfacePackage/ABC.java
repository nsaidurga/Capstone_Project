package interfacePackage;

interface Animall{
	static String name="Animal";
	String name1="Not Animal";
	void eat();
	void sound();
	default void show() {
		System.out.println("Hello");
	}
}
class Dogg implements Animall{
	public void eat() {
		System.out.println("Royal canin");
	}
	public void sound() {
		System.out.println("Barking");
	}
}
public class ABC {

	public static void main(String[] args) {
		Dogg max=new Dogg();
		max.eat();
		max.sound();
		System.out.println(Animall.name);
		System.out.println(Animall.name1);
	}

}
