package enumEx;

interface Any{
	void print();
}
enum Color implements Any{
	RED,GREEN,BLUE;
	public String getColorName() {
		return name();
	}
	public void print() {
		System.out.println(getColorName());
	}
}
public class EnumSpec {

	public static void main(String[] args) {
		Color.RED.print();
		Color.GREEN.print();
	}

}
