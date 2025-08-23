package SwitchEx;

public class DressSize {

	public static void main(String[] args) {
		int size=17;
		
		switch(size) {
		
		case 26:
			System.out.println("Extra Small");
			break;
		case 28:
			System.out.println("Small size");
			break;
		case 30:
			System.out.println("Medium size");
			break;
		case 32:
			System.out.println("Large");
			break;
		case 34:
			System.out.println("Extra Large");
			break;
		case 36:
			System.out.println("Extra Extra Large");
			break;
		default:
			System.out.println("Invalid size");
		}
	}

}
