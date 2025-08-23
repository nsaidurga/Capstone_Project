package conditional;

public class Temperature {

	public static void main(String[] args) {
		int temp = 36;

		if (temp >= 40) {
			System.out.println("Very hot");
		} 
		else if ((temp >= 30) && (temp < 40)) {
			System.out.println("Hot");
		}
		else if ((temp >= 20) && (temp < 29)) {
			System.out.println("Warm");
		}
		else if ((temp >= 10) && (temp < 19)) {
			System.out.println("Cool");
		}
		else if (temp < 10) {
			System.out.println("very cool");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
