package inheritance;
class Animal{
	void eat() {
		System.out.println("Eating");
	}
	void sound() {
		System.out.println("Sound");
	}
}
class Dogg{
	void eat() {
		System.out.println("Eating=Chicken");
	}
	void sound() {
		System.out.println("Sound=Bow bow");
	}
}
class Tiger{
	void eat() {
		System.out.println("Eating=Non veg");
	}
	void sound() {
		System.out.println("Sound=roar");
	}
}
public class MethodOverring {

	public static void main(String[] args) {
		System.out.println("----Dog----");
		Dogg d=new Dogg();
		d.eat();
		d.sound();
		
		System.out.println("----Tiger----");
		Tiger t=new Tiger();
		t.eat();
		t.sound();
	}

}
