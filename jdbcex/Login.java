package jdbcex;
import java.sql.*;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String driver = "org.postgresql.Driver";
			String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Password: ");
			String pass = sc.next();
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connection_url, username, password);
			String sql = "SELECT * FROM mca_user WHERE email='"+email+"' AND password='"+pass+"'";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.println("ID\tName\tMobile\t\tEmail\t\tPassword");
				int id = rs.getInt("id"); 
				String name = rs.getString("name");
				String em = rs.getString("email"); 
				long mobile = rs.getLong("mobile");
				String pa = rs.getString("password");
				
				System.out.println(id+"\t"+name+"\t"+mobile+"\t"+em+"\t"+pa);
			} else {
				System.out.println("Invalid Email or Password");
			}
					
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
