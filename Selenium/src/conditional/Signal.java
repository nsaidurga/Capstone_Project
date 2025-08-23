package conditional;

public class Signal {

	public static void main(String[] args) {
		String color = "red";

		if (color == "red") {
			System.out.println("STOP");
		} 
		else if (color == "yellow") {
			System.out.println("STOP");
		}
		else if (color == "green") {
			System.out.println("STOP");
		}
		
		else {
			System.out.println("Invalid input");
		}
	}

}
