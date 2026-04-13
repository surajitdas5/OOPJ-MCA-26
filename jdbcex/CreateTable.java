package jdbcex;
//S-1
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		try {
			String driver = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			// S-2
			Class.forName("org.postgresql.Driver");
			//S-3
			Connection con = DriverManager.getConnection(driver, username, password);
//			if(con != null) {
//				System.out.println("Connected...");
//			}
//			S-4
			String qry = "CREATE table mca_user(id serial, name varchar(255), mobile numeric(10), email varchar(255), password varchar(255))";
			Statement smt = con.createStatement();
			int i = smt.executeUpdate(qry);
//			S-5
			if(i==0) {
				System.out.println("Table Created");
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
