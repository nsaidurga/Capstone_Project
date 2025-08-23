package encapsulation;

public class Login {
	public String username;
	private String password;
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getUsername() {
		System.out.println("Username is "+username);
		return username;
	}
	public String getPassword() {
		System.out.println("Password is secure");
		return password;
	}
	public static void main(String[] args) {
		Login n=new Login();
		n.setUsername("saikiran");
		n.setPassword("sai#1223");
		n.getUsername();
		n.getPassword();
	}

}
