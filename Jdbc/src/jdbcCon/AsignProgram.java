package jdbcCon;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AsignProgram {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/MydbSel";
		String user="root";
		String password="root";
		
		/*
		String sql="create table student(rno int,"
				+"name varchar(50),"
				+"per int,"
				+"city varchar(30),"
				+"depno int)";
		
		String insertSQL="insert into student values(432,'Anil',87,'Vizag',3),"
				+ "(367,'Nikil',77,'Vizianagaram',2),"
				+"(263,'Sai',91,'Vijayawada',1),"
				+"(345,'Durga',80,'Ongole',2)";
		
		*/
		
		/*String table2="create table institute("
				+"depName varchar(50),"
				+"depno int)";
		
		String insertSQL="insert into institute values('CSE',3),"
				+ "('ECE',2),"
				+"('MECH',1),"
				+"('EEE',2)";
		
		*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			
			Statement stmt=con.createStatement();
			//stmt.executeUpdate(sql);
			//stmt.executeUpdate(table2);
			System.out.println("Students table created");
			
			/*
			int rowInserted=stmt.executeUpdate(insertSQL);
			
			if(rowInserted>0) {
				System.out.println(rowInserted+" new student records inserted");
			}
			*/
			ResultSet rs=stmt.executeQuery("Select * from student");
			//print
			System.out.println("Rno\t Name\t Perce \t City \t \t Department");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				
				String city=rs.getString("city");
				int dno=rs.getInt("depno");
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+city+"\t \t"+dno);
			}
			rs.close();
			
			
			//update
			String newPer="Update student set per=84 where rno=367";
			String t1="Update student set city='Kadapa' where rno=367";
			String t2="Update student set city='Nelore' where rno=263";
			int u1=stmt.executeUpdate(t1);
			int u2=stmt.executeUpdate(t2);
			int updated=stmt.executeUpdate(newPer);
			if(updated>0) {
				System.out.println("\nUpdated new percentage");
			}
			rs=stmt.executeQuery("select * from student");
			System.out.println("Rno\t Name\t Perce");
			while(rs.next()) {
				System.out.println(rs.getInt("rno")+"\t"+rs.getString("name")+"\t"+rs.getInt("per"));
			}
			rs.close();
			
			//highest
			rs=stmt.executeQuery("select * from student where per=(select max(per) from student)");
			System.out.println("\nHighest marks:");
			System.out.println("Rno\t Name\t Perce");
			while(rs.next()) {
				System.out.println(rs.getInt("rno")+"\t"+rs.getString("name")+"\t"+rs.getInt("per"));
			}
			rs.close();
			
			//ascending order
			rs=stmt.executeQuery("select * from student order by name asc");
			System.out.println("\n Ordered table by name");
			System.out.println("Rno\t Name\t Perce");
			while(rs.next()) {
				System.out.println(rs.getInt("rno")+"\t"+rs.getString("name")+"\t"+rs.getInt("per"));
			}
			rs.close();
			
			//same adress
			rs=stmt.executeQuery("select * from student where city in (select city from student group by city having count(*)>1)");
			System.out.println("\n Same adress students");
			System.out.println("Rno\t Name\t Perce");
			while(rs.next()) {
				System.out.println(rs.getInt("rno")+"\t"+rs.getString("name")+"\t"+rs.getInt("per")+"\t"+rs.getString("city"));
			}
			rs.close();
			
			//add new col
			//stmt.executeUpdate("Alter table student add column email varchar(30)");
			System.out.println("\nnew col added");
			
			
			//modify col datatype
			//stmt.executeUpdate("alter table student modify per float");
			System.out.println("\ndatatype changed for col per");
			
			//rename table 
			//stmt.executeUpdate("rename table student to students_info");
			System.out.println("\ntable name changed to students_info");
			
			//delet col
			//stmt.executeUpdate("alter table student drop column depno");
			System.out.println("\ndepno col deleted");
			
			//delete row
			//stmt.executeUpdate("delete from student where rno=345");
			System.out.println("\nStudent with rno 345 deleted.");
			
			//delete all rows 
			//stmt.executeUpdate("truncate table student");
			System.out.println("\nall records deleted from Student");
			
			//delete all rows 
			//stmt.executeUpdate("drop table student");
			System.out.println("\nentire Student deleted");
			
			
			
			//print updated table
			rs=stmt.executeQuery("Select * from student");
			System.out.println("\nRno\t Name\t Perce \t City \t \t Depart No");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				
				String city=rs.getString("city");
				int dno=rs.getInt("depno");
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+city+"\t \t"+dno);
			}
			rs.close();
			
			
			//inner join
			System.out.println("\nJoining two tables");
			rs=stmt.executeQuery("select * from student as s inner join institute as i on s.depno=i.depno");
			System.out.println("\nRno\tName\tPerce\tCity\t\tDeptName\tDepart No");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				
				String city=rs.getString("city");
				String dname=rs.getString("depName");
				int dno=rs.getInt("depno");
				
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+city+"\t \t"+dname+"\t\t"+dno);
			}
			rs.close();
			
			//left join
			System.out.println("\nLeft Join");
			rs=stmt.executeQuery("select * from student as s left join institute as i ON s.depno = i.depno");
			System.out.println("\nRno\tName\tPerce\tCity\t\tDeptName\tDepart No");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				
				String city=rs.getString("city");
				String dname=rs.getString("depName");
				int dno=rs.getInt("depno");
				
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+city+"\t \t"+dname+"\t\t"+dno);
			}
			rs.close();
			
			//Right join
			System.out.println("\nRight Join");
			rs=stmt.executeQuery("select * from student as s right join institute as i ON s.depno = i.depno");
			System.out.println("\nRno\tName\tPerce\tCity\t\tDeptName\tDepart No");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				
				String city=rs.getString("city");
				String dname=rs.getString("depName");
				int dno=rs.getInt("depno");
				
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+city+"\t \t"+dname+"\t\t"+dno);
			}
			rs.close();
			
			//Full join
			System.out.println("\nFull Join");
			rs=stmt.executeQuery("select * from student as c right join institute as p on c.depno=p.depno\r\n"
					+ "union\r\n"
					+ "select * from student as c left join institute as p on c.depno=p.depno;\r\n"
					+ "");
			System.out.println("\nRno\tName\tPerce\tCity\t\tDeptName\tDepart No");
			while(rs.next()) {
				int rollno=rs.getInt("rno");
				String name=rs.getString("name");
				int percent=rs.getInt("per");
				
				String city=rs.getString("city");
				String dname=rs.getString("depName");
				int dno=rs.getInt("depno");
				
				System.out.println(rollno+"\t"+name+"\t"+percent+"\t"+city+"\t \t"+dname+"\t\t"+dno);
			}
			rs.close();
			//rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
