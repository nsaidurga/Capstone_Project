package interfacePackage;
abstract class Animal{
	static String name="sai";
	String name1="sai";
	void eat() {
		System.out.println("Eating");
	}
	abstract void sound();
}
class Dog extends Animal{
	void sound() {
		System.out.println("Sound=Barking");
	}
}
class Tiger extends Animal{
	void sound() {
		System.out.println("sound=Roar");
	}
}
public class Animal_Abstract {

	public static void main(String[] args) {
		System.out.println("Dog.....");
		Dog d=new Dog();
		d.sound();
		System.out.println("Tiger.....");
		Tiger t=new Tiger();
		t.sound();
		
	}

}
