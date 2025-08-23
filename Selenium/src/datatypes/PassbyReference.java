package datatypes;

class UserPass{
	String username;
	String password;
}
public class PassbyReference {
	static void updateCredentials(UserPass up) {
		up.username="admin123";
		up.password="Pass@123";
	}
	public static void main(String[] args) {
		UserPass up=new UserPass();
		up.username="User123";
		up.password="User@123";
		updateCredentials(up);
		System.out.println("Username="+up.username);
		System.out.println("Password="+up.password);
	}

}
