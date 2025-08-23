package interfacePackage;
interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing a circle");
	}
}
class Square implements Shape{
	public void draw() {
		System.out.println("Drawing a square");
	}
}
public class ShapeExample {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		Square s=new Square();
		s.draw();
	}

}
