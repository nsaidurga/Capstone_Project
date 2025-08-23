package inheritance;
class Vehicle{
	void start(String st) {
		System.out.println("Statrt with "+st);
	}
	void stop(String sp) {
		System.out.println("Stop with "+sp);
	}
}
class Car extends Vehicle{
	void typeOfCar(String type){
		System.out.println(type+" car");
	}
	void noOfSeats(int st) {
		System.out.println("Number of seats= "+st);
	}
}
class Baleno extends Car{
	void color(String color) {
		System.out.println("Color is="+color);
	}
}
class Ertica extends Car{
	void color(String color) {
		System.out.println("Color is="+color);
	}
}
class Scooter extends Vehicle{
	void tyOfScooter(String type) {
		System.out.println(type+" Scooter");
	}
	void noOfSeats(int st) {
		System.out.println("Number of seats="+st);
	}
}
class Activa extends Scooter{
	void speed(int sp) {
		System.out.println("Speed "+sp);
	}
}
public class Vehicle_family {

	public static void main(String[] args) {
		System.out.println("*********Baleno*********");
		Baleno b=new Baleno();
		b.start("key or button");
		b.stop("key or button");
		b.typeOfCar("Petrol");
		b.noOfSeats(4);
		b.color("red");
	}

}
