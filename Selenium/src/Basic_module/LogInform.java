package Basic_module;

import java.util.Scanner;

public class LogInform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username:");
		String name = sc.nextLine();

		System.out.println("Enter Password:");
		Long pno = sc.nextLong();

		sc.nextLine();

		System.out.println("Enter your email:");
		String email = sc.nextLine();
	}

}
