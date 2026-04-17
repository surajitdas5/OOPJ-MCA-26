package jdbcex;
import java.sql.*;

public class DisplayData2 {
	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connection_url, username, password);
			String sql = "SELECT * FROM mca_user";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			System.out.println("ID\tName\tMobile\t\tEmail\t\tPassword");
			while(rs.next()) {
				int id = rs.getInt("id"); 
				String name = rs.getString("name");
				String email = rs.getString("email"); 
				long mobile = rs.getLong("mobile");
				String pass = rs.getString("password");
				
				System.out.println(id+"\t"+name+"\t"+mobile+"\t"+email+"\t"+pass);
			}
					
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
