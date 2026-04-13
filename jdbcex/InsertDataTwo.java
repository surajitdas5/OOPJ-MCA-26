package jdbcex;
//S-1
import java.sql.*;
import java.util.Scanner;

public class InsertDataTwo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String driver = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Mobile: ");
			long mobile = Long.parseLong(sc.nextLine());
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Password: ");
			String pass = sc.next();
			// S-2
			Class.forName("org.postgresql.Driver");
			//S-3
			Connection con = DriverManager.getConnection(driver, username, password);
//			S-4
			String qry = "INSERT INTO mca_user(name, mobile, email, password) VALUES('"+name+"',"+mobile+",'"+email+"', '"+pass+"')";
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
//			S-5
			if(i==1) {
				System.out.println("Row(s) Inserted");
			}
			// S-6
			con.close();
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		}

	}

}
