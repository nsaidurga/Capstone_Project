package OtherPrograms;

import java.sql.*;
import java.sql.DriverManager;

public class Jdbc1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		int n=0;
		try {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/javproject", "root", "root");
			Statement s=c.createStatement();
			ResultSet r=s.executeQuery("select * from emp");
			while(r.next()) {
				n++;
			}
			System.out.println("There are "+n+" records present");
			c.close();
			s.close();
			r.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
