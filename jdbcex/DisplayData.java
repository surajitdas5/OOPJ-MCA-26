package jdbcex;
// s-1
import java.sql.*;

public class DisplayData {
	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
//			S-2
			Class.forName(driver);
//			S-3
			Connection con = DriverManager.getConnection(connection_url, username, password);
//			S-4
			String sql = "SELECT * FROM student";
			Statement smt = con.createStatement();
//			s-5
			ResultSet rs = smt.executeQuery(sql);
			System.out.println("Roll\tName\tCGPA\tStatus");
			while(rs.next()) {
				int roll = rs.getInt("roll"); // 1
				String name = rs.getString("name"); //2
				String status = rs.getString("status"); //3
				double cgpa = rs.getDouble("cgpa"); //3
				
				System.out.println(roll+"\t"+name+"\t"+cgpa+"\t"+status);
			}
//			s-6
			rs.close();
			smt.close();
			con.close();
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
