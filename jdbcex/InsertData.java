package jdbcex;
//S-1
import java.sql.*;

public class InsertData {

	public static void main(String[] args) {
		try {
			String driver = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			// S-2
			Class.forName("org.postgresql.Driver");
			//S-3
			Connection con = DriverManager.getConnection(driver, username, password);
//			S-4
//			String qry = "INSERT INTO mca_user(name, mobile, email, password) VALUES('Sam', 7894562325, 'sam@gmail.com', '12345')";
			String qry = "INSERT INTO mca_user(name, mobile, email, password) VALUES('Sam', 7894562325, 'sam@gmail.com', '12345'),('John', 9874562325, 'john@gmail.com', '12345')";
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
//			S-5
//			if(i==1) {
			if(i==2) {
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
