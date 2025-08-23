package jdbcCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrepareStateEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/MydbSel";
		String username="root";
		String password="root";
		ArrayList<Integer> rno=new ArrayList<>(List.of(123,124,125,127,131));
		ArrayList<String> nam=new ArrayList<>(List.of("sai","nikhil","akhil","varun","harsha"));
		ArrayList<Integer> ag=new ArrayList<>(List.of(21,20,22,23,21));
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection(url,username,password);
		String query="Insert into student1(rollno,name,age) values(?,?,?)";
		PreparedStatement pst=c.prepareStatement(query);
		
		for(int i:rno) {
			pst.setInt(1, i);
		}
		for(String i:nam) {
			pst.setString(2, i);
		}
		for(int i:ag) {
			pst.setInt(3, i);
		}
		
		for(int i=0;i<3;i++) {
			pst.setInt(1, rno.get(i));
			pst.setString(2, nam.get(i));
			pst.setInt(3, ag.get(i));
			pst.executeUpdate();
		}
	}

}
