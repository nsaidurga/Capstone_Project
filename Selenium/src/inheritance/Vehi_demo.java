package inheritance;
class Vehicle1{
	int speed=70;
}
class Car1 extends Vehicle1{
	int speed=100;
	void showspeed() {
		System.out.println("Car normal speed="+speed);
		System.out.println("Vehicle normal speed="+super.speed);
	}
}
public class Vehi_demo {

	public static void main(String[] args) {
		Car1 c=new Car1();
		c.showspeed();
	}

}
