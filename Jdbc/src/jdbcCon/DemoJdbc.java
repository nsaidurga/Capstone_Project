package jdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/MydbSel";
		String user="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		//create statemnet
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from emp");
		System.out.println("Id\tName\t\tSalary");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int salary=rs.getInt("salary");
			System.out.println(id+"\t"+name+"\t"+salary);
		}
		rs.close();
		stmt.close();
		con.close();
	}

}

/*
While(rs.next()){
	int id=rs.getInt("id");
	String name=rs.getString("name");
	int sal=rs.getInt("salary");
	sysout(id+sal+sal);
*/