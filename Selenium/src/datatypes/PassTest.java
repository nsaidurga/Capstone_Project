package datatypes;

public class PassTest {
	public static void isUsername(String username) {
		username="Username";
	}
	public static void changePassword(String password) {
		password="NwePassword";
	}
	public static void main(String[] args) {
		//String username="OldUsername";
		String password="OldPassword";
		
		changePassword(password);
		//System.out.println(isUsername("sai"));
		System.out.println("Password method="+password);
	}

}
