package jdbcex;
// s-1
import java.sql.*;

public class Refactor {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;
		try {
			String driver = "org.postgresql.Driver";
			String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
//			S-2
			Class.forName(driver);
//			S-3
			con = DriverManager.getConnection(connection_url, username, password);
//			S-4
			String sql = "SELECT * FROM student";
			smt = con.createStatement();
//			s-5
			rs = smt.executeQuery(sql);
			System.out.println("Roll\tName\tCGPA\tStatus");
			while(rs.next()) {
				int roll = rs.getInt("roll"); // 1
				String name = rs.getString("name"); //2
				String status = rs.getString("status"); //3
				double cgpa = rs.getDouble("cgpa"); //3
				
				System.out.println(roll+"\t"+name+"\t"+cgpa+"\t"+status);
			}
//			s-6
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				rs.close();
				smt.close();
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
