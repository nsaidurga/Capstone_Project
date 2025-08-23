package enumEx;
interface Animal{
	void color();
	void sound();
}
enum Dog implements Animal{
	Max,Neo;
	public void color() {
		System.out.println(Dog.Max+" is brown color");
	}
	public void sound() {
		System.out.println(Dog.Neo+" bow bow");
	}
}
public class EnumIf {

	public static void main(String[] args) {
		Dog.Max.color();
		Dog.Neo.color();
		Dog.Max.sound();
		Dog.Neo.sound();
		System.out.println();
		Dog d1=Dog.Neo;
		if(d1==Dog.Max) {
			d1.color();
		}
		else {
			d1.sound();
		}
	}

}
