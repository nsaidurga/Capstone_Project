package Basic_module;

class Animal{
	void eat(String eats) {
		System.out.println("Eats="+eats);
	}
	void drink(String drinks) {
		System.out.println("Drinks="+drinks);
	}
	void sound(String sd) {
		System.out.println("Sound="+sd);
	}
}
class DomesticAnimals extends Animal{
	void lives(String live) {
		System.out.println("Lives int the "+live);
	}
}

public class Animal_demo {

	public static void main(String[] args) {
		System.out.println("******Dog******");
		DomesticAnimals dog=new DomesticAnimals();
		dog.eat("Non veg");
		dog.sound("Bow bow");
		dog.lives("city");
		
		System.out.println("******Cat******");
		DomesticAnimals cat=new DomesticAnimals();
		cat.drink("Milk");
		cat.sound("Meow");
		cat.lives("home");
		
		System.out.println("******Cow******");
		DomesticAnimals cow=new DomesticAnimals();
		cow.drink("seed water");
		cow.sound("Amba");
		cow.lives("farm");
	}

}
