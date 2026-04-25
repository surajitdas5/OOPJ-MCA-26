package jdbcex;
import java.sql.*;

public class DBMetaData {

	public static void main(String[] args) {
		try {
			String driver = "org.postgresql.Driver";
			String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
			String username = "25mmca01";
			String password = "25mmca01";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connection_url, username, password);
			
			DatabaseMetaData meta = con.getMetaData();
			System.out.println("Database Name: "+meta.getDatabaseProductName());
			System.out.println("Database Version: "+meta.getDatabaseProductVersion());
			System.out.println("Username: "+meta.getUserName());
			System.out.println("Connection URL: "+meta.getURL());
			System.out.println("Driver Name: "+meta.getDriverName());
			System.out.println("Driver Version: "+meta.getDriverVersion());
			
//			ResultSet tables = meta.getTables("mca_25_db", "schema_25mmca01", "%", new String[] {"TABLE"});
			ResultSet tables = meta.getTables("mca_25_db", "schema_25mmca01", "s%", new String[] {"TABLE"});
			while(tables.next()) {
				String tname = tables.getString("TABLE_NAME");
				System.out.println(tname);
			}
			
			con.close();
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
