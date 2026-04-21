package jdbcex;
// Step: 1 Import
import java.sql.*;
public class ConnecttionTest {

	public static void main(String[] args) {
		try {
//			Step 2: Load Driver
			Class.forName("org.postgresql.Driver");
//			Step 3: Establish Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.1.17:5432/mca_25_db", "25mmca01", "25mmca01"); // url, username, password
			if(con != null) {
				System.out.println("Connected...");
			}
			
			con.close();
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		}
		

	}

}
