package Basic_module;

import java.util.Scanner;

public class RegistrationForm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your phone no:");
		Long pno=sc.nextLong(); 
		
		sc.nextLine();
		
		System.out.println("Enter your email:");
		String email=sc.nextLine();
		
		System.out.println("Enter your username:");
		String username=sc.nextLine();
		
		System.out.println("Enter your password:");
		String password=sc.nextLine();
		
		System.out.println("Confirm password:");
		String cPassword=sc.nextLine();
		
		System.out.println("Registration details:..");
		System.out.println("Full Name     :"+name);
		System.out.println("Phone no      :"+pno);
		System.out.println("Email         :"+email);
		System.out.println("Username      :"+username);
		System.out.println("Password      :"+password);
		System.out.println("CPassword     :"+cPassword);
		
		if(password.length()==cPassword.length()) {
			if(password.equals(cPassword)) {
				System.out.println("Password matches");
			}
		}
		else {
			System.out.println("Password not matches");
		}
	}

}
