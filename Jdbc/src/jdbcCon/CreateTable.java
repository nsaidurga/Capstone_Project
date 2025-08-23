package jdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/MydbSel";
		String user="root";
		String password="root";
		
		/*
		String sql="create table students(rno int,"
				+"name varchar(50),"
				+"per int,"
				+"email varchar(50))";
		
		String insertSQL="insert into students values(101,'Neeva sharma',98,'abc@gmail.com'),"
				+ "(102,'Reeva sharma',89,'Reeva@gmail.com'),"
				+"(103,'Shiva Upadhyay',79,'shiva@gmail.com')";
		
		*/
		String eam="Update students set email='revasharma123@gmail.com' where rno=102";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			
			Statement stmt=con.createStatement();
			//stmt.executeUpdate(sql);
			System.out.println("Students table created");
			
			//int rowInserted=stmt.executeUpdate(insertSQL);
			int rowInserted=stmt.executeUpdate(eam);
			if(rowInserted>0) {
				System.out.println(rowInserted+" new student records inserted");
			}
			
			ResultSet rs=stmt.executeQuery("Select * from students");
			System.out.println("Rollno\t Name\t Percentage\t Email");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				String email=rs.getString("email");
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+email);
			}
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
